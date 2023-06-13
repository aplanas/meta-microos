SUMMARY = "Translations for package kaidan"
DESCRIPTION = "Provides translations for the 'kaidan' package."
LICENSE = "AML & GPL-3.0-or-later & SUSE-GPL-3.0+-with-openssl-exception & MIT & CC-BY-SA-4.0"

PV = "0.9.1"

RPM_NAME = "kaidan-lang-0.9.1-1.1.noarch.rpm"
RPM_HASH = "986554996451dfdd990507cd85fc4e96be69eec640dca6b0b208e450e6511ae8763a860eb3c6739df702647c1eddad447466fb2f0e956862bc39e671a416cad4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kaidan-lang \
kaidan-lang-all \
locale(kaidan:ar) \
locale(kaidan:ca) \
locale(kaidan:ca@valencia) \
locale(kaidan:cs) \
locale(kaidan:de) \
locale(kaidan:el) \
locale(kaidan:en_GB) \
locale(kaidan:es) \
locale(kaidan:eu) \
locale(kaidan:fi) \
locale(kaidan:fr) \
locale(kaidan:gl) \
locale(kaidan:he) \
locale(kaidan:hu) \
locale(kaidan:it) \
locale(kaidan:ka) \
locale(kaidan:ko) \
locale(kaidan:ms) \
locale(kaidan:nb) \
locale(kaidan:nl) \
locale(kaidan:pa) \
locale(kaidan:pl) \
locale(kaidan:pt) \
locale(kaidan:pt_BR) \
locale(kaidan:ru) \
locale(kaidan:sk) \
locale(kaidan:sl) \
locale(kaidan:sv) \
locale(kaidan:tr) \
locale(kaidan:uk)"

RDEPENDS:${PN} += "kaidan"

inherit rpm
