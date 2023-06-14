SUMMARY = "Documentation for texlive-latex2man"
DESCRIPTION = "This package includes the documentation for texlive-latex2man"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.29svn64477"

RPM_NAME = "texlive-latex2man-doc-2023.201.1.29svn64477-54.1.noarch.rpm"
RPM_HASH = "e20ae265c8e77cf40817ebc7aab4438d5c63e97c9d5a5754994723d89343687a6198eb768f4882e4d1e2c62816d977905c4a96957e755988badaccc2b6b68ac8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-latex2man.1 \
texlive-latex2man-doc"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
