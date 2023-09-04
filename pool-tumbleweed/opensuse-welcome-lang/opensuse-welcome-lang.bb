SUMMARY = "Translations for package opensuse-welcome"
DESCRIPTION = "Provides translations for the 'opensuse-welcome' package."
LICENSE = "GPL-3.0-or-later & MIT"

PV = "0.1.9+git.35.4b9444a"

RPM_NAME = "opensuse-welcome-lang-0.1.9+git.35.4b9444a-1.1.noarch.rpm"
RPM_HASH = "e80c6138d0606ce6d42533802d73f66529645233614bfb26c297c27f52021f51db8c68813fa723d3e890d6dec791317c956053e9d77c17ba1355469e69ea91fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "opensuse-welcome-lang \
opensuse-welcome-lang-all"

RDEPENDS:${PN} += "opensuse-welcome"

inherit rpm
