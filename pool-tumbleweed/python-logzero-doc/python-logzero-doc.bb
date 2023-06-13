SUMMARY = "Documentation files for python-logzero"
DESCRIPTION = "Documentation files for python-logzero."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python-logzero-doc-1.7.0-3.8.noarch.rpm"
RPM_HASH = "144f569712bb4bd9fb005ac79f6fdb4608e187188f1dc057199cdc967f662fcc734ef3ba60adf82cc8b4dde2f6fb7ea943a254391f55bca56128b711b151e64d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-logzero-doc"

RDEPENDS:${PN} += ""

inherit rpm
