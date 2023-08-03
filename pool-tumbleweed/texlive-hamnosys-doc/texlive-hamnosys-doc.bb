SUMMARY = "Documentation for texlive-hamnosys"
DESCRIPTION = "This package includes the documentation for texlive-hamnosys"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.3svn61941"

RPM_NAME = "texlive-hamnosys-doc-2023.209.1.0.3svn61941-54.1.noarch.rpm"
RPM_HASH = "4b2d3adb2a3e7091410b243a1e610f56b2a72d53d59f98f78918a24e9fe1dd8f891061b0520ee80077226b84ee0068848d62b4737bed8ae4964b9117814a728b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hamnosys-doc"

RDEPENDS:${PN} += ""

inherit rpm
