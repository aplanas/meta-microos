SUMMARY = "Documentation for texlive-hepnames"
DESCRIPTION = "This package includes the documentation for texlive-hepnames"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn35722"

RPM_NAME = "texlive-hepnames-doc-2023.209.2.0svn35722-54.1.noarch.rpm"
RPM_HASH = "6d42ca5845e7c0b27667d60000f3c4922016ccc8d283afacc469b53dc0237aec726fe63e736c0daaef9603d2aa0cebd108f4049407a3159fe1bd35e9477e9620"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hepnames-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
