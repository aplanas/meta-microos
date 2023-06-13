SUMMARY = "Documentation for texlive-miniplot"
DESCRIPTION = "This package includes the documentation for texlive-miniplot"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn17483"

RPM_NAME = "texlive-miniplot-doc-2023.201.svn17483-54.1.noarch.rpm"
RPM_HASH = "7c0039c1a61eb8ae16e7a189cc514850172242e7f9db93901da726997def3df1cce94ed922e9f1c0715cfc043962f8e2c0398e4b74b916b13c0036b9879adfc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-miniplot-doc"

RDEPENDS:${PN} += ""

inherit rpm
