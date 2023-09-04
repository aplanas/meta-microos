SUMMARY = "YaST2 - Italian Translations"
DESCRIPTION = "YaST2 - translations for Italian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-it-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "1eeb3e522584e7c407171ec3ca25d5cd61907a7253d164fb284d94beefb996395d18e4473cbb3e4a12d09aff15619487b805a2834a32a2cb10af8cd4f8df1a21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-it \
yast2-trans-it"

RDEPENDS:${PN} += ""

inherit rpm
