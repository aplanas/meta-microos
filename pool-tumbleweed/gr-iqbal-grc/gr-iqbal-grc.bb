SUMMARY = "GRC blocks for gr-iqbal"
DESCRIPTION = "GNU Radio Companion (GRC) definitions for the \
gr-iqbal I/Q balancing block."
LICENSE = "GPL-2.0-only"

PV = "0.39.0git20210108"

RPM_NAME = "gr-iqbal-grc-0.39.0git20210108-1.13.noarch.rpm"
RPM_HASH = "c584ef299a130554e0ad6f25e8738ce5b8d1015b4abff96d9a2873552c3b42be7281ac4b8b1aeacd8437fd8ea429a09cedb22edda922763d29ef51d23755350c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gr-iqbal-grc"

RDEPENDS:${PN} += "libgnuradio-iqbalance3-9-0"

inherit rpm
