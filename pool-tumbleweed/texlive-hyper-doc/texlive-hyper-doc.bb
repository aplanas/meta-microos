SUMMARY = "Documentation for texlive-hyper"
DESCRIPTION = "This package includes the documentation for texlive-hyper"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.2dsvn17357"

RPM_NAME = "texlive-hyper-doc-2023.209.4.2dsvn17357-54.1.noarch.rpm"
RPM_HASH = "c3f9468aec546ad97ac2c14ba6cb720d015a4b67894580610285f8707b6ee547fe1f5dbdf1dbc90e5a7a086548e53bf5ab44de208e443a7b701b7d6b745f799f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hyper-doc"

RDEPENDS:${PN} += ""

inherit rpm
