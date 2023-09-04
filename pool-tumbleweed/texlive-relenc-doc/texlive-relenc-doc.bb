SUMMARY = "Documentation for texlive-relenc"
DESCRIPTION = "This package includes the documentation for texlive-relenc"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn22050"

RPM_NAME = "texlive-relenc-doc-2023.209.svn22050-54.2.noarch.rpm"
RPM_HASH = "d6eef84ae0d4318527ce4224fb5f1796912a88e5929e2efeaec100c77d6f7061fdabb78559bfed3e4e030fa2c185a407da7512a5e297383e93ffee24d824be72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-relenc-doc"

RDEPENDS:${PN} += ""

inherit rpm
