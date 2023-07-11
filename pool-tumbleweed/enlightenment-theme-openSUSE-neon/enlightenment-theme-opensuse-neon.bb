SUMMARY = "openSUSE theme for Enlightenment"
DESCRIPTION = "openSUSE, theme for Enlightenment"
LICENSE = "BSD-2-Clause & LGPL-2.1-only & CC-BY-SA-3.0"

PV = "20220219.1.26"

RPM_NAME = "enlightenment-theme-openSUSE-neon-20220219.1.26-1.12.noarch.rpm"
RPM_HASH = "c63fa2dfc7b8c0e61dc3c9eebef3acf1561b05335c75bbf63626465e02a63ae58f7a2703447a07f326bc6f7ca4a6ed2121859e4e581fba1514b7462529a8e3f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "enlightenment-theme \
enlightenment-theme-openSUSE-neon"

RDEPENDS:${PN} += ""

inherit rpm
