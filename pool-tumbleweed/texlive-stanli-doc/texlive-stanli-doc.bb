SUMMARY = "Documentation for texlive-stanli"
DESCRIPTION = "This package includes the documentation for texlive-stanli"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.3.0svn54512"

RPM_NAME = "texlive-stanli-doc-2023.209.3.0svn54512-58.1.noarch.rpm"
RPM_HASH = "5d1422d914d513c8008b967951a2cfc2c5631447347ec0df28783f7f86b32b9b5ddd90ef38b58a077b4737c9a7f1f319beeb259eb5c3b6a4f2be75fcf7b1084c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-stanli-doc"

RDEPENDS:${PN} += ""

inherit rpm
