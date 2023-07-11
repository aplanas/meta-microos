SUMMARY = "The openQA documentation"
DESCRIPTION = "Documentation material covering installation, configuration, basic test writing, etc. \
Covering both openQA and also os-autoinst test engine."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1688565452.efc15ea"

RPM_NAME = "openQA-doc-4.6.1688565452.efc15ea-1.1.aarch64.rpm"
RPM_HASH = "1930d64e26a2cb5a22dfc5faa9fc5252902df894a498e20b5a6ed1e515996fbca7ed91953c7560919b73d2e71a4093e0c90a2ce04aa868a8ac6892c15392036c"

RPROVIDES:${PN} += "openQA-doc"

RDEPENDS:${PN} += ""

inherit rpm
