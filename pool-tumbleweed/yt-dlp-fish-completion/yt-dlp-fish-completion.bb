SUMMARY = "Fish completion for yt-dlp"
DESCRIPTION = "Fish command line completion support for yt-dlp."
LICENSE = "CC-BY-SA-3.0 & SUSE-Public-Domain"

PV = "2023.07.06"

RPM_NAME = "yt-dlp-fish-completion-2023.07.06-1.1.noarch.rpm"
RPM_HASH = "74901fe9358653c217e9bcb6c485a7598c2696a525616f15d7f59324a9dfb63a91585a07f178b5b5080bd10d0c43d8cac9e056a96afbe70d6ac259998dab4d78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yt-dlp-fish-completion"

RDEPENDS:${PN} += "fish"

inherit rpm
