SUMMARY = "Documentation for texlive-lengthconvert"
DESCRIPTION = "This package includes the documentation for texlive-lengthconvert"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0asvn55064"

RPM_NAME = "texlive-lengthconvert-doc-2023.209.1.0asvn55064-55.1.noarch.rpm"
RPM_HASH = "01f13e19e61d9a1b60918af71066764c56cf22d48450433cb74500015ef2a0b185a22fea770292622efe09ffc04060b4e75712681d52ec79f0d11e66b004eea6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lengthconvert-doc"

RDEPENDS:${PN} += ""

inherit rpm
