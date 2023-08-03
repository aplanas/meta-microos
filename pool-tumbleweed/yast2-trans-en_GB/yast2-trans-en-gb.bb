SUMMARY = "YaST2 - British English Translations"
DESCRIPTION = "YaST2 - Translations for British English."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-en_GB-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "38ee1a48286650dcd2bb7e159bdc0bb145e13b96273a78e11ca591e12ce68f8614b8b8464f94f5367e5a1eb85ec73d4eb2a5c7f1d4322c396c78731b6f37789b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-en-GB \
yast2-trans-en-GB"

RDEPENDS:${PN} += ""

inherit rpm
