SUMMARY = "Translations for package gtkmm4-tutorial"
DESCRIPTION = "Provides translations for the 'gtkmm4-tutorial' package."
LICENSE = "GFDL-1.2-only & GPL-2.0-or-later"

PV = "4.10.0"

RPM_NAME = "gtkmm4-tutorial-lang-4.10.0-1.1.noarch.rpm"
RPM_HASH = "f94fa25de57ab801cd8fbf7913eaa90c2eae1e80c62584b35149afe007d07bb94f89daa1c30d756a7ea5b6530473921f288347f02605eccbe88616e79a1a5458"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtkmm4-tutorial-lang \
gtkmm4-tutorial-lang-all"
RDEPENDS:${PN} += "gtkmm4-tutorial"

inherit rpm
