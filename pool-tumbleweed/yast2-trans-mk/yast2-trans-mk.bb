SUMMARY = "YaST2 - Macedonian Translations"
DESCRIPTION = "YaST2 - Translations for Macedonian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-mk-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "1d7ad9956d02fcc3d837b4197143b6ea01a99340ee35b71475f82e115cef8f2bfc25ee372d6d270adb573a11cf47e7416dde0753c5501e401355d638fa472cf6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-mk \
yast2-trans-mk"

RDEPENDS:${PN} += ""

inherit rpm
