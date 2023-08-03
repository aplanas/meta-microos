SUMMARY = "Documentation for texlive-zref"
DESCRIPTION = "This package includes the documentation for texlive-zref"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.34svn62977"

RPM_NAME = "texlive-zref-doc-2023.209.2.34svn62977-53.1.noarch.rpm"
RPM_HASH = "c5762b956dc88d9b9edb0675bddc4bae2a1672117a56f2c824ed21a6f5a3916e97384fc905764fa07f3b2e306922947e61c94fef0a6c8a9b7638bcc2cd67c059"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zref-doc"

RDEPENDS:${PN} += ""

inherit rpm
