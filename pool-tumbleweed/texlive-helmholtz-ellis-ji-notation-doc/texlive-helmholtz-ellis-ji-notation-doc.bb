SUMMARY = "Documentation for texlive-helmholtz-ellis-ji-notation"
DESCRIPTION = "This package includes the documentation for texlive-helmholtz-ellis-ji-notation"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn55213"

RPM_NAME = "texlive-helmholtz-ellis-ji-notation-doc-2023.209.1.1svn55213-54.1.noarch.rpm"
RPM_HASH = "7b4c2559633f153e997338cfc8030f89ca7cf0a11d4771d821aa8eddf42e0d0e070638195a2cd798a57cf41e4ebd4abb0cfa6c484f6acc1fb3bee56e078739f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-helmholtz-ellis-ji-notation-doc"

RDEPENDS:${PN} += ""

inherit rpm
