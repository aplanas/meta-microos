SUMMARY = "Documentation for texlive-tap"
DESCRIPTION = "This package includes the documentation for texlive-tap"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.0.0.77svn31731"

RPM_NAME = "texlive-tap-doc-2023.209.0.0.77svn31731-55.1.noarch.rpm"
RPM_HASH = "f90b7c571ccaa44b62dacfab92ad34e7b4314a3876031703b38e4804b8520cac5e391814973b4db97de999b9b64571ec62345c148f984c9bacf868f9ef82dd73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tap-doc"

RDEPENDS:${PN} += ""

inherit rpm
