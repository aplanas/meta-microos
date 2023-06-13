SUMMARY = "Open source contributions lister"
DESCRIPTION = "Open source contributions lister."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "gontributions-0.7.1-1.4.aarch64.rpm"
RPM_HASH = "99462a46b7d9dce340620c603da88921bd0045649a835679114cccf83dc6d360ed5f9d53ffa93f502f188c3a4bb5e2631a0004570a786a81c1d1c059fa92a089"

RPROVIDES:${PN} += "gontributions \
gontributions(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit)"

inherit rpm
