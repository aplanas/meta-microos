SUMMARY = "Documentation for texlive-pstring"
DESCRIPTION = "This package includes the documentation for texlive-pstring"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn42857"

RPM_NAME = "texlive-pstring-doc-2023.209.svn42857-54.1.noarch.rpm"
RPM_HASH = "0c16939c7ed317669435751396899729165290fd13a484e819ab8dade77b2cdf778997400718cf0953adadc1a03aff27dfe287cebd80380049c9eeccf89b718f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pstring-doc"

RDEPENDS:${PN} += ""

inherit rpm
