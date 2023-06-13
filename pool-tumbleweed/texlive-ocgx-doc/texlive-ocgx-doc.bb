SUMMARY = "Documentation for texlive-ocgx"
DESCRIPTION = "This package includes the documentation for texlive-ocgx"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn54512"

RPM_NAME = "texlive-ocgx-doc-2023.201.0.0.5svn54512-54.1.noarch.rpm"
RPM_HASH = "002ac9fc1f929c55a878d8001a1ddb49291f8e198371d811f88ba7b67dd7ad310633282665be321b4e213eabbbcec899c477bb3cda83199c33690b2e710baf52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ocgx-doc"

RDEPENDS:${PN} += ""

inherit rpm
