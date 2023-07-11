SUMMARY = "Buffer compression and transformation codecs"
DESCRIPTION = "A Python package providing buffer compression and transformation codecs for use \
in data storage and communication applications."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python311-numcodecs-0.11.0-1.6.aarch64.rpm"
RPM_HASH = "52a753cb393475c8e31d068d256b420b11bd2696145e232d3d6052aeb62f0319dedbad2eae87d91768a96fc67eaf3da0706ff29d6885b90b702ddc43970f0f99"

RPROVIDES:${PN} += "python3-numcodecs \
python3.11dist-numcodecs \
python311-numcodecs \
python3dist-numcodecs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblosc.so.1 \
libc.so.6 \
liblz4.so.1 \
libzstd.so.1 \
python-abi \
python311-entrypoints \
python311-numpy"

inherit rpm
