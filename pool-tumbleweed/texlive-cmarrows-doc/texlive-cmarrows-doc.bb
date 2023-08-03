SUMMARY = "Documentation for texlive-cmarrows"
DESCRIPTION = "This package includes the documentation for texlive-cmarrows"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.9svn24378"

RPM_NAME = "texlive-cmarrows-doc-2023.209.0.0.9svn24378-54.1.noarch.rpm"
RPM_HASH = "e4081b1b41290e7e1ed09f8522d630d52b1546ca2d15e0a18fd3f29706d48e2d91ee1a4dbf7ebc2db0ef81bdedda30c88cd538d8e8eacfe3c9de6cb8a1d8a0fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cmarrows-doc"

RDEPENDS:${PN} += ""

inherit rpm
