SUMMARY = "Documentation for texlive-spacingtricks"
DESCRIPTION = "This package includes the documentation for texlive-spacingtricks"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6svn66393"

RPM_NAME = "texlive-spacingtricks-doc-2023.201.1.6svn66393-57.1.noarch.rpm"
RPM_HASH = "1d6c82ca6e15b46a334d53068b3c666cb163150b4670f09ad42a8196371be855fc756b9092e465b6818cb035fb1b3650c4335e9f040aa435fd0a7ee14f58a99b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-spacingtricks-doc"

RDEPENDS:${PN} += ""

inherit rpm
