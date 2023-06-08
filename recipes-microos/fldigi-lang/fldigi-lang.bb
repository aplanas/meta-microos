SUMMARY = "Translations for package fldigi"
DESCRIPTION = "Provides translations for the 'fldigi' package."
LICENSE = "GPL-3.0-only"

PV = "4.1.26"

RPM_NAME = "fldigi-lang-4.1.26-1.3.noarch.rpm"
RPM_HASH = "3a7d2c694477002338c65ef4d066813af946eaf82125e4bc8834210b43d5655980fcffb3aa8cb5427189b71faabcfb44ceeaf02e9f098607c144be6b3750ccca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fldigi-lang fldigi-lang-all locale(fldigi:de) locale(fldigi:el) locale(fldigi:es) locale(fldigi:fr) locale(fldigi:it) locale(fldigi:nl) locale(fldigi:pl) locale(fldigi:ru)"
RDEPENDS:${PN} += "fldigi"

inherit rpm
