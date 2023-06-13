SUMMARY = "Python library for kaitaistruct"
DESCRIPTION = "This library implements the Kaitai Struct API for Python. \
 \
Kaitai Struct is a declarative language used to describe various binary data \
structures, laid out in files or in memory: i.e. binary file formats, network \
stream packet formats, etc. \
 \
It is similar to Python’s [construct] and [Construct3], but it is \
language-agnostic. \
The format description is done in YAML-based .ksy format, which then can be \
compiled into a wide range of target languages."
LICENSE = "MIT"

PV = "0.10"

RPM_NAME = "python39-kaitaistruct-0.10-1.3.noarch.rpm"
RPM_HASH = "ac6baf6dc6fe28c51396fd70dd454fb66d690783e00c45dd96ba29c404ba9ffba08522d4d6c63cb4d5b72c831855dea889a666dac238971f93a3574855a6c5ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(kaitaistruct) \
python39-kaitaistruct \
python3dist(kaitaistruct)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
