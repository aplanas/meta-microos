SUMMARY = "Documentation for texlive-pdfreview"
DESCRIPTION = "This package includes the documentation for texlive-pdfreview"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn50100"

RPM_NAME = "texlive-pdfreview-doc-2023.201.1.2svn50100-51.1.noarch.rpm"
RPM_HASH = "bcd2363f46fd2d2a1ce25152c0e5a14d3c59e4a1a7be1c7936ff2ba1111a6c8f81ef13daab9e8baf88a6abdb37e9adb1b0a83a4f3e980e8c5ac54489e6a1ac03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfreview-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
