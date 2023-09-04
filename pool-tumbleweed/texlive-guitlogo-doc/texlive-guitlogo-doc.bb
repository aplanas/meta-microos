SUMMARY = "Documentation for texlive-guitlogo"
DESCRIPTION = "This package includes the documentation for texlive-guitlogo"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.0_alpha.4svn55741"

RPM_NAME = "texlive-guitlogo-doc-2023.209.1.0.0_alpha.4svn55741-54.2.noarch.rpm"
RPM_HASH = "f8b3b705dc2e713ec6b112eef4d2996235275faad4063bb4c9ee8e4642f9ac895e6ae4358687ad1e2e349acef6f99be4d621b3aadbe38c7842d44bfaea7abd91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-guitlogo-doc-it \
texlive-guitlogo-doc"

RDEPENDS:${PN} += ""

inherit rpm
