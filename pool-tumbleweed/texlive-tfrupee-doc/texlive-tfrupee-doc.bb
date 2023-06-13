SUMMARY = "Documentation for texlive-tfrupee"
DESCRIPTION = "This package includes the documentation for texlive-tfrupee"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.02svn20770"

RPM_NAME = "texlive-tfrupee-doc-2023.201.1.02svn20770-54.1.noarch.rpm"
RPM_HASH = "a0a0b3015ec2ece9ce705d6f402c02712ea60a3932be9e40a1dc4bdba1f64ba867cc15cbf9a5857dc8a9ffc44d6d4d6599751ceb98fd6bad8f9309d6cdf75bd8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tfrupee-doc"

RDEPENDS:${PN} += ""

inherit rpm
