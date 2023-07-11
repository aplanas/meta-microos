SUMMARY = "Translations for package quilter"
DESCRIPTION = "Provides translations for the 'quilter' package."
LICENSE = "GPL-3.0-only"

PV = "3.3.4"

RPM_NAME = "quilter-lang-3.3.4-1.12.noarch.rpm"
RPM_HASH = "178efb26b5666f5a07275f74dd611cdf7472613f6512b4608180c0d885627479e7d1ced061fac1a9c3ba51e8313ce5b126907be2101b6e642d8d2c3a6e745008"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-quilter-ca \
locale-quilter-da \
locale-quilter-de \
locale-quilter-eo \
locale-quilter-es \
locale-quilter-fr \
locale-quilter-it \
locale-quilter-ja \
locale-quilter-lt \
locale-quilter-nl \
locale-quilter-pl \
locale-quilter-pt-BR \
locale-quilter-ru \
quilter-lang \
quilter-lang-all"

RDEPENDS:${PN} += "quilter"

inherit rpm
