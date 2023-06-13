SUMMARY = "Bash completions scripts for jp2a"
DESCRIPTION = "This package contains the bash completions scripts for jp2a."
LICENSE = "GPL-2.0-only"

PV = "1.1.1"

RPM_NAME = "jp2a-bash-completion-1.1.1-2.7.noarch.rpm"
RPM_HASH = "a9f228af9940bc20cfec9ee6a1dfc74815c92a9118e61f7c8c9fc8e2321b9b44910504afd4e862920369c279babca6a7db28e6bc865140fc682a15564c0aa049"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jp2a-bash-completion"

RDEPENDS:${PN} += ""

inherit rpm
