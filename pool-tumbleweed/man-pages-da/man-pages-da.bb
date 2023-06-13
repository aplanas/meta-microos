SUMMARY = "Translation of man pages in Danish"
DESCRIPTION = "This package provides translations of man pages in Danish."
LICENSE = "GPL-3.0-or-later"

PV = "4.19.0"

RPM_NAME = "man-pages-da-4.19.0-1.1.noarch.rpm"
RPM_HASH = "34d218410012683162873e55fc46957ec997b2367f2748dac526be67ee4a358dc3d6fa8ff9b05c38e094f46121135f57078ad78172859521c2675731ce8bfd74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(man-pages:da) \
man-pages-da"

RDEPENDS:${PN} += "man-pages"

inherit rpm
