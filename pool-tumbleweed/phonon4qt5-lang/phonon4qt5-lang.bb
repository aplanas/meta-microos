SUMMARY = "Translations for package phonon4qt5"
DESCRIPTION = "Provides translations for the 'phonon4qt5' package."
LICENSE = "LGPL-2.0-or-later"

PV = "4.11.1"

RPM_NAME = "phonon4qt5-lang-4.11.1-3.9.noarch.rpm"
RPM_HASH = "07009c5ace7639a4c980daed8a3e237e2ac76c7d54d3e6fc55d25515f2c321074d0bacd7588d55d7c44b6c1e29924081b3b77d69967476a0e03896bf3d9ddeca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(phonon4qt5:ca) \
locale(phonon4qt5:cs) \
locale(phonon4qt5:de) \
locale(phonon4qt5:en_GB) \
locale(phonon4qt5:es) \
locale(phonon4qt5:eu) \
locale(phonon4qt5:fi) \
locale(phonon4qt5:fr) \
locale(phonon4qt5:gl) \
locale(phonon4qt5:id) \
locale(phonon4qt5:it) \
locale(phonon4qt5:ko) \
locale(phonon4qt5:nl) \
locale(phonon4qt5:nn) \
locale(phonon4qt5:pl) \
locale(phonon4qt5:pt) \
locale(phonon4qt5:pt_BR) \
locale(phonon4qt5:sk) \
locale(phonon4qt5:sr) \
locale(phonon4qt5:sr@ijekavian) \
locale(phonon4qt5:sr@ijekavianlatin) \
locale(phonon4qt5:sr@latin) \
locale(phonon4qt5:sv) \
locale(phonon4qt5:uk) \
locale(phonon4qt5:zh_CN) \
phonon4qt5-lang \
phonon4qt5-lang-all"
RDEPENDS:${PN} += "phonon4qt5"

inherit rpm
