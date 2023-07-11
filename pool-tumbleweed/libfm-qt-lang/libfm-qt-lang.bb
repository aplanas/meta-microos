SUMMARY = "Translations for package libfm-qt"
DESCRIPTION = "Provides translations for the 'libfm-qt' package."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "libfm-qt-lang-1.3.0-1.4.noarch.rpm"
RPM_HASH = "c6de5522ec59dea1adc5acba835cae5da99c6ea7d6a8b949893045f33cf41cb3583e5ee8a317e14b8354bc67fddba6c3f54563d94a0cab10d14b7b6f818bcadd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libfm-qt-lang \
libfm-qt-lang-all"

RDEPENDS:${PN} += "libfm-qt13"

inherit rpm
