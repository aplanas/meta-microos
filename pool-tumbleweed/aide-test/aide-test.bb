SUMMARY = "Simple AIDE testing"
DESCRIPTION = "Simple AIDE test script for externalized testing."
LICENSE = "GPL-2.0-or-later"

PV = "0.18.5"

RPM_NAME = "aide-test-0.18.5-1.1.noarch.rpm"
RPM_HASH = "bbbc49df905c2f28d3911872e12c4a8ce2719ee1bea17c51cd6459182ba04778dc2614faae7ed02400d43f276df834c07184497c6dc06527ba1bed98321a5225"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aide-test"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
