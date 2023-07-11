SUMMARY = "Headers and development files"
DESCRIPTION = "genders headers and libraries files needed for development"
LICENSE = "GPL-2.0-or-later"

PV = "1.28.1"

RPM_NAME = "genders-devel-1.28.1-2.5.aarch64.rpm"
RPM_HASH = "087c1741859724458ae6a36c63d2bdfaab5b1cb11521b6b4948a6412482824aac35222d7752bd0d0b16d04a169d265dd86752744ec0a201dbe0e22ad7b203e99"

RPROVIDES:${PN} += "genders-devel"

RDEPENDS:${PN} += "genders"

inherit rpm
