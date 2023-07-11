SUMMARY = "PsyLab: Psychophysics Lab"
DESCRIPTION = "Psylab is a loose collection of modules useful for various aspects of \
running psychophysics experiments, although some might be more \
generally useful."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.7.12"

RPM_NAME = "python39-PsyLab-0.4.7.12-3.15.noarch.rpm"
RPM_HASH = "caa1083bc241f4365cfbf68f8cef4eb45476537a650b7b596fa8f4b423fb2db0153380e65ea68dec7ddb98bbdc43fa38ec09d658a1a238e71c17ce743384fe21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-psylab \
python39-PsyLab \
python3dist-psylab"

RDEPENDS:${PN} += "python-abi \
python39-matplotlib \
python39-numpy \
python39-scipy"

inherit rpm
