SUMMARY = "Documentation for texlive-babel-indonesian"
DESCRIPTION = "This package includes the documentation for texlive-babel-indonesian"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0msvn43235"

RPM_NAME = "texlive-babel-indonesian-doc-2023.209.1.0msvn43235-54.1.noarch.rpm"
RPM_HASH = "6f5d432aa8a185c3c48cfe0f4d79bcde22fc39e207cb8eb0bddfb5b6a3b18e0f7f2c68235123e36d7effa1816423f00a98806235161d22e7dea70b86502c3482"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-indonesian-doc"

RDEPENDS:${PN} += ""

inherit rpm
