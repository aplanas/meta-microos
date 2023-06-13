SUMMARY = "Translations for package gtkmm2-tutorial"
DESCRIPTION = "Provides translations for the 'gtkmm2-tutorial' package."
LICENSE = "GFDL-1.2-only & GPL-2.0-or-later"

PV = "2.24.1"

RPM_NAME = "gtkmm2-tutorial-lang-2.24.1-16.10.noarch.rpm"
RPM_HASH = "aee155626ea66f2fb7b8019594dd6a07d376739327dc8690fdd26e0db03b8a15f3fde86c90b9b60765905f6b3433ca5875b30ac01eb78298d1a902c1315b3dc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtkmm2-tutorial-lang \
gtkmm2-tutorial-lang-all"

RDEPENDS:${PN} += "gtkmm2-tutorial"

inherit rpm
