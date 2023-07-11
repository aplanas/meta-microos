SUMMARY = "Translations for package libquicktime"
DESCRIPTION = "Provides translations for the 'libquicktime' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.4+git20180804.fff99cd"

RPM_NAME = "libquicktime-lang-1.2.4+git20180804.fff99cd-4.2.noarch.rpm"
RPM_HASH = "807df2f246ee57079fd1e42f812ea9f0de08d2f635274098272e766c0c21cb03ad261491f32ab9ac91bb474260a4f08959ba3403d7840e3ba6fcf42430ba80ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libquicktime-lang \
libquicktime-lang-all \
locale-libquicktime-de"

RDEPENDS:${PN} += "libquicktime"

inherit rpm
