SUMMARY = "YaST2 - Finnish Translations"
DESCRIPTION = "YaST2 - Finnish translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-fi-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "e8cb161173e7e0d1734e92d05b51800ea5520569712cc238858387e6cecb20c5be87db6960436bf8e46f9773b0e46abe75a0f93a2078784bbefd6a0d17764311"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-fi \
yast2-trans-fi"

RDEPENDS:${PN} += ""

inherit rpm
