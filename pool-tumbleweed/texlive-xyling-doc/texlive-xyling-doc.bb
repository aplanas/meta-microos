SUMMARY = "Documentation for texlive-xyling"
DESCRIPTION = "This package includes the documentation for texlive-xyling"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn15878"

RPM_NAME = "texlive-xyling-doc-2023.201.1.1svn15878-52.1.noarch.rpm"
RPM_HASH = "dbe793f2c81bcb1b828a57846c641a32f85c96d89dc0833caad929188d95ab4bd65fc8773c8cf940fe59bb5e8022682aedc5b00c1c0793da19b7ca1f9b25273c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xyling-doc-en \
texlive-xyling-doc"

RDEPENDS:${PN} += ""

inherit rpm
