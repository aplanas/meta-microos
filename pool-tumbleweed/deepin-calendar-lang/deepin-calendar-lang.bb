SUMMARY = "Translations for package deepin-calendar"
DESCRIPTION = "Provides translations for the 'deepin-calendar' package."
LICENSE = "GPL-3.0-or-later"

PV = "5.8.30"

RPM_NAME = "deepin-calendar-lang-5.8.30-1.3.noarch.rpm"
RPM_HASH = "999bf2f213b6c3ac34a8ff6c465d4ad8aa66fa2c436d1375bd83caf8dcc741eb526b6fff94a73fc345e6a20cfa238b60b49c70106cb0be643bd6ebda94f2acdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-calendar-lang \
deepin-calendar-lang-all"
RDEPENDS:${PN} += "deepin-calendar"

inherit rpm
