SUMMARY = "Translations for package fldigi"
DESCRIPTION = "Provides translations for the 'fldigi' package."
LICENSE = "GPL-3.0-only"

PV = "4.2.00"

RPM_NAME = "fldigi-lang-4.2.00-1.1.noarch.rpm"
RPM_HASH = "2786ff4705a2a977af8a991a341f2e3b087ea31ba8a8cb9bf2374e6d8844af63d03501c803c3419e776a62792d03e43d6e8547ebfe4a841a9b0ade430a285e15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fldigi-lang \
fldigi-lang-all \
locale-fldigi-de \
locale-fldigi-el \
locale-fldigi-es \
locale-fldigi-fr \
locale-fldigi-it \
locale-fldigi-nl \
locale-fldigi-pl \
locale-fldigi-ru"

RDEPENDS:${PN} += "fldigi"

inherit rpm
