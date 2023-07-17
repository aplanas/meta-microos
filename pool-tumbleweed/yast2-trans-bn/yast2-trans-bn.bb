SUMMARY = "YaST2 - Bengali Translations"
DESCRIPTION = "YaST2 - Translations for Bengali."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-bn-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "168a1d494f3667ce019cb8e202486d25c68816584e33e022e3c42491220fceb6274d5d3e41960ee92e16f26acca5903bf8b1c40c43bdff18ae749dcde7f5ca1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-bn \
yast2-trans-bn"

RDEPENDS:${PN} += ""

inherit rpm
