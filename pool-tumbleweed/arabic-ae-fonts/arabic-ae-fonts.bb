SUMMARY = "Arabic Free and Open Source Fonts"
DESCRIPTION = "Arabic TrueType fonts collected by Arab Eyes (www.arabeyes.org)."
LICENSE = "GPL-2.0-only"

PV = "2.0"

RPM_NAME = "arabic-ae-fonts-2.0-18.15.noarch.rpm"
RPM_HASH = "676f43176eef8fd96bac4a78956830614d26cda80313e222eef03835bc891cbee71646cb2aed3a180906564c67cad9b1ffef95b2cd9cae9aa49222c34726a529"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arabic-ae-fonts \
locale-ar"

RDEPENDS:${PN} += ""

inherit rpm
