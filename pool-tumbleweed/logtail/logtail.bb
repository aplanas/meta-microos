SUMMARY = "Helper application to analyze logfiles"
DESCRIPTION = "Print log file lines that have not been read"
LICENSE = "GPL-2.0-or-later"

PV = "0.2.4"

RPM_NAME = "logtail-0.2.4-20.13.aarch64.rpm"
RPM_HASH = "5270f959a1e6423c3683adb620eed5f293b391db98b93fdfafab09a2488c42113cdeed825448502ef7bed3117b0937f52c5a682f2ae848b87c7263378c3bfacc"

RPROVIDES:${PN} += "logtail \
logtail(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
