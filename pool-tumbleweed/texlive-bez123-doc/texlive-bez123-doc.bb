SUMMARY = "Documentation for texlive-bez123"
DESCRIPTION = "This package includes the documentation for texlive-bez123"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1bsvn15878"

RPM_NAME = "texlive-bez123-doc-2023.209.1.1bsvn15878-54.1.noarch.rpm"
RPM_HASH = "eb03f951ca5d0d7adb7269645b3a1d915fd384ab5d6b05b60090ab993690595903d35d5cbfb4f723fb7bbe040c559966acab72331367f5e89ee6e8b580c64383"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bez123-doc"

RDEPENDS:${PN} += ""

inherit rpm
