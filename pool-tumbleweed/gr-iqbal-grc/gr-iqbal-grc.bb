SUMMARY = "GRC blocks for gr-iqbal"
DESCRIPTION = "GNU Radio Companion (GRC) definitions for the \
gr-iqbal I/Q balancing block."
LICENSE = "GPL-2.0-only"

PV = "0.39.0git20210108"

RPM_NAME = "gr-iqbal-grc-0.39.0git20210108-1.14.noarch.rpm"
RPM_HASH = "79c8192e844d615c92b2bc9e0e2a3e319b2c38073459b568c177188eca1d4427db5519eac8711e0994fe9f0cf551ba56924fb715a3551285df445cc79f61ba12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gr-iqbal-grc"

RDEPENDS:${PN} += "libgnuradio-iqbalance3-9-0"

inherit rpm
