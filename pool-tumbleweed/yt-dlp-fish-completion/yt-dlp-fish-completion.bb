SUMMARY = "Fish completion for yt-dlp"
DESCRIPTION = "Fish command line completion support for yt-dlp."
LICENSE = "CC-BY-SA-3.0 & SUSE-Public-Domain"

PV = "2023.06.22"

RPM_NAME = "yt-dlp-fish-completion-2023.06.22-1.1.noarch.rpm"
RPM_HASH = "c40727b73058b814fa79e81fe0f0968fba6975c1e7fd114ff855eae728cd4f9478c047e6cc34c517dc4c18ebe5e1a862676fcd0fcd003bcb51f81ce86563e464"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yt-dlp-fish-completion"

RDEPENDS:${PN} += "fish"

inherit rpm
