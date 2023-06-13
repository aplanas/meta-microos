SUMMARY = "Documentation for texlive-esrelation"
DESCRIPTION = "This package includes the documentation for texlive-esrelation"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn37236"

RPM_NAME = "texlive-esrelation-doc-2023.201.svn37236-52.1.noarch.rpm"
RPM_HASH = "5657d1b88f893ec7cc9613b46a826f40944e5e2ef6abe4037533d818a45b0f271df87c0aedb34c3e78f83ad2b8fbb86ccc88bf3f207e1d133e40cc8d013c367d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-esrelation-doc"

RDEPENDS:${PN} += ""

inherit rpm
