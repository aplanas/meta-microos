SUMMARY = "Documentation for texlive-flacards"
DESCRIPTION = "This package includes the documentation for texlive-flacards"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.1.1bsvn19440"

RPM_NAME = "texlive-flacards-doc-2023.209.0.0.1.1bsvn19440-53.1.noarch.rpm"
RPM_HASH = "2af8e29ed7f283d05433b5d60d7a4ce47a770213dd87e89dd473ca7f822d3b0250d5d1700908ca811767cbefb3e05b306a0ffaaf15de727233cfe01f02a89edf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-flacards-doc"

RDEPENDS:${PN} += ""

inherit rpm
