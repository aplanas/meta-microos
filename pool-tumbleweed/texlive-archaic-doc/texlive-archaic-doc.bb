SUMMARY = "Documentation for texlive-archaic"
DESCRIPTION = "This package includes the documentation for texlive-archaic"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn38005"

RPM_NAME = "texlive-archaic-doc-2023.209.svn38005-55.1.noarch.rpm"
RPM_HASH = "67b77aec0bf8b38b2011e05edcde5261b002a04fd68746f2c8361386cd78624b331b6795266362a9aacdea7b8a9fc2cfabba7535df0f36a1c615409c393efe35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-archaic-doc"

RDEPENDS:${PN} += ""

inherit rpm
