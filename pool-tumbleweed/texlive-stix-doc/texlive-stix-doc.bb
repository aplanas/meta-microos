SUMMARY = "Documentation for texlive-stix"
DESCRIPTION = "This package includes the documentation for texlive-stix"
LICENSE = "OFL-1.1"

PV = "2023.209.1.1.3svn54512"

RPM_NAME = "texlive-stix-doc-2023.209.1.1.3svn54512-58.1.noarch.rpm"
RPM_HASH = "6efb86747b9471247e3d713e0f29609f9eab2074ad918c3010d5c73129259d98b9270b9741eabc28f10315fdaacd4f7dbfb89a0adbca81ddf2de16c831464750"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-stix-doc"

RDEPENDS:${PN} += ""

inherit rpm
