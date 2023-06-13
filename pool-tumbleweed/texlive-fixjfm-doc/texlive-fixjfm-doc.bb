SUMMARY = "Documentation for texlive-fixjfm"
DESCRIPTION = "This package includes the documentation for texlive-fixjfm"
LICENSE = "SUSE-TeX"

PV = "2023.201.0.0.8svn63967"

RPM_NAME = "texlive-fixjfm-doc-2023.201.0.0.8svn63967-52.1.noarch.rpm"
RPM_HASH = "a50e74d9495f55deb765d23e1bd8831940ea380b17285e85db254b07dfffd0403d99115dd94bf28d6df34a74d7e26ff94e41766a30a8c30b5f841db03b01d046"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fixjfm-doc"

RDEPENDS:${PN} += ""

inherit rpm
