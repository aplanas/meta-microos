SUMMARY = "Documentation for texlive-pst-fun"
DESCRIPTION = "This package includes the documentation for texlive-pst-fun"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.04svn17909"

RPM_NAME = "texlive-pst-fun-doc-2023.209.0.0.04svn17909-53.1.noarch.rpm"
RPM_HASH = "ddb0f7861d1d49f4645d093255187bc0aae63bfd67454282fef85e5a173e9a013cdef54dfba604c6f4de5e1898f346a236881159fc2626f54916b1ccda5517c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-fun-doc"

RDEPENDS:${PN} += ""

inherit rpm
