SUMMARY = "Utility for running regular jobs"
DESCRIPTION = "Anacron becames part of cronie. Anacron is used only for running regular jobs. \
The default settings execute regular jobs by anacron, however this could be \
overloaded in settings."
LICENSE = "BSD-3-Clause & GPL-2.0-only & MIT"

PV = "1.6.1"

RPM_NAME = "cronie-anacron-1.6.1-91.3.aarch64.rpm"
RPM_HASH = "17841e16fc4b57a5dd86541a55cffab72724dcb0c5abb694e11261240ce047eec7840ec9a8f74bc37130fda58df5f674fcfdb587434a5787811d9d514b82398c"

RPROVIDES:${PN} += "config(cronie-anacron) cronie-anacron cronie-anacron(aarch-64)"
RDEPENDS:${PN} += "/bin/sh cronie ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
