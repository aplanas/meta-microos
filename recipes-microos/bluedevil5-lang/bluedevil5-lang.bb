SUMMARY = "Translations for package bluedevil5"
DESCRIPTION = "Provides translations for the 'bluedevil5' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "bluedevil5-lang-5.27.5-1.1.noarch.rpm"
RPM_HASH = "2d3883ba30a77b6a3c2859234aec8efa921b13aeae77e58383df59fad4c88f934c034759ab3e1eeab33c6efe452c461dff35e1cdaf5c5509df98d149b615003c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bluedevil5-lang bluedevil5-lang-all locale(bluedevil5:ar) locale(bluedevil5:ast) locale(bluedevil5:az) locale(bluedevil5:bg) locale(bluedevil5:bs) locale(bluedevil5:ca) locale(bluedevil5:ca@valencia) locale(bluedevil5:cs) locale(bluedevil5:da) locale(bluedevil5:de) locale(bluedevil5:el) locale(bluedevil5:en_GB) locale(bluedevil5:es) locale(bluedevil5:et) locale(bluedevil5:eu) locale(bluedevil5:fi) locale(bluedevil5:fr) locale(bluedevil5:gl) locale(bluedevil5:he) locale(bluedevil5:hu) locale(bluedevil5:ia) locale(bluedevil5:id) locale(bluedevil5:it) locale(bluedevil5:ja) locale(bluedevil5:ka) locale(bluedevil5:ko) locale(bluedevil5:lt) locale(bluedevil5:ml) locale(bluedevil5:nb) locale(bluedevil5:nl) locale(bluedevil5:nn) locale(bluedevil5:pa) locale(bluedevil5:pl) locale(bluedevil5:pt) locale(bluedevil5:pt_BR) locale(bluedevil5:ro) locale(bluedevil5:ru) locale(bluedevil5:sk) locale(bluedevil5:sl) locale(bluedevil5:sr) locale(bluedevil5:sr@ijekavian) locale(bluedevil5:sr@ijekavianlatin) locale(bluedevil5:sr@latin) locale(bluedevil5:sv) locale(bluedevil5:tr) locale(bluedevil5:uk) locale(bluedevil5:zh_CN) locale(bluedevil5:zh_TW)"
RDEPENDS:${PN} += "bluedevil5"

inherit rpm
