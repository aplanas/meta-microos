SUMMARY = "Documentation for texlive-greektex"
DESCRIPTION = "This package includes the documentation for texlive-greektex"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn28327"

RPM_NAME = "texlive-greektex-doc-2023.201.svn28327-53.1.noarch.rpm"
RPM_HASH = "ee6b6f80fd2c52e8c114764d63194ca28fb5b2aa9ed20730ba470a971a5a01956038530615c6ed62234c9c5729345e8258898e9d9d74758dd0c7bab7658d13de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-greektex-doc:el) \
texlive-greektex-doc"

RDEPENDS:${PN} += ""

inherit rpm
