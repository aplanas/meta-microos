SUMMARY = "Documentation for texlive-lecturer"
DESCRIPTION = "This package includes the documentation for texlive-lecturer"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn23916"

RPM_NAME = "texlive-lecturer-doc-2023.201.svn23916-54.1.noarch.rpm"
RPM_HASH = "a9ceca94f550edff9f42e7a91fefbe58fccd9c26d8e36478a07c70b6f9224148ae32ddb84313199ef58ce9a9a0fcc21154e98fa6f067dc96adc7e4eac1cae334"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lecturer-doc"
RDEPENDS:${PN} += ""

inherit rpm
