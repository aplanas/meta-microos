SUMMARY = "Documentation for texlive-pigpen"
DESCRIPTION = "This package includes the documentation for texlive-pigpen"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn15878"

RPM_NAME = "texlive-pigpen-doc-2023.209.0.0.2svn15878-52.1.noarch.rpm"
RPM_HASH = "3105163ea9bb6fff65102e89309f0d2162bc83a9ccd267d06db479ac7c2845c6feb46845c4711255dfa2d9e50cb64d2ba28eea2e1d30084467fc0a2be98bbbc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pigpen-doc"

RDEPENDS:${PN} += ""

inherit rpm
