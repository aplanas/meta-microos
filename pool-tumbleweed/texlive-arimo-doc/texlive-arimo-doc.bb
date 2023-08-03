SUMMARY = "Documentation for texlive-arimo"
DESCRIPTION = "This package includes the documentation for texlive-arimo"
LICENSE = "Apache-1.0"

PV = "2023.209.svn64548"

RPM_NAME = "texlive-arimo-doc-2023.209.svn64548-55.1.noarch.rpm"
RPM_HASH = "b56e578255ada3889d502a9dcfe67ec8973149148070db8367f72ed4d3ae74dc0bcc8a8040458b5ae26677bbec3abe03110d3b4f160939a9acaec79d20b04c36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-arimo-doc"

RDEPENDS:${PN} += ""

inherit rpm
