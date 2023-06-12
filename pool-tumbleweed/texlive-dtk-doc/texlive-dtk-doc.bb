SUMMARY = "Documentation for texlive-dtk"
DESCRIPTION = "This package includes the documentation for texlive-dtk"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.08nsvn65315"

RPM_NAME = "texlive-dtk-doc-2023.201.2.08nsvn65315-52.1.noarch.rpm"
RPM_HASH = "457850866e9509eea3ff5d9366b9e01d6352052201bceee24e3668cf223e4c8dff6e36012f9d977b60a3bc614aa59d822b493eb81476bcb63a4534134653f5af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-dtk-doc:de) \
texlive-dtk-doc"
RDEPENDS:${PN} += ""

inherit rpm
