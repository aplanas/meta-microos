SUMMARY = "Documentation for texlive-examplep"
DESCRIPTION = "This package includes the documentation for texlive-examplep"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.04svn55265"

RPM_NAME = "texlive-examplep-doc-2023.209.0.0.04svn55265-53.1.noarch.rpm"
RPM_HASH = "5410f4a31ae087d920d956e65c552944ea4f647af133ff66a1e83699ce71f03558e0e150012e8fc1b4ec028a31da2fa56e85615fee1401b76a7d4299c3fd7679"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-examplep-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
