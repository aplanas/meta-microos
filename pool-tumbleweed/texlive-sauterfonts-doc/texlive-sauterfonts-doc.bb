SUMMARY = "Documentation for texlive-sauterfonts"
DESCRIPTION = "This package includes the documentation for texlive-sauterfonts"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-sauterfonts-doc-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "c36e035e23c99416f31d08721fae1bd2234665fea55d2310b8c37b5dfe67ddef6ee9a57b6d5bcc294e8804978883c8db22485294842d56184ac705d76dac310a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sauterfonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
