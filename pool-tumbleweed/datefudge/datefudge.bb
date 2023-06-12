SUMMARY = "A preload library to fake system time"
DESCRIPTION = "This program fakes the system date so that programs think the \
wall clock is different. The faking is not complete; timestamp \
on files are not affected in any way."
LICENSE = "GPL-2.0-or-later"

PV = "1.24"

RPM_NAME = "datefudge-1.24-1.10.aarch64.rpm"
RPM_HASH = "e20dbf37a176c3a56e6568e5235f9c18efbbc4fc555e298455b414cda6fe7be944c5c498258cf76f5a4e9584b5515b33ed775c3c43faef74364d318213d680f3"

RPROVIDES:${PN} += "datefudge \
datefudge(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
