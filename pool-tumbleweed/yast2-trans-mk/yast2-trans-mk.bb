SUMMARY = "YaST2 - Macedonian Translations"
DESCRIPTION = "YaST2 - Translations for Macedonian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-mk-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "6c8732278ff520cdec6ac6829e81bcc8483943bf6cb4795f4457b5b46731bbdf5ffa98e12551221ddd8db31b63389fa1705bc75af9a6e3d2af514a7ac601424b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-mk \
yast2-trans-mk"

RDEPENDS:${PN} += ""

inherit rpm
