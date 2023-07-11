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

RPM_NAME = "python310-kaitaistruct-0.10-1.5.noarch.rpm"
RPM_HASH = "6d1f8055f267928d9cb73c369b4337ea0ab6ba205ec5e91ec263002b265c37122e5fb198dd9ff1665839e5180b0463a2a3baadd0cef0193eee4ef9bce28d27cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-kaitaistruct \
python310-kaitaistruct \
python3dist-kaitaistruct"

RDEPENDS:${PN} += "python-abi"

inherit rpm
