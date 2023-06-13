SUMMARY = "GRC blocks for gr-iqbal"
DESCRIPTION = "GNU Radio Companion (GRC) definitions for the \
gr-iqbal I/Q balancing block."
LICENSE = "GPL-2.0-only"

PV = "0.39.0git20210108"

RPM_NAME = "gr-iqbal-grc-0.39.0git20210108-1.12.noarch.rpm"
RPM_HASH = "9988fa4e03d77399a5a7adc13ccce05959b1c5e58b43bb57f4f8e6aaacdea3b1f905917e99f25ff6d7bc3bd3e5fbdea575f937d0cc2e98cd7b53fa4e22074259"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gr-iqbal-grc"

RDEPENDS:${PN} += "libgnuradio-iqbalance3_9_0"

inherit rpm
