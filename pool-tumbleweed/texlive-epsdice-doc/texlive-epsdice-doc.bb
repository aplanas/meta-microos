SUMMARY = "Documentation for texlive-epsdice"
DESCRIPTION = "This package includes the documentation for texlive-epsdice"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn15878"

RPM_NAME = "texlive-epsdice-doc-2023.209.2.1svn15878-54.1.noarch.rpm"
RPM_HASH = "0b13d53ce6ee0601f1d9806355c0775beddc4b7539239039b34d7be36d40c1e6add81ad86d6ab92606bc8190ce777bd11d920ade3fa2b2e4b0a70baea0f4ad09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epsdice-doc"

RDEPENDS:${PN} += ""

inherit rpm
