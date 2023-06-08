SUMMARY = "Delay Accounting Utilities"
DESCRIPTION = "Delay accounting allows the administrator to track the time an \
application spends waiting on disk I/O, swap I/O and CPU scheduling. \
This can help pin-point resource shortages in a system configuration."
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "delayacct-utils-6.3.1-31.55.aarch64.rpm"
RPM_HASH = "894d489e3f70667a552ce425fa0a22af3b6cf26c6ddd9e26578c1d855c8b0bbbd63393dfa375eb544d3a3c249bdac3eb28b7bfceb3867a28b5c27af10f7b3710"

RPROVIDES:${PN} += "delayacct-utils delayacct-utils(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
