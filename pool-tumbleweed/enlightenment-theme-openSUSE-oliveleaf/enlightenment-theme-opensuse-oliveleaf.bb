SUMMARY = "Enlightenment theme from openSUSE 13.1"
DESCRIPTION = "This is a darker theme for enlightenment, it was the default for openSUSE 13.1"
LICENSE = "BSD-2-Clause & LGPL-2.1 & CC-BY-SA-3.0"

PV = "20220219.1.26"

RPM_NAME = "enlightenment-theme-openSUSE-oliveleaf-20220219.1.26-1.12.noarch.rpm"
RPM_HASH = "e8a35cc235513a626f9458ce6f7fc344817cf1b04c40cab87ffa4bc5a8359ce2b289dc8b35941a449969d2fa18560eace1cd2349370a7c018d1845c9a480ec40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "enlightenment-theme \
enlightenment-theme-openSUSE-oliveleaf"

RDEPENDS:${PN} += ""

inherit rpm
