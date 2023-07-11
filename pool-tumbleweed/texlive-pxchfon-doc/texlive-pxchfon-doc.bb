SUMMARY = "Documentation for texlive-pxchfon"
DESCRIPTION = "This package includes the documentation for texlive-pxchfon"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.9asvn66064"

RPM_NAME = "texlive-pxchfon-doc-2023.201.1.9asvn66064-53.2.noarch.rpm"
RPM_HASH = "692f9f3b1449ab5b3afe78374082cfd1b2a3e5613149e94f751e5e3ac133d395b0a06125838246000c0deaf515cf50d2e0b3e9f2c0105d83929d87da9b0de72c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pxchfon-doc-ja \
texlive-pxchfon-doc"

RDEPENDS:${PN} += ""

inherit rpm
