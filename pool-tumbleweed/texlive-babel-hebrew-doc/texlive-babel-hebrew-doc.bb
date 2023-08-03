SUMMARY = "Documentation for texlive-babel-hebrew"
DESCRIPTION = "This package includes the documentation for texlive-babel-hebrew"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3hsvn30273"

RPM_NAME = "texlive-babel-hebrew-doc-2023.209.2.3hsvn30273-54.1.noarch.rpm"
RPM_HASH = "a333c9dc82b8711a83450f4ef93f95efca4ea73db4810ed8d0676152375f6df1e79f4fb663f4bb0b64c597364c0e011b408a65728e4c5375bb6769c42e366251"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-hebrew-doc"

RDEPENDS:${PN} += ""

inherit rpm
