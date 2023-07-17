SUMMARY = "LDC Bash completion"
DESCRIPTION = "Optional dependency offering bash completion for ldc2"
LICENSE = "Artistic-1.0 & BSD-3-Clause"

PV = "1.32.2"

RPM_NAME = "ldc-bash-completion-1.32.2-1.1.aarch64.rpm"
RPM_HASH = "a250b715aa3423bd63add91bae72ce5c7f67d70065d6b4174e1129241863cde8817570ef4752bc05d628825a828a31842ff664843793a15edea51e78d74760c1"

RPROVIDES:${PN} += "ldc-bash-completion"

RDEPENDS:${PN} += "bash-completion \
ldc"

inherit rpm
