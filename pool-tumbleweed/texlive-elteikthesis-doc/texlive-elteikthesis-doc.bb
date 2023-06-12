SUMMARY = "Documentation for texlive-elteikthesis"
DESCRIPTION = "This package includes the documentation for texlive-elteikthesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3svn63186"

RPM_NAME = "texlive-elteikthesis-doc-2023.201.2.3svn63186-53.1.noarch.rpm"
RPM_HASH = "2e5111441c8d68edc14b2c66ac9beb7b6338090c60a6528d745b1452d3eafc4db44306b55c8d3682b6b7928543111abc0a83f48bf4daec0e25cb0f553264fdac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-elteikthesis-doc:en;hu) \
texlive-elteikthesis-doc"
RDEPENDS:${PN} += ""

inherit rpm
