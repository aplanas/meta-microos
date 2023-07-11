SUMMARY = "The old default theme for enlightenment"
DESCRIPTION = "The old default theme for enlightenment, for most of the 2010 Era."
LICENSE = "BSD-2-Clause & LGPL-2.1-only & CC-BY-SA-3.0"

PV = "20220216.1.26"

RPM_NAME = "enlightenment-theme-dark-20220216.1.26-1.12.noarch.rpm"
RPM_HASH = "00468db7bc278fd55e8ecdbef8af3f3b65b08fc6e51ddfc07108c3d072c93fa2c786c098ad27411ec274ff950859a2b49b2c95ebf5b3105fa7238ec911052a76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "enlightenment-theme \
enlightenment-theme-dark"

RDEPENDS:${PN} += ""

inherit rpm
