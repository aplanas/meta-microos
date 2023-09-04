SUMMARY = "Simple AIDE testing"
DESCRIPTION = "Simple AIDE test script for externalized testing."
LICENSE = "GPL-2.0-or-later"

PV = "0.18.6"

RPM_NAME = "aide-test-0.18.6-1.1.noarch.rpm"
RPM_HASH = "ee3ba828778698fefb52fd9bfeaa25789c5f8ae2efe87ce55ced3621481d808952ca751a3c305dd1ecce4d1f927d60032a4328679161129cf7834db033b897f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aide-test"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
