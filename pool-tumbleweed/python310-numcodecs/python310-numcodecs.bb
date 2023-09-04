SUMMARY = "Buffer compression and transformation codecs"
DESCRIPTION = "A Python package providing buffer compression and transformation codecs for use \
in data storage and communication applications."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python310-numcodecs-0.11.0-2.1.aarch64.rpm"
RPM_HASH = "5348e52fd2dc0a4993c87193918dee6123cf6bf03eab004bb847ad5d23a64642f261e926f0e69f89bb2d9b7554a4abd8d6108264713de36986510ea32dfbcb0c"

RPROVIDES:${PN} += "python3.10dist-numcodecs \
python310-numcodecs \
python3dist-numcodecs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblosc.so.1 \
libc.so.6 \
liblz4.so.1 \
libzstd.so.1 \
python-abi \
python310-numpy"

inherit rpm
