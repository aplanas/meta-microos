SUMMARY = "Documentation for texlive-expkv-bundle"
DESCRIPTION = "This package includes the documentation for texlive-expkv-bundle"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn65623"

RPM_NAME = "texlive-expkv-bundle-doc-2023.209.svn65623-53.1.noarch.rpm"
RPM_HASH = "dc321a95361f40e2a3271231c433ac1ceff7564cb344fa87b47e96ca8b73ee00e164203929450e2d8374f7eb88f470e79794df5f6c1c391adcf0b945aac22da4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-expkv-bundle-doc"

RDEPENDS:${PN} += ""

inherit rpm
