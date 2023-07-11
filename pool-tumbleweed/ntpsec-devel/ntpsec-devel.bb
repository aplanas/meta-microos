SUMMARY = "Development files for ntpsec"
DESCRIPTION = "This package contains libraries needed to develop application \
that use ntpsec."
LICENSE = "BSD-2-Clause & NTP & BSD-3-Clause & MIT"

PV = "1.2.2"

RPM_NAME = "ntpsec-devel-1.2.2-1.5.aarch64.rpm"
RPM_HASH = "72ad3a92c69df01b55527122e9b7df9f8bbb2bbfb7585d2ff2992cc77520fd2177e3170b82bcde24da682fe98da157ad7b9790d4dd37632b1b64ca3c48a8564d"

RPROVIDES:${PN} += "ntpsec-devel"

RDEPENDS:${PN} += "libntpc1"

inherit rpm
