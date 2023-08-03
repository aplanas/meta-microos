SUMMARY = "Documentation for texlive-umtypewriter"
DESCRIPTION = "This package includes the documentation for texlive-umtypewriter"
LICENSE = "OFL-1.1"

PV = "2023.209.1.1svn64443"

RPM_NAME = "texlive-umtypewriter-doc-2023.209.1.1svn64443-54.1.noarch.rpm"
RPM_HASH = "9a4184e5a9fbc414fdd6dfb939c0162118491f4728a7998a3fdedc68183990e16c48d6143c546ed4e392eec103ff597dde378640ba72453b4491235154267fb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-umtypewriter-doc"

RDEPENDS:${PN} += ""

inherit rpm
