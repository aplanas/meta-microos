SUMMARY = "Documentation for texlive-concrete"
DESCRIPTION = "This package includes the documentation for texlive-concrete"
LICENSE = "SUSE-TeX"

PV = "2023.209.svn57963"

RPM_NAME = "texlive-concrete-doc-2023.209.svn57963-54.1.noarch.rpm"
RPM_HASH = "1829e142fb2826814fc57688812ea84bc7a396eab145478039318109fb1ae7458c8b59abce94db02e358f1db1c0d6d7d0a03fdf6e848304feaa4f07a3e65d9f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-concrete-doc"

RDEPENDS:${PN} += ""

inherit rpm
