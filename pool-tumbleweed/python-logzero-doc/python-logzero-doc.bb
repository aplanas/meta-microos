SUMMARY = "Documentation files for python-logzero"
DESCRIPTION = "Documentation files for python-logzero."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python-logzero-doc-1.7.0-3.10.noarch.rpm"
RPM_HASH = "e34a20150200d4bd67fb5ac3a6756a381170560bf8d8cf6ad1e62dbe2edf6788d8da43b7cde4d9a1308b95579f5e3d97d7df116a970ea8838eb0aafc7588e381"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-logzero-doc"

RDEPENDS:${PN} += ""

inherit rpm
