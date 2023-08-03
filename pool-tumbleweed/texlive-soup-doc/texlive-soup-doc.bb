SUMMARY = "Documentation for texlive-soup"
DESCRIPTION = "This package includes the documentation for texlive-soup"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.2svn50815"

RPM_NAME = "texlive-soup-doc-2023.209.1.0.2svn50815-58.1.noarch.rpm"
RPM_HASH = "cb3313e66270f0404245275b0cd958b9bbea19d0cbbdc6504023db0ce96fadbb662d9c577db26797d323f94abc481973692bb70ed6fd6c7916642a865f5011d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-soup-doc"

RDEPENDS:${PN} += ""

inherit rpm
