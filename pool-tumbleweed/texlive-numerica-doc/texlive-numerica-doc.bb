SUMMARY = "Documentation for texlive-numerica"
DESCRIPTION = "This package includes the documentation for texlive-numerica"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0.0svn61283"

RPM_NAME = "texlive-numerica-doc-2023.201.2.0.0svn61283-54.1.noarch.rpm"
RPM_HASH = "466e3fda251306fe968f6910cbeace20122c0468eaead91a8d04bc76dc5546e7ecc13059cddd477a65e55a6d568ad4a2c6247d4f079ca4723f09af6f75aa0e80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-numerica-doc"

RDEPENDS:${PN} += ""

inherit rpm
