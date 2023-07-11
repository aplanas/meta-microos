SUMMARY = "Bash completion for youtube-dl"
DESCRIPTION = "Bash command line completion support for youtube-dl."
LICENSE = "CC-BY-SA-3.0 & SUSE-Public-Domain"

PV = "2021.12.17"

RPM_NAME = "youtube-dl-bash-completion-2021.12.17-8.1.noarch.rpm"
RPM_HASH = "735f8611fda70714aece6dba686e387c0c51c41504f36276c1617645573bed5f690b03fd98ace1b7258a71c9eb5186cf13687c1c105afbd6cb141a54e531b367"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "youtube-dl-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
