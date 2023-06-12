SUMMARY = "Documentation for texlive-fancylabel"
DESCRIPTION = "This package includes the documentation for texlive-fancylabel"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn46736"

RPM_NAME = "texlive-fancylabel-doc-2023.201.1.1svn46736-52.1.noarch.rpm"
RPM_HASH = "ae6126f2575c2895977a336fd264917c197bf0e8eb1ead50897fdc6779a091dc97468338f47c80d535009779e4007f9dc3441b3477124a1153c82c3006538b5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fancylabel-doc"
RDEPENDS:${PN} += ""

inherit rpm
