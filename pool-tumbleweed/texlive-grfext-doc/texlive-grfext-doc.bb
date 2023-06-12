SUMMARY = "Documentation for texlive-grfext"
DESCRIPTION = "This package includes the documentation for texlive-grfext"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn53024"

RPM_NAME = "texlive-grfext-doc-2023.201.1.3svn53024-53.1.noarch.rpm"
RPM_HASH = "23a03cae5d11b869c0a73b59f63a8a09e9c688fdc8b4da957097fbb7c7da2d7756fadeb2d06a0557a993df9436a4f2190df88569265517ff3f04f1511294bb38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-grfext-doc"
RDEPENDS:${PN} += ""

inherit rpm
