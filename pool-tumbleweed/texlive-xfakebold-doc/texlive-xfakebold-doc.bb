SUMMARY = "Documentation for texlive-xfakebold"
DESCRIPTION = "This package includes the documentation for texlive-xfakebold"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.08svn55654"

RPM_NAME = "texlive-xfakebold-doc-2023.201.0.0.08svn55654-52.2.noarch.rpm"
RPM_HASH = "b4afd763b47525768e2aa37a7f32b00aa09c31cdf301eae51f1ecab573593d0795a1801da84b14016a3fafeb42dcb66eb6688edb1b4f004f13a7bb8b661c2060"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xfakebold-doc"

RDEPENDS:${PN} += ""

inherit rpm
