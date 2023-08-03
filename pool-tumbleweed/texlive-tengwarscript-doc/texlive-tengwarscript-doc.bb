SUMMARY = "Documentation for texlive-tengwarscript"
DESCRIPTION = "This package includes the documentation for texlive-tengwarscript"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3.1svn34594"

RPM_NAME = "texlive-tengwarscript-doc-2023.209.1.3.1svn34594-55.1.noarch.rpm"
RPM_HASH = "bb64056f4cc2642391627a8127730ac906f6f9fc9bf850bdf95750e66c5c68f0fe94b8f8ebdd81a77aa0349b0af3febe9277dc0739b750e50b6bae58d20daa09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tengwarscript-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
