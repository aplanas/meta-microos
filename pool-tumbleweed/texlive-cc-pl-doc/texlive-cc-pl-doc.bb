SUMMARY = "Documentation for texlive-cc-pl"
DESCRIPTION = "This package includes the documentation for texlive-cc-pl"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.02.3svn58602"

RPM_NAME = "texlive-cc-pl-doc-2023.209.1.02.3svn58602-53.1.noarch.rpm"
RPM_HASH = "7ca7eb7998782cdf60c0b89f5d45820ff6e49bdf0d90b5e6d1c801ad4859ed6d9aaa05d9946b2f5cd7f4b325feb3583f42fc23ecd3d4e4223b23c74a711e33d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cc-pl-doc"

RDEPENDS:${PN} += ""

inherit rpm
