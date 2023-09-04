SUMMARY = "YaST2 - Kannada Translations"
DESCRIPTION = "YaST2 - Translations for Kannada."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-kn-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "21ec65fbfb17d5e315e53b8f35083de34e965a1db593505ad31cb44d952e9e5ba4e0e9734681ba497de7815e1cd6515ac6dece4cb5f314241b415cae9416995e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ka \
yast2-trans-kn"

RDEPENDS:${PN} += ""

inherit rpm
