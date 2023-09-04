SUMMARY = "Zsh Completion for yt-dlp"
DESCRIPTION = "ZSH command line completion support for yt-dlp."
LICENSE = "CC-BY-SA-3.0 & SUSE-Public-Domain"

PV = "2023.07.06"

RPM_NAME = "yt-dlp-zsh-completion-2023.07.06-1.1.noarch.rpm"
RPM_HASH = "a2551d89a3a3553740bcc18492c4280453f634a62846b39e0180ae9504c224ae7fde08d2774eb7a42213c597721037cfb05d4b4aad0fe85eb6a345a0811bfef6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yt-dlp-zsh-completion"

RDEPENDS:${PN} += "zsh"

inherit rpm
