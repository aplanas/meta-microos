SUMMARY = "Documentation for texlive-shtthesis"
DESCRIPTION = "This package includes the documentation for texlive-shtthesis"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.3.3svn62441"

RPM_NAME = "texlive-shtthesis-doc-2023.201.0.0.3.3svn62441-53.1.noarch.rpm"
RPM_HASH = "4b9f50e2ee606740415a8242b6a5f1004fe67ff3311341dfd516b0f5ee4caa075731416ea0e97c7744584a6e518e4d24ffa3a58b1edd4543f45dd3b76799e921"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-shtthesis-doc-zh \
texlive-shtthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
