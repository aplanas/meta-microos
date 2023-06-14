SUMMARY = "Documentation for texlive-eskdx"
DESCRIPTION = "This package includes the documentation for texlive-eskdx"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.98svn29235"

RPM_NAME = "texlive-eskdx-doc-2023.201.0.0.98svn29235-52.1.noarch.rpm"
RPM_HASH = "5edd476ed3db763872f9dcf2055aabcb00d458907a621e59bcd7214a181c634cc97119154777f57420ff01d447e86f7a906ad2506efaf953e54ad84629d56729"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-eskdx-doc-ru \
texlive-eskdx-doc"

RDEPENDS:${PN} += ""

inherit rpm
