SUMMARY = "Documentation for GLI library"
DESCRIPTION = "This package provides the documentation for GLI library."
LICENSE = "GPL-2.0-only & MIT"

PV = "0.8.2.0"

RPM_NAME = "gli-doc-0.8.2.0-4.3.noarch.rpm"
RPM_HASH = "67452af8e10b80cd52a355315d1e87836c33a0704fd6994a89083c23be7c43463d949866b020c255b0552d8b9b680dcc40d63f9ab38024449faf9f177c94002e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gli-doc"

RDEPENDS:${PN} += ""

inherit rpm
