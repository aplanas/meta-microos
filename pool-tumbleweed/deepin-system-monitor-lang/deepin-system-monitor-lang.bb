SUMMARY = "Translations for package deepin-system-monitor"
DESCRIPTION = "Provides translations for the 'deepin-system-monitor' package."
LICENSE = "GPL-3.0-or-later"

PV = "5.8.27"

RPM_NAME = "deepin-system-monitor-lang-5.8.27-1.5.noarch.rpm"
RPM_HASH = "8434662445594cfdae091783d79dafb1ff659affba28083307a01b6dce1905b3dbe1e4d39ca4b61a478668ff55f2249eb4932075d924b9b7e4e65c439e0d2847"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-system-monitor-lang \
deepin-system-monitor-lang-all"

RDEPENDS:${PN} += "deepin-system-monitor"

inherit rpm
