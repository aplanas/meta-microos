SUMMARY = "Documentation for texlive-euler-math"
DESCRIPTION = "This package includes the documentation for texlive-euler-math"
LICENSE = "OFL-1.1"

PV = "2023.201.0.0.31svn65685"

RPM_NAME = "texlive-euler-math-doc-2023.201.0.0.31svn65685-52.1.noarch.rpm"
RPM_HASH = "2f0f8e949f9eac21055bfd72956d13ffba7935d9e669e331e90c8e22a869bda1a02d4f6a0b363841bc3fc64893a492f6472f5c308fdd3f3a3ce84bf0ba89afd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-euler-math-doc"

RDEPENDS:${PN} += ""

inherit rpm
