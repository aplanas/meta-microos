SUMMARY = "YaST2 - Portuguese Translations"
DESCRIPTION = "YaST2 - Translations for Portuguese."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-pt-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "b5501cfdbae0108a34bc44cbcfc2ba42fade6136c0671fda3f32e656f584e0e5682253bc9a5d5741f212b324d7b00b90684564166ffe0674ae624fa7565faf87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-pt \
yast2-trans-pt"

RDEPENDS:${PN} += ""

inherit rpm
