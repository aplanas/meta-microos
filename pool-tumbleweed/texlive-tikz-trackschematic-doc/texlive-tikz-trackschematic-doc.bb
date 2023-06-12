SUMMARY = "Documentation for texlive-tikz-trackschematic"
DESCRIPTION = "This package includes the documentation for texlive-tikz-trackschematic"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7.1svn63480"

RPM_NAME = "texlive-tikz-trackschematic-doc-2023.201.0.0.7.1svn63480-52.1.noarch.rpm"
RPM_HASH = "0f75aaa2d1960a82eac9c21dbcc0078dc99aa3ea169e3a9d24baa26566836cafad4eff6649b6d58946ac884a0099ea1ea0685132b949af5ef9ad96f4a4aa415b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-trackschematic-doc"
RDEPENDS:${PN} += ""

inherit rpm
