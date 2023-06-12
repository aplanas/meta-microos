SUMMARY = "PsyLab: Psychophysics Lab"
DESCRIPTION = "Psylab is a loose collection of modules useful for various aspects of \
running psychophysics experiments, although some might be more \
generally useful."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.7.12"

RPM_NAME = "python310-PsyLab-0.4.7.12-3.13.noarch.rpm"
RPM_HASH = "197b1aa7994bcfcca7ec82ebe114cfc7d1a83fce987a33083b7abe3d75a850c6a8f3b861babd87d1144b286073528b8827f87698777dac4691b2b25611db14fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PsyLab \
python3.10dist(psylab) \
python310-PsyLab \
python3dist(psylab)"
RDEPENDS:${PN} += "python(abi) \
python310-matplotlib \
python310-numpy \
python310-scipy"

inherit rpm
