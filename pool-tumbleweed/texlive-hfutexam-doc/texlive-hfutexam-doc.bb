SUMMARY = "Documentation for texlive-hfutexam"
DESCRIPTION = "This package includes the documentation for texlive-hfutexam"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.7svn66550"

RPM_NAME = "texlive-hfutexam-doc-2023.209.1.7svn66550-54.2.noarch.rpm"
RPM_HASH = "afd1c2ac7d795c86bac1b8200a09bb817c55017076aee975451b531aac03751093a20d0815f64b935d82278ecff4e495de601226dc391d79e692407fd27414b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hfutexam-doc"

RDEPENDS:${PN} += ""

inherit rpm
