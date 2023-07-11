SUMMARY = "Files for development using cldr-annotations"
DESCRIPTION = "This package contains the pkg-config files for development \
when building programs that use cldr-annotations."
LICENSE = "LGPL-2.0-or-later & Unicode"

PV = "36.12.120191002_0"

RPM_NAME = "cldr-emoji-annotation-devel-36.12.120191002_0-1.10.noarch.rpm"
RPM_HASH = "5f8ec944d8b5c153fadf1a5cdd87ccef753d4a0fee4fd7b3de11ad17a9b871191bfb86073c3dd4538be7b2b0863447e7b059af167cfcebdafccdf53ab1529773"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cldr-emoji-annotation-devel \
pkgconfig-cldr-emoji-annotation"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cldr-emoji-annotation"

inherit rpm
