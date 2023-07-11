SUMMARY = "Translations for package diskmonitor"
DESCRIPTION = "Provides translations for the 'diskmonitor' package."
LICENSE = "GPL-2.0-only"

PV = "0.3.4"

RPM_NAME = "diskmonitor-lang-0.3.4-3.9.noarch.rpm"
RPM_HASH = "f951fab1cef9ea51ba4dbb67f543b14ec00db5f42eba3dd3b9c70a998e83b9579753dd891d0470b125d37884f3a6ab00571852ca560abea4ffa857403a98601c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "diskmonitor-lang \
diskmonitor-lang-all \
locale-diskmonitor-fr \
locale-diskmonitor-sl"

RDEPENDS:${PN} += "diskmonitor"

inherit rpm
