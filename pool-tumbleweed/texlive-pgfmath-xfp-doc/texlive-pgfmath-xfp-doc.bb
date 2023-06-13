SUMMARY = "Documentation for texlive-pgfmath-xfp"
DESCRIPTION = "This package includes the documentation for texlive-pgfmath-xfp"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn59268"

RPM_NAME = "texlive-pgfmath-xfp-doc-2023.201.1.0svn59268-51.1.noarch.rpm"
RPM_HASH = "a0374aad5e163fd23ad8b123f499b2e2b54f098290f44de15fc884f38246d9c8509546af3de6db5ca5f5ba509614e3ef2a07d1dd9b000d8a58cc0920d0ce0177"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pgfmath-xfp-doc"

RDEPENDS:${PN} += ""

inherit rpm
