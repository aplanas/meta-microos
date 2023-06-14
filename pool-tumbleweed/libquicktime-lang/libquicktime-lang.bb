SUMMARY = "Translations for package libquicktime"
DESCRIPTION = "Provides translations for the 'libquicktime' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.4+git20180804.fff99cd"

RPM_NAME = "libquicktime-lang-1.2.4+git20180804.fff99cd-4.1.noarch.rpm"
RPM_HASH = "757db2bb1653a74738e3f928b574f3e840c8763c6abd3d6a915e3cba09b1240da08585f7638229dfd8752c05ca1638f3a75d85b7a93f859047a851e19830b376"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libquicktime-lang \
libquicktime-lang-all \
locale-libquicktime-de"

RDEPENDS:${PN} += "libquicktime"

inherit rpm
