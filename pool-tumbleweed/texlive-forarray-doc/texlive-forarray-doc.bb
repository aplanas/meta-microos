SUMMARY = "Documentation for texlive-forarray"
DESCRIPTION = "This package includes the documentation for texlive-forarray"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.01svn15878"

RPM_NAME = "texlive-forarray-doc-2023.209.1.01svn15878-53.1.noarch.rpm"
RPM_HASH = "68d52bd3dfa4b8be1adea2f85a6b76cc117262df30a60aa460bd9d9779075c9d086fa792e5af10ff53b367eec330a6e3881f62801e26d872f65f4eb2ce80cd73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-forarray-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
