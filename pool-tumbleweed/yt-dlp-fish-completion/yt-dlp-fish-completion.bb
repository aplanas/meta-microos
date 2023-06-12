SUMMARY = "Fish completion for yt-dlp"
DESCRIPTION = "Fish command line completion support for yt-dlp."
LICENSE = "CC-BY-SA-3.0 & SUSE-Public-Domain"

PV = "2023.03.04"

RPM_NAME = "yt-dlp-fish-completion-2023.03.04-2.1.noarch.rpm"
RPM_HASH = "ffe894e7a35f63ad9a2ae78db3c0ac8a9797026bd3485d336c2fc6468e55d0801876313679cf02aeef0f6a5689abf32bb1280810e19bc2c3735aeaba091e3996"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yt-dlp-fish-completion"
RDEPENDS:${PN} += "fish"

inherit rpm
