SUMMARY = "Documentation for texlive-ptolemaicastronomy"
DESCRIPTION = "This package includes the documentation for texlive-ptolemaicastronomy"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn50810"

RPM_NAME = "texlive-ptolemaicastronomy-doc-2023.209.1.0svn50810-54.2.noarch.rpm"
RPM_HASH = "b442ddc298340eeab1ba06338f9a269ff858ab146dfbd023a5c54fcbcdf96639ececc39a64a3d5df0c385a909b729c651ce9bb0b5cc4e685e62900443bebdc83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ptolemaicastronomy-doc"

RDEPENDS:${PN} += ""

inherit rpm
