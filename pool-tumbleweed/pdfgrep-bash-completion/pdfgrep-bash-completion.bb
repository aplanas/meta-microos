SUMMARY = "Bash Completion for pdfgrep"
DESCRIPTION = "Bash completion script for pdfgrep."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.2"

RPM_NAME = "pdfgrep-bash-completion-2.1.2-2.9.noarch.rpm"
RPM_HASH = "74bc63459819d5ee7d6139b70ef96a7efd7a41fd84f9898d38afdb62e932cdc7c87ff49b0af6b6d0dcd8eb3560852fb7312ef08eb535a633d1e367fe8d589a12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pdfgrep-bash-completion"

RDEPENDS:${PN} += "bash-completion \
pdfgrep"

inherit rpm
