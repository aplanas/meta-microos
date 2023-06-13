SUMMARY = "Docs for oslo.metrics"
DESCRIPTION = "Documentation for the oslo.metrics library."
LICENSE = "Apache-2.0"

PV = "0.6.0"

RPM_NAME = "python-oslo.metrics-doc-0.6.0-1.2.noarch.rpm"
RPM_HASH = "e894dcde9acb645ecdaf2010e7ec0fa38131588bd28ae9362533dfd70ab5d5807512840eaf32c06cee57ed8d5ee7323e944558fb84e5cdc80c9a475d1d2c7185"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-oslo.metrics-doc"

RDEPENDS:${PN} += ""

inherit rpm
