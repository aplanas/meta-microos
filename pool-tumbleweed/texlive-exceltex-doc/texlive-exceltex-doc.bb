SUMMARY = "Documentation for texlive-exceltex"
DESCRIPTION = "This package includes the documentation for texlive-exceltex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.5.1svn26313"

RPM_NAME = "texlive-exceltex-doc-2023.201.0.0.5.1svn26313-52.1.noarch.rpm"
RPM_HASH = "580fccb785b997ab36bfd7e6f8ed39a764406a3f5191e28180fd0da1031d295b8af416b94b249e55b4473db90c953215373775928fe9b324b489c536967c4e15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-exceltex-doc"

RDEPENDS:${PN} += ""

inherit rpm
