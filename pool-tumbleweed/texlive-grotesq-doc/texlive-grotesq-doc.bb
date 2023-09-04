SUMMARY = "Documentation for texlive-grotesq"
DESCRIPTION = "This package includes the documentation for texlive-grotesq"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn35859"

RPM_NAME = "texlive-grotesq-doc-2023.209.svn35859-54.2.noarch.rpm"
RPM_HASH = "bb160807f4880c4592a4c5d496d60bfb4d48f118f93f304df9ae7b474d4bba031d467873eb1c430f8090a861020b80b4fa24588302991fcfb179c1083f186ba0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-grotesq-doc"

RDEPENDS:${PN} += ""

inherit rpm
