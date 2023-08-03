SUMMARY = "Documentation for texlive-snotez"
DESCRIPTION = "This package includes the documentation for texlive-snotez"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7svn61992"

RPM_NAME = "texlive-snotez-doc-2023.209.0.0.7svn61992-58.1.noarch.rpm"
RPM_HASH = "a98245455ab953e5c26635e443c414b9506b87ed287f9bdc04f94edefd743e92a26b3debffe2cbb3c5f8f022d0844c08b1aa1ef8021733e989f6976fbd492324"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-snotez-doc"

RDEPENDS:${PN} += ""

inherit rpm
