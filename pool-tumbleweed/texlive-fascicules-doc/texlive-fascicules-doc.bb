SUMMARY = "Documentation for texlive-fascicules"
DESCRIPTION = "This package includes the documentation for texlive-fascicules"
LICENSE = "LPPL-1.0"

PV = "2023.201.1svn54080"

RPM_NAME = "texlive-fascicules-doc-2023.201.1svn54080-52.1.noarch.rpm"
RPM_HASH = "d218cb4566c430229828e15d42c09789ca3198291edba75000986328bc2128722439374ee1d65ce137691a5da86c9f2451564230981901bf244e57046a442da2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-fascicules-doc-fr \
texlive-fascicules-doc"

RDEPENDS:${PN} += ""

inherit rpm
