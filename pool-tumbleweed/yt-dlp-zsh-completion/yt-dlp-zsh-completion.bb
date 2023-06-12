SUMMARY = "Zsh Completion for yt-dlp"
DESCRIPTION = "ZSH command line completion support for yt-dlp."
LICENSE = "CC-BY-SA-3.0 & SUSE-Public-Domain"

PV = "2023.03.04"

RPM_NAME = "yt-dlp-zsh-completion-2023.03.04-2.1.noarch.rpm"
RPM_HASH = "4414d1fbbef429c7f49441cdee8781d5bfdb1e0bfa57575bad79f4ab68574710dcc53340c54b7f03c314caba77cbed49cfc5e20b414df69c19fe416615df42e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yt-dlp-zsh-completion"
RDEPENDS:${PN} += "zsh"

inherit rpm
