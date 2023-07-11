SUMMARY = "Translations for package gpick"
DESCRIPTION = "Provides translations for the 'gpick' package."
LICENSE = "BSD-3-Clause"

PV = "0.2.5"

RPM_NAME = "gpick-lang-0.2.5-11.17.noarch.rpm"
RPM_HASH = "b9fdf1fd530ea4d78040c8f1a55711bb127cf21ea6e715a29799b2c3e54c1a785253dff3d721f6964ffa7acc6532d22bc1630955f150c22e82665b47f03f7a9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gpick-lang \
gpick-lang-all \
locale-gpick-es \
locale-gpick-lt \
locale-gpick-ru"

RDEPENDS:${PN} += "gpick"

inherit rpm
