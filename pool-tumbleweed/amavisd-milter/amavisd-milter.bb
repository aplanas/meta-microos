SUMMARY = "Sendmail milter for amavisd-new using the AM.PDP protocol"
DESCRIPTION = "The amavisd-milter is a sendmail milter (mail filter) for amavisd-new \
2.4.3 (and above) and sendmail 8.12 (and above) which use the new AM.PDP \
protocol."
LICENSE = "BSD-3-Clause"

PV = "1.7.2"

RPM_NAME = "amavisd-milter-1.7.2-1.7.aarch64.rpm"
RPM_HASH = "b062b69907dfec2694c5a59e5ad687349751a02ff9e17dc282b4ac23b01f7c155131c30d5211cbc649f38865e2f4d0d57ef58782bcabba2a4d4ef5de6be948dd"

RPROVIDES:${PN} += "amavisd-milter \
amavisd-milter(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
amavisd-new \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libmilter.so.1.0()(64bit)"

inherit rpm
