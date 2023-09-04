SUMMARY = "Binary files of pst-pdf"
DESCRIPTION = "Binary files of pst-pdf"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn7838"

RPM_NAME = "texlive-pst-pdf-bin-2023.20230311.svn7838-93.2.aarch64.rpm"
RPM_HASH = "cf3bf413e9c361c733bb38852d5757f25fd8d7fce0c9286ccd3d41f9ca8fe1f5aebd5053fc204cff26577ac2fc68cb11518e9e5d74dfd8e9c946391b0a586bdd"

RPROVIDES:${PN} += "texlive-pst-pdf-bin"

RDEPENDS:${PN} += "texlive-pst-pdf"

inherit rpm
