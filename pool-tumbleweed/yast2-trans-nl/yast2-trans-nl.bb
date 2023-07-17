SUMMARY = "YaST2 - Dutch Translations"
DESCRIPTION = "YaST2 - Translations for Dutch."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-nl-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "19ebc675de4a11dd8edb017ebf83a9599d7b237d372f938ae71a901d4a3b5380ec5c2e13dc006a6527ef97b5f0ebebda1d1cfb21a11eaf9598ba15f8bcc930d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-nl \
yast2-trans-nl"

RDEPENDS:${PN} += ""

inherit rpm
