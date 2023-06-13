SUMMARY = "Documentation for texlive-ifoddpage"
DESCRIPTION = "This package includes the documentation for texlive-ifoddpage"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn64967"

RPM_NAME = "texlive-ifoddpage-doc-2023.201.1.2svn64967-52.1.noarch.rpm"
RPM_HASH = "01185d8f8e0d7fd5bb9ef20c00ad91f23e266e91bc8af744a53293e35ea18eaea3fe7bf06222e822b17044dead92fdde2adf90babb852378665d07e4cd9deaeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ifoddpage-doc"

RDEPENDS:${PN} += ""

inherit rpm
