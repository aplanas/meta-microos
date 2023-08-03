SUMMARY = "Documentation for texlive-universa"
DESCRIPTION = "This package includes the documentation for texlive-universa"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.1svn51984"

RPM_NAME = "texlive-universa-doc-2023.209.2.1svn51984-54.1.noarch.rpm"
RPM_HASH = "2aad01db758d289c2d9c62f000e4d0789a5f0a001d462ee6f8d77c09741e361d01e450fbc9bf3f590a58fed12afaa687fd45d5077af36ba46585edf056522f68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-universa-doc"

RDEPENDS:${PN} += ""

inherit rpm
