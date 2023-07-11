SUMMARY = "Translations for libmirage"
DESCRIPTION = "Provides translations for the 'libmirage' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.6"

RPM_NAME = "libmirage-lang-3.2.6-1.9.noarch.rpm"
RPM_HASH = "ff97e96708072a6c1b189b98ecd3775d0340b23c377cf50099a4a60aef5855097968b146c0f8ec3b1bf0225e816e243f6c4185260a862a4d3998d13c30c8ab47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libmirage-lang \
libmirage-lang-all \
locale-libmirage-ru \
locale-libmirage-sl"

RDEPENDS:${PN} += ""

inherit rpm
