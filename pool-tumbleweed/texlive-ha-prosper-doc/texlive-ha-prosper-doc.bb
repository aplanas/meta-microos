SUMMARY = "Documentation for texlive-ha-prosper"
DESCRIPTION = "This package includes the documentation for texlive-ha-prosper"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.21svn59651"

RPM_NAME = "texlive-ha-prosper-doc-2023.209.4.21svn59651-54.2.noarch.rpm"
RPM_HASH = "f8a9e89c76546860a05b9c495dcfe46eabd41577448706837465c9a25b9a55c4f9aa84917c1bb56105072b13c0683c0af5172bf8560ce4b4725eb2a485da7a7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ha-prosper-doc"

RDEPENDS:${PN} += ""

inherit rpm
