SUMMARY = "Documentation for texlive-pst-diffraction"
DESCRIPTION = "This package includes the documentation for texlive-pst-diffraction"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.03svn62977"

RPM_NAME = "texlive-pst-diffraction-doc-2023.209.2.03svn62977-53.1.noarch.rpm"
RPM_HASH = "a7daa449b0714d18cab61246b1d88684aac89a10d69ab92fabf67bc180a3c1ace3a077145bbfcb8543cb0c97e41e3883ed3508a4217d3206589761bcd484254e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-diffraction-doc-de;en;fr \
texlive-pst-diffraction-doc"

RDEPENDS:${PN} += ""

inherit rpm
