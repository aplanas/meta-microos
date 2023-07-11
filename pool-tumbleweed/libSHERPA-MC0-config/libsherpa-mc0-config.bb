SUMMARY = "Dynamic linker configuration for the SHERPA-MC libraries"
DESCRIPTION = "Contains the ld.so.conf.d file for the SHERPA-MC libraries."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.2.12"

RPM_NAME = "libSHERPA-MC0-config-2.2.12-3.1.noarch.rpm"
RPM_HASH = "d9384ced06e16432914cfc0d7332d9b756e656da2d278c7bfd7d8e7a9b885e01f41d61cd649ecb2ac04d62ab9caa7ec3eb01b2c9526f7c1782874a3266a7e73b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-libSHERPA-MC0-config \
libSHERPA-MC-config \
libSHERPA-MC0-config"

RDEPENDS:${PN} += ""

inherit rpm
