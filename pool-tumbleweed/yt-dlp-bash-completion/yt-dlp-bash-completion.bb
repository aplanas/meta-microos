SUMMARY = "Bash completion for yt-dlp"
DESCRIPTION = "Bash command line completion support for yt-dlp."
LICENSE = "CC-BY-SA-3.0 & SUSE-Public-Domain"

PV = "2023.06.22"

RPM_NAME = "yt-dlp-bash-completion-2023.06.22-1.1.noarch.rpm"
RPM_HASH = "59825a51bc4256c3b1fd1656060d253e41e0f43110088375a5f86d4e30ce6f5e373e25d9e5619d369fdefedc2f3310578a676b64c6485a20f4173d41e0b76917"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yt-dlp-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
