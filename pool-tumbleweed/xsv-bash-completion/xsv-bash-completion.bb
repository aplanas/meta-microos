SUMMARY = "Bash Completion for xsv"
DESCRIPTION = "Bash completion script for xsv."
LICENSE = "MIT | Unlicense"

PV = "0.13.0"

RPM_NAME = "xsv-bash-completion-0.13.0-2.9.noarch.rpm"
RPM_HASH = "562fbd0a949070705f1d2b5a08bc22876963d0019c6ca50240932058bf2c37a133b9a41ebbf4693fdd51bb90fcd206cbe7e066163c9141bd98c95c8a628ed34b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xsv-bash-completion"

RDEPENDS:${PN} += "bash-completion \
xsv"

inherit rpm
