SUMMARY = "Documentation for texlive-dcpic"
DESCRIPTION = "This package includes the documentation for texlive-dcpic"
LICENSE = "LPPL-1.0"

PV = "2023.209.5.0.0svn30206"

RPM_NAME = "texlive-dcpic-doc-2023.209.5.0.0svn30206-53.1.noarch.rpm"
RPM_HASH = "38aec7ea177cb29d568e3b9d8503f27d69b6ddb9c18bb86cb586581e7c61d0a15067426b46d6697d8712d56d0353f0859211f38bd787b9a0ca55a300808b4c09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-dcpic-doc-en;pt \
texlive-dcpic-doc"

RDEPENDS:${PN} += ""

inherit rpm
