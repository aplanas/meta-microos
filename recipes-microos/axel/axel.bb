SUMMARY = "Lightweight Download Accelerator"
DESCRIPTION = "Axel tries to accelerate HTTP/FTP downloading process by using multiple \
connections for one file. It can use multiple mirrors for a download. Axel has \
no dependencies and is lightweight, so it might be useful as a wget clone on \
byte-critical systems."
LICENSE = "GPL-2.0-or-later"

PV = "2.17.11"

RPM_NAME = "axel-2.17.11-1.7.aarch64.rpm"
RPM_HASH = "4bb1e49170f31a7b680cee9182448ae8304b8e5ee9d6bd2b186f276153fbd2412294440b648c479e4af9f92bcdf513285fa83cb64a0bdc4deb161bbd571cc36f"

RPROVIDES:${PN} += "axel axel(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit)"

inherit rpm
