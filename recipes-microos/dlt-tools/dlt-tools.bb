SUMMARY = "DLT - Diagnostic Log and Trace: Tools"
DESCRIPTION = "DLT - Diagnostic Log and Trace: Tools."
LICENSE = "MPL-2.0-no-copyleft-exception"

PV = "2.18.8"

RPM_NAME = "dlt-tools-2.18.8-4.4.aarch64.rpm"
RPM_HASH = "03d1d261d2af7e97d71a1a77478798014329f234534d2e7f3e0062e7f898d506b7b73e9933c3939e3680452885ba993edefd75a8ef06b8ca7f24fbac4647c17d"

RPROVIDES:${PN} += "config(dlt-tools) dlt-tools dlt-tools(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libdlt.so.2()(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit)"

inherit rpm
