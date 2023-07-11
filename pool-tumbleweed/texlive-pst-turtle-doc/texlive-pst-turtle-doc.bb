SUMMARY = "Documentation for texlive-pst-turtle"
DESCRIPTION = "This package includes the documentation for texlive-pst-turtle"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.02svn52261"

RPM_NAME = "texlive-pst-turtle-doc-2023.201.0.0.02svn52261-53.2.noarch.rpm"
RPM_HASH = "646ee88f6b45d2e96b0dd2ee97375fc430938b275c8c78db46ed34cd75d22f3dfcfab7fb06ec9c6ade8950ec873f74eaaf1084b64f5ff32aa2b4f7bf39090c5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-turtle-doc"

RDEPENDS:${PN} += ""

inherit rpm
