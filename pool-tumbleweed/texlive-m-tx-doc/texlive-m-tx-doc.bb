SUMMARY = "Documentation for texlive-m-tx"
DESCRIPTION = "This package includes the documentation for texlive-m-tx"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.63dsvn64182"

RPM_NAME = "texlive-m-tx-doc-2023.201.0.0.63dsvn64182-52.1.noarch.rpm"
RPM_HASH = "e8dca9781543cb9f571cef9248eb14a14abae71c34c792ca2c4bcef9e95f2a4223d0a99bd6f23772e9cef0bd9290bb2397e21329d81def419a1ff1007239725b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(prepmx.1) \
texlive-m-tx-doc"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/luatex \
/usr/bin/texlua"

inherit rpm
