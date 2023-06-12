SUMMARY = "Documentation for texlive-blindtext"
DESCRIPTION = "This package includes the documentation for texlive-blindtext"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn25039"

RPM_NAME = "texlive-blindtext-doc-2023.201.2.0svn25039-52.1.noarch.rpm"
RPM_HASH = "f8906cd314ba2dc7b69f84d123097c5f32c771a3d58e64a48cd866d514a2fd9c20a996df23fb6b4f3481a8dfd88067020dddf79686aa3180e5a53d847026be92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-blindtext-doc"
RDEPENDS:${PN} += ""

inherit rpm
