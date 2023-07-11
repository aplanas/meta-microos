SUMMARY = "PsyLab: Psychophysics Lab"
DESCRIPTION = "Psylab is a loose collection of modules useful for various aspects of \
running psychophysics experiments, although some might be more \
generally useful."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.7.12"

RPM_NAME = "python311-PsyLab-0.4.7.12-3.15.noarch.rpm"
RPM_HASH = "7712599499ae482664ff35fb485a27588d9d3f67d5c9f83cab5638ec5f3ad258387754665506a0026d8961efb3d554a7c978590763b680128a2c2f8d45201e41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PsyLab \
python3.11dist-psylab \
python311-PsyLab \
python3dist-psylab"

RDEPENDS:${PN} += "python-abi \
python311-matplotlib \
python311-numpy \
python311-scipy"

inherit rpm
