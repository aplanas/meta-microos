SUMMARY = "YaST2 - Estonian Translations"
DESCRIPTION = "YaST2 - Translations for Estonian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-et-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "ba8b470fbb9fd304c3ccec7f45c3aa20fd74fff245a9dfdf3a81bb5c44f8cfad17a3026aef81dc0c2d8f972878fd1a076450b72d8b2b5d73c08f37fccf763112"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-et \
yast2-trans-et"

RDEPENDS:${PN} += ""

inherit rpm
