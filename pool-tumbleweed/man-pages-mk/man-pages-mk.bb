SUMMARY = "Translation of man pages in Macedonian"
DESCRIPTION = "This package provides translations of man pages in Macedonian."
LICENSE = "GPL-3.0-or-later"

PV = "4.20.0"

RPM_NAME = "man-pages-mk-4.20.0-1.1.noarch.rpm"
RPM_HASH = "8d3d3ba19bc8e297ad29aef84fe0aca3ebe1d7384d488525339e1f22925723133d2dbbd3e391c7b4c83987f911db89bbd045f4926668581791fa2c5bab151a27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-man-pages-mk \
man-pages-mk"

RDEPENDS:${PN} += "man-pages"

inherit rpm
