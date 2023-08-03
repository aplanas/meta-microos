SUMMARY = "Documentation for texlive-afthesis"
DESCRIPTION = "This package includes the documentation for texlive-afthesis"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.2.7svn15878"

RPM_NAME = "texlive-afthesis-doc-2023.209.2.7svn15878-55.1.noarch.rpm"
RPM_HASH = "1ab5bc33a142d3e13e6afc35ca6ce24439ae6038432a117a43f16ac07af8623252299bc9873e28a68522bb5e59d5f925fe9a4c715631da62b4f117ac6ff69d13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-afthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
