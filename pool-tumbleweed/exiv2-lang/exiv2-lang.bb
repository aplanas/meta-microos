SUMMARY = "Translations for package exiv2"
DESCRIPTION = "Provides translations for the 'exiv2' package."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "0.27.6"

RPM_NAME = "exiv2-lang-0.27.6-3.3.noarch.rpm"
RPM_HASH = "600f8ea20c7464bedaebf3e4b071870aeae5aefbb700651a3cca20bbef112a1529bd276c8c1c6d2f08abad7dd6d13cf7712c1b20fb5a9d7e0f46d4218011f702"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "exiv2-lang \
exiv2-lang-all \
locale-exiv2-bs \
locale-exiv2-ca \
locale-exiv2-de \
locale-exiv2-es \
locale-exiv2-fi \
locale-exiv2-fr \
locale-exiv2-gl \
locale-exiv2-ms \
locale-exiv2-nl \
locale-exiv2-pl \
locale-exiv2-pt \
locale-exiv2-ru \
locale-exiv2-sk \
locale-exiv2-sv \
locale-exiv2-ug \
locale-exiv2-uk \
locale-exiv2-vi"

RDEPENDS:${PN} += "exiv2"

inherit rpm
