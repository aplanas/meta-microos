SUMMARY = "Library Developer Files for sndio"
DESCRIPTION = "This package contains files needed for development with the sndio \
library."
LICENSE = "ISC"

PV = "1.7.0"

RPM_NAME = "sndio-devel-1.7.0-1.10.aarch64.rpm"
RPM_HASH = "d551e04f2002b74ced23654246279095ea0f336f6869c8c999f7a216680132ac93e96b49f9e740242fe8d4d258f6558602dd19dd5dac0a4ec3ab91b5ae74f5be"

RPROVIDES:${PN} += "sndio-devel \
sndio-devel(aarch-64)"

RDEPENDS:${PN} += "libsndio7_1"

inherit rpm
