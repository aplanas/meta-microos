SUMMARY = "Documentation for texlive-els-cas-templates"
DESCRIPTION = "This package includes the documentation for texlive-els-cas-templates"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3svn62931"

RPM_NAME = "texlive-els-cas-templates-doc-2023.209.2.3svn62931-54.2.noarch.rpm"
RPM_HASH = "2ce776f8e66e6893650f2938d3fd08c81981172d9b3fce2d88330307aedac436ba5ac13392c1e68138add11d227a37c1820d08a3f98d51e1205ff1d50bef4351"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-els-cas-templates-doc"

RDEPENDS:${PN} += ""

inherit rpm
