SUMMARY = "PsyLab: Psychophysics Lab"
DESCRIPTION = "Psylab is a loose collection of modules useful for various aspects of \
running psychophysics experiments, although some might be more \
generally useful."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.7.12"

RPM_NAME = "python310-PsyLab-0.4.7.12-3.15.noarch.rpm"
RPM_HASH = "3f5dc339adf29d17ecb11ea745853703386dcb09dd0d0200201c3bc9ce8e46b77a092046b882cca9f43be57c90d48e291e5f7913fc1dc99baf64902e535ef261"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-psylab \
python310-PsyLab \
python3dist-psylab"

RDEPENDS:${PN} += "python-abi \
python310-matplotlib \
python310-numpy \
python310-scipy"

inherit rpm
