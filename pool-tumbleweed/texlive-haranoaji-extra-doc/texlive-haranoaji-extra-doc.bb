SUMMARY = "Documentation for texlive-haranoaji-extra"
DESCRIPTION = "This package includes the documentation for texlive-haranoaji-extra"
LICENSE = "OFL-1.1"

PV = "2023.209.20230223svn66115"

RPM_NAME = "texlive-haranoaji-extra-doc-2023.209.20230223svn66115-54.1.noarch.rpm"
RPM_HASH = "51597065d9b6a62c151f06797bf49518c81c6bd4986d834adad6ffd1e4bfc100df6f2aec1d27552b83287d145b93247f6b36cecc9b42aeed490502d2a8162c8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-haranoaji-extra-doc"

RDEPENDS:${PN} += ""

inherit rpm
