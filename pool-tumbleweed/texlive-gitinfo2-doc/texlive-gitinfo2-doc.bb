SUMMARY = "Documentation for texlive-gitinfo2"
DESCRIPTION = "This package includes the documentation for texlive-gitinfo2"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0.7svn38913"

RPM_NAME = "texlive-gitinfo2-doc-2023.209.2.0.7svn38913-54.2.noarch.rpm"
RPM_HASH = "ae16cff554a863408e498de5a7375189d3045c64b1f6e6ae1f0fde59ce78fc3131948844b345616fddaebd42e86ab5ae23c1a4613dd9cf4b0258c11950525f4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gitinfo2-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
