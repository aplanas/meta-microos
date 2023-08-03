SUMMARY = "Documentation for texlive-pst-asr"
DESCRIPTION = "This package includes the documentation for texlive-pst-asr"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn22138"

RPM_NAME = "texlive-pst-asr-doc-2023.209.1.3svn22138-53.1.noarch.rpm"
RPM_HASH = "6c9f4fbe3a92591f6ec871baf992153e71c28e4d25ea6991d6c4f198efd412bcc85e745f055df5a6acd9099624d3fec7f02f0527102c5dabb1ec5514f254060c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-asr-doc"

RDEPENDS:${PN} += ""

inherit rpm
