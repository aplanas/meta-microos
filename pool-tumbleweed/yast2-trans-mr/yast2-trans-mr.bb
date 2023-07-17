SUMMARY = "YaST2 - Marathi Translations"
DESCRIPTION = "YaST2 - Translations for Marathi."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-mr-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "aca1e4156e47f06420d12ee56d94d7d47a462cdefd57d57f0b07b6335bf52e0a64ac9dbdf9d4429a08ccf3288a8ab0b5e7aec6d2aa5110a4f0de8d7eca878e7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-mr \
yast2-trans-mr"

RDEPENDS:${PN} += ""

inherit rpm
