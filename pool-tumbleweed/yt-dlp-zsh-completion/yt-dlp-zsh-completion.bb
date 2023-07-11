SUMMARY = "Zsh Completion for yt-dlp"
DESCRIPTION = "ZSH command line completion support for yt-dlp."
LICENSE = "CC-BY-SA-3.0 & SUSE-Public-Domain"

PV = "2023.06.22"

RPM_NAME = "yt-dlp-zsh-completion-2023.06.22-1.1.noarch.rpm"
RPM_HASH = "6b9eabc021e0e6ce6737fc6fe0e7a58fc82209c1e5fa143f1f2f93d15f8f14bdd7c5e1da7c1b0e1de3d97332fb0bf842634854d632f710ed5bc578aaec9b115f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yt-dlp-zsh-completion"

RDEPENDS:${PN} += "zsh"

inherit rpm
