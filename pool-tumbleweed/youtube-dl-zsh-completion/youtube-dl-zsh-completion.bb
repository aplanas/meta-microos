SUMMARY = "Zsh Completion for youtube-dl"
DESCRIPTION = "ZSH command line completion support for youtube-dl."
LICENSE = "CC-BY-SA-3.0 & SUSE-Public-Domain"

PV = "2021.12.17"

RPM_NAME = "youtube-dl-zsh-completion-2021.12.17-8.1.noarch.rpm"
RPM_HASH = "2c8f70b680e70d92d777dbe60bb2a7e2f4ec063b6eb2a04b4d7b3ff4d79e684772fd6a3b9cbb4209e8da971361f0760bc8770e85d9ccbf388cf852f37157241b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "youtube-dl-zsh-completion"

RDEPENDS:${PN} += "zsh"

inherit rpm
