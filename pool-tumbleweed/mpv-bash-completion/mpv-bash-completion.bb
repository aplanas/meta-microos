SUMMARY = "Bash Completion for mpv"
DESCRIPTION = "Bash command line completion support for mpv."
LICENSE = "GPL-2.0-or-later"

PV = "0.36.0+git.20230723.60a26324"

RPM_NAME = "mpv-bash-completion-0.36.0+git.20230723.60a26324-1.2.noarch.rpm"
RPM_HASH = "aa3e39879cae5f654855bfb119cfb1fc1cb891778017504a26b7491889f3760191b49216b7ca22537dacc63cdc452964eff83ad9cf485f9646f5bcf2f28ff32c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpv-bash-completion"

RDEPENDS:${PN} += "bash-completion \
mpv"

inherit rpm
