SUMMARY = "Documentation for texlive-qsharp"
DESCRIPTION = "This package includes the documentation for texlive-qsharp"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3.1901.1401svn49722"

RPM_NAME = "texlive-qsharp-doc-2023.209.0.0.3.1901.1401svn49722-54.2.noarch.rpm"
RPM_HASH = "a158409a2874fd7e39df1edc224abd55e8381122dc0a398c190a084d307bc3a7019007e5ca050e43c2370e88933131fab1d2c51d76b50c118cfdcf064dc518aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-qsharp-doc"

RDEPENDS:${PN} += ""

inherit rpm
