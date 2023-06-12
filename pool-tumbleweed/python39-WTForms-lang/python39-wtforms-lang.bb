SUMMARY = "Translations for builtin WTForms messages"
DESCRIPTION = "Translations for builtin WTForms messages. \
 \
WTForms is a forms validation and rendering library for Python web development."
LICENSE = "BSD-3-Clause"

PV = "3.0.1"

RPM_NAME = "python39-WTForms-lang-3.0.1-2.6.noarch.rpm"
RPM_HASH = "664c364e00a15c5f08ffc6a1912fdca621e498b6c32b9419d8c2d7e7c8985c3d04eee2e4af02c070348a9ff0489a506bf9c1013b00337c45e385eb65cef124b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(python39-WTForms:ar) \
locale(python39-WTForms:bg) \
locale(python39-WTForms:ca) \
locale(python39-WTForms:cs_CZ) \
locale(python39-WTForms:cy) \
locale(python39-WTForms:de) \
locale(python39-WTForms:de_CH) \
locale(python39-WTForms:el) \
locale(python39-WTForms:en) \
locale(python39-WTForms:es) \
locale(python39-WTForms:et) \
locale(python39-WTForms:fa) \
locale(python39-WTForms:fi) \
locale(python39-WTForms:fr) \
locale(python39-WTForms:he) \
locale(python39-WTForms:hu) \
locale(python39-WTForms:it) \
locale(python39-WTForms:ja) \
locale(python39-WTForms:ko) \
locale(python39-WTForms:nb) \
locale(python39-WTForms:nl) \
locale(python39-WTForms:pl) \
locale(python39-WTForms:pt) \
locale(python39-WTForms:ru) \
locale(python39-WTForms:sk) \
locale(python39-WTForms:sv) \
locale(python39-WTForms:tr) \
locale(python39-WTForms:uk) \
locale(python39-WTForms:zh) \
locale(python39-WTForms:zh_TW) \
python39-WTForms-lang"
RDEPENDS:${PN} += "python39-WTForms"

inherit rpm
