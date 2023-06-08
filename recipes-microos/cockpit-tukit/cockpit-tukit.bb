SUMMARY = "Cockpit module for Transactional Update"
DESCRIPTION = "Cockpit module for Transactional Update"
LICENSE = "LGPL-2.1-or-later"

PV = "0.0.3~git28.b446f50"

RPM_NAME = "cockpit-tukit-0.0.3~git28.b446f50-1.4.noarch.rpm"
RPM_HASH = "ca51b4a16a3edaa8e2e300fe1ec8a2380c29fd25e4e7a26f03039abcc16b3a590a8e52f55115eea12cd2fe70aa5e5463e6aae4d26e90aeff43fe8305e1e0a691"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-tukit metainfo() metainfo(org.cockpit-project.tukit.metainfo.xml)"
RDEPENDS:${PN} += "cockpit-system tukitd"

inherit rpm
