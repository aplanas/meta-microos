SUMMARY = "Documentation for texlive-curves"
DESCRIPTION = "This package includes the documentation for texlive-curves"
LICENSE = "LPPL-1.0"

PV = "2023.204.1.55svn45255"

RPM_NAME = "texlive-curves-doc-2023.204.1.55svn45255-54.1.noarch.rpm"
RPM_HASH = "0c518763a519f8152c26875be5456e93b464b533c141be0a0abbff9db012057407a286eaa387cdafd7027c848f47f1ae6c1c1e4aef3f794047d61c26a9fec7fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-curves-doc"

RDEPENDS:${PN} += ""

inherit rpm
