SUMMARY = "Deepin Multimedia"
DESCRIPTION = "Deepin multimedia applications."
LICENSE = "MIT"

PV = "15.4.20220603"

RPM_NAME = "patterns-deepin-deepin_multimedia-15.4.20220603-2.3.aarch64.rpm"
RPM_HASH = "4e1f08f98af721bd7dac273507b4efa9e3340ee9585751fd1cdcdd7b2a5046358e18a5e1e3998be8251c3f5476c9c2c997e8c0f9977e35fe78d943b348c40d35"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-extends- \
pattern-icon- \
pattern-order- \
patterns-deepin-deepin-multimedia"

RDEPENDS:${PN} += "pattern- \
vlc"

inherit rpm
