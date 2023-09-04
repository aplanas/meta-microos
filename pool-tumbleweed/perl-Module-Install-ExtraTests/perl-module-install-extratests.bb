SUMMARY = "Contextual Tests That the Harness Can Ignore"
DESCRIPTION = "contextual tests that the harness can ignore"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.008"

RPM_NAME = "perl-Module-Install-ExtraTests-0.008-6.23.noarch.rpm"
RPM_HASH = "88174fc52a1316c6589bfd9011b20840f67c187fa1ecae116002e1196932f2af37d8a1027454b38a5ab3c1c09d8a96258469a287cac3866b9cfca4e2eea3dead"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Install--ExtraTests \
perl-Module-Install-ExtraTests"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
