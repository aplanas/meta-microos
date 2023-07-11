SUMMARY = "Bash Completion for pdfgrep"
DESCRIPTION = "Bash completion script for pdfgrep."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.2"

RPM_NAME = "pdfgrep-bash-completion-2.1.2-2.10.noarch.rpm"
RPM_HASH = "ff804cc7de81990d4b585f295bb0827d87e0548b2872373b12cabcd7577bd5265a66a48352496dd3c8484055f247bcccbfb490514e723626fdae6f7c5de6ab88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pdfgrep-bash-completion"

RDEPENDS:${PN} += "bash-completion \
pdfgrep"

inherit rpm
