SUMMARY = "Additional Backends for CUPS"
DESCRIPTION = "This package contains free additional backends for CUPS."
LICENSE = "GPL-2.0"

PV = "1.1"

RPM_NAME = "cups-backends-1.1-5.14.noarch.rpm"
RPM_HASH = "83f4025a82907a68e255bacef7c5935c88d0dcc42efa7879c448f1d502bff216ba0765e64fbaaefa47fe4f4f0f55579d60dbf8b7c97419d6482af272052abc38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cups-backends"
RDEPENDS:${PN} += "/bin/bash \
/usr/bin/perl \
cups"

inherit rpm
