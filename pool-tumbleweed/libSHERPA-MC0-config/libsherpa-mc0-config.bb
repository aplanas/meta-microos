SUMMARY = "Dynamic linker configuration for the SHERPA-MC libraries"
DESCRIPTION = "Contains the ld.so.conf.d file for the SHERPA-MC libraries."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.2.12"

RPM_NAME = "libSHERPA-MC0-config-2.2.12-2.12.noarch.rpm"
RPM_HASH = "49ebfd233a53927ad2dafceb909b123d608fd82bbc981aa0d27a17d2e34e0301b15f9f3677a6b3c1a7ce86b4388b5882d57c9903ff5b53b8903d0c821c214c6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-libSHERPA-MC0-config \
libSHERPA-MC-config \
libSHERPA-MC0-config"

RDEPENDS:${PN} += ""

inherit rpm
