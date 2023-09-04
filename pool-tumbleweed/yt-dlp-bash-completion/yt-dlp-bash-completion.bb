SUMMARY = "Bash completion for yt-dlp"
DESCRIPTION = "Bash command line completion support for yt-dlp."
LICENSE = "CC-BY-SA-3.0 & SUSE-Public-Domain"

PV = "2023.07.06"

RPM_NAME = "yt-dlp-bash-completion-2023.07.06-1.1.noarch.rpm"
RPM_HASH = "712cd1af2d79572346191a3ef1456187b8c2468bf566137352168d3867160e8d2e5b476a98584f02bfb7b2ee01484a01cc92628037e508b32293ad82f71d9fd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yt-dlp-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
