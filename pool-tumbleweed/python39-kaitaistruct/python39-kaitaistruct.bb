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

RPM_NAME = "python39-kaitaistruct-0.10-1.5.noarch.rpm"
RPM_HASH = "dbafbe76609c244c0a33ff7733c31a946f8761f953a68ca7f5e75651e65347f1a04d4946608af67741997f3c3bc2323df18e42ec6462d1fe68ab1716e9ad0ba1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-kaitaistruct \
python39-kaitaistruct \
python3dist-kaitaistruct"

RDEPENDS:${PN} += "python-abi"

inherit rpm
