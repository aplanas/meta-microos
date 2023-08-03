SUMMARY = "Documentation for texlive-josefin"
DESCRIPTION = "This package includes the documentation for texlive-josefin"
LICENSE = "OFL-1.1"

PV = "2023.209.svn64569"

RPM_NAME = "texlive-josefin-doc-2023.209.svn64569-56.1.noarch.rpm"
RPM_HASH = "18b70ca265877478ea245b27f3972f1f19af324e096bd285678f3dd00ab9ae9bfb3c0416a1d5c095ec7ee119ae5e37a63555d98d246965aba9d1d831b2ff3997"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-josefin-doc"

RDEPENDS:${PN} += ""

inherit rpm
