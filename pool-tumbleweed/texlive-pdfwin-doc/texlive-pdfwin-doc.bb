SUMMARY = "Documentation for texlive-pdfwin"
DESCRIPTION = "This package includes the documentation for texlive-pdfwin"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn54074"

RPM_NAME = "texlive-pdfwin-doc-2023.209.svn54074-52.1.noarch.rpm"
RPM_HASH = "76ad3350800c5eae4449d16861ba9ea49bf4574814d8ad9659187a1487ce37925d48c3d90448ee6fd0a1f347e7288b681a0c2ac23502dfde065b9eda5cb81890"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfwin-doc"

RDEPENDS:${PN} += ""

inherit rpm
