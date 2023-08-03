SUMMARY = "Documentation for texlive-dosepsbin"
DESCRIPTION = "This package includes the documentation for texlive-dosepsbin"
LICENSE = "Artistic-1.0"

PV = "2023.209.1.2svn29752"

RPM_NAME = "texlive-dosepsbin-doc-2023.209.1.2svn29752-53.1.noarch.rpm"
RPM_HASH = "a8d6d0cbf8b0e749bd6db5db855298a3de6973eee7d606be2209666d5a337b1b811230497669a3436a11f99ba6a97c6f79beaf77b61167b03dbfdf5536335f7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-dosepsbin.1 \
texlive-dosepsbin-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
