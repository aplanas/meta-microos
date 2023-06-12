SUMMARY = "Documentation for texlive-poormanlog"
DESCRIPTION = "This package includes the documentation for texlive-poormanlog"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.07svn63400"

RPM_NAME = "texlive-poormanlog-doc-2023.201.0.0.07svn63400-52.1.noarch.rpm"
RPM_HASH = "eb886ccb597a0fb87518b9eea472eacbbdb18078b7a444f9ec18edb888a3451428f4f39f948641ee9b328ee66321b1aafee5cb9409153a73bd0171bfe1bff20d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-poormanlog-doc"
RDEPENDS:${PN} += ""

inherit rpm
