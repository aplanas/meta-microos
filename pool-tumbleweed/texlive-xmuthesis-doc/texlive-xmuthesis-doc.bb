SUMMARY = "Documentation for texlive-xmuthesis"
DESCRIPTION = "This package includes the documentation for texlive-xmuthesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4.1svn56614"

RPM_NAME = "texlive-xmuthesis-doc-2023.209.0.0.4.1svn56614-53.2.noarch.rpm"
RPM_HASH = "512283679fbf17858cf4053c8a586794fed69ae1cae01ff83518e714e856b62693260b0f1061e3551d16a72f7a41378e9502758801485b8a50e35c3d3fbc437c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xmuthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
