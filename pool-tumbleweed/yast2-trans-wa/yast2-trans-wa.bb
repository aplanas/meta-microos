SUMMARY = "YaST2 - Walloon Translations"
DESCRIPTION = "YaST2 - Translations for Walloon."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-wa-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "127790390846b60528af5e939f73abf2a4a51faefcf747aa037265fc6906501128458519f53a769aab134a90531271b141f93dc28bf6e36d3c46bbb7101b26ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:wa) \
yast2-trans-wa"

RDEPENDS:${PN} += ""

inherit rpm
