SUMMARY = "Documentation for texlive-turnstile"
DESCRIPTION = "This package includes the documentation for texlive-turnstile"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn64967"

RPM_NAME = "texlive-turnstile-doc-2023.201.1.0svn64967-52.1.noarch.rpm"
RPM_HASH = "4c1e30e169b5c421a32b02d9f7dca15b016e240c665164ab1638872f6a3963767cbc4ab056f912a027c2b2034bb2f5108c10d8aa7ac762400665bbc3c213402d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-turnstile-doc-pt \
texlive-turnstile-doc"

RDEPENDS:${PN} += ""

inherit rpm
