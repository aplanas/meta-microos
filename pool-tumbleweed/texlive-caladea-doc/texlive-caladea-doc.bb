SUMMARY = "Documentation for texlive-caladea"
DESCRIPTION = "This package includes the documentation for texlive-caladea"
LICENSE = "Apache-1.0"

PV = "2023.209.svn64549"

RPM_NAME = "texlive-caladea-doc-2023.209.svn64549-53.1.noarch.rpm"
RPM_HASH = "b723f4e5972a1f16945b9bc7ea2dc32c87fceb2fc98d7f000bf9ed1aa98d41192a6ef28cab2c1b9cd169b6f2c5f1e20eb64a83c12fdd459df055df9a71dadb66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-caladea-doc"

RDEPENDS:${PN} += ""

inherit rpm
