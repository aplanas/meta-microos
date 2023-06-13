SUMMARY = "Documentation for texlive-karnaugh"
DESCRIPTION = "This package includes the documentation for texlive-karnaugh"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn21338"

RPM_NAME = "texlive-karnaugh-doc-2023.201.svn21338-55.1.noarch.rpm"
RPM_HASH = "4ed5bef6148e7f6d8b81a55a3e2e1c5898b382968f543b32737e19f379f17e1c4360db95626462161c24b574c54352b054df4747985c8a11d07ac8a51eb82f2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-karnaugh-doc"

RDEPENDS:${PN} += ""

inherit rpm
