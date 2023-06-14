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

RPM_NAME = "python310-kaitaistruct-0.10-1.3.noarch.rpm"
RPM_HASH = "5ca2902a80b0c323a1d3984c815c38dfcda5a0d39f775027751de14f21ee51406b775cf9a54e47ed14ef02bfd15d138713547666c4104ec9f8b5919ffc80d109"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-kaitaistruct \
python3.10dist-kaitaistruct \
python310-kaitaistruct \
python3dist-kaitaistruct"

RDEPENDS:${PN} += "python-abi"

inherit rpm
