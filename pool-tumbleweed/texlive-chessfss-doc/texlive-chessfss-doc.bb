SUMMARY = "Documentation for texlive-chessfss"
DESCRIPTION = "This package includes the documentation for texlive-chessfss"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2asvn19440"

RPM_NAME = "texlive-chessfss-doc-2023.209.1.2asvn19440-54.1.noarch.rpm"
RPM_HASH = "bbb3a7c234c74cf4710d033beb3f493b0f05d212d69badec1c6302cab10651ce346948928ac6b95d21e3335dc860718c52893a75609219de0a4224d6c9f933b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chessfss-doc"

RDEPENDS:${PN} += ""

inherit rpm
