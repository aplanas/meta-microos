SUMMARY = "Documentation for texlive-eqnarray"
DESCRIPTION = "This package includes the documentation for texlive-eqnarray"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.3svn20641"

RPM_NAME = "texlive-eqnarray-doc-2023.201.1.3svn20641-53.1.noarch.rpm"
RPM_HASH = "84e09e8dc12920d1cc9a66874fd1c06206b27502416f3c16f3e6d60750284b1bac948ddc2beb7530fb89983cf39dda6f8f9e39f00a4e6fc25c7bdd4bcb8d93f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eqnarray-doc"

RDEPENDS:${PN} += ""

inherit rpm
