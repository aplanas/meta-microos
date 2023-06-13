SUMMARY = "NSS NIS plugin for glibc"
DESCRIPTION = "The NSS NIS plugin provides NIS support for get*nam() functions from \
glibc. This version is IPv6 capable."
LICENSE = "LGPL-2.1-only"

PV = "3.1"

RPM_NAME = "libnss_nis2-3.1-2.8.aarch64.rpm"
RPM_HASH = "9b94e610b9b1fef2e937e86841a83fe25bdde27439a87b36c191c27e346362809d64f15e59b43f6b33a51aeff6d891efee04d7308de5e8bda5ba04748dafe7bc"

RPROVIDES:${PN} += "glibc:/lib64/libnss_nis.so.2 \
libnss_nis.so.2()(64bit) \
libnss_nis.so.2(NSS_NIS_PRIVATE_2.0)(64bit) \
libnss_nis2 \
libnss_nis2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libnsl.so.3()(64bit) \
libnsl.so.3(LIBNSL_2.0)(64bit)"

inherit rpm
