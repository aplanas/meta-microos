SUMMARY = "Documentation for texlive-tetragonos"
DESCRIPTION = "This package includes the documentation for texlive-tetragonos"
LICENSE = "LPPL-1.0"

PV = "2023.201.1svn49732"

RPM_NAME = "texlive-tetragonos-doc-2023.201.1svn49732-54.1.noarch.rpm"
RPM_HASH = "2b0768563d301aa01c075362fbec88b934956b3489dffba80d4dce65074a1a796259faa88a75f9c6629124a78150f3d21b36fad44faa883f0e9f5d94164100b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-tetragonos-doc:zh) \
texlive-tetragonos-doc"
RDEPENDS:${PN} += ""

inherit rpm
