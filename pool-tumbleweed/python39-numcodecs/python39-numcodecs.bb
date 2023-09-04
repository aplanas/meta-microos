SUMMARY = "Buffer compression and transformation codecs"
DESCRIPTION = "A Python package providing buffer compression and transformation codecs for use \
in data storage and communication applications."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python39-numcodecs-0.11.0-2.1.aarch64.rpm"
RPM_HASH = "4fc096469ee76175a7aac596911135ebae6635ec224acc1e5ef3b3c2668005626e96f6a3295110440c5b3dadf8dc299c2a60bada22c13cfde395f3087ca39190"

RPROVIDES:${PN} += "python3.9dist-numcodecs \
python39-numcodecs \
python3dist-numcodecs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblosc.so.1 \
libc.so.6 \
liblz4.so.1 \
libzstd.so.1 \
python-abi \
python39-numpy"

inherit rpm
