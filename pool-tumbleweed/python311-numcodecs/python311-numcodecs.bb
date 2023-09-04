SUMMARY = "Buffer compression and transformation codecs"
DESCRIPTION = "A Python package providing buffer compression and transformation codecs for use \
in data storage and communication applications."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python311-numcodecs-0.11.0-2.1.aarch64.rpm"
RPM_HASH = "b96a149cea6b4b479d08f704b7be7990e958ca8b89436f74c2ccf930d6f5ebd31c9c8d795c0f3e771bf46b449451db0c66ee4c782867c0cdb1ba871842ecf6f1"

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
python311-numpy"

inherit rpm
