SUMMARY = "YaST2 - Kannada Translations"
DESCRIPTION = "YaST2 - Translations for Kannada."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-kn-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "2d600ab5c57c07267766ba317faace70220b745b7c1ad50528639d9a4cb137ed1cf869117d2fd009baf20c6ac9afc832548fbc09b2622e2feb29414cf1a03341"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ka \
yast2-trans-kn"

RDEPENDS:${PN} += ""

inherit rpm
