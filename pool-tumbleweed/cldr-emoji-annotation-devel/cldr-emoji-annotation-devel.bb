SUMMARY = "Files for development using cldr-annotations"
DESCRIPTION = "This package contains the pkg-config files for development \
when building programs that use cldr-annotations."
LICENSE = "LGPL-2.0-or-later & Unicode"

PV = "36.12.120191002_0"

RPM_NAME = "cldr-emoji-annotation-devel-36.12.120191002_0-1.9.noarch.rpm"
RPM_HASH = "7602a6f1d14856b11a60e9201f7d224a24e1d37f8316b1790e958225000b1d57e88130d55af47b21a7716cc34ef5e73274e80f1b0288777cd810ba8ccb343f46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cldr-emoji-annotation-devel \
pkgconfig-cldr-emoji-annotation"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cldr-emoji-annotation"

inherit rpm
