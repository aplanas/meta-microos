SUMMARY = "QR Code generator library"
DESCRIPTION = "C++ QR Code generator library"
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "libqrcodegencpp1-1.6.0-1.13.aarch64.rpm"
RPM_HASH = "f0b83391abd03a8754e600612a5024ec8bd05e0778befe4fb387504c0750116ac889058d1b583686bc035aa37eb4871c822c2c1eb137653c0355ecb5a9736bc0"

RPROVIDES:${PN} += "libqrcodegencpp.so.1 \
libqrcodegencpp1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1"

inherit rpm
