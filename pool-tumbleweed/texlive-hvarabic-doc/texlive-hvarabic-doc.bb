SUMMARY = "Documentation for texlive-hvarabic"
DESCRIPTION = "This package includes the documentation for texlive-hvarabic"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.02svn59423"

RPM_NAME = "texlive-hvarabic-doc-2023.201.0.0.02svn59423-52.1.noarch.rpm"
RPM_HASH = "ba22188a8c2e5bfb7fdd49d04706acfb36c25453d5fc62a5b81186988822ba066aafa76c05610a83aeaa8c74d0499407e07b1d8b9aec40df8e72ee6ecc09b95d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hvarabic-doc"

RDEPENDS:${PN} += ""

inherit rpm
