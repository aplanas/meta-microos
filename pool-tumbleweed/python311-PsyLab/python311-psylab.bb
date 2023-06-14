SUMMARY = "PsyLab: Psychophysics Lab"
DESCRIPTION = "Psylab is a loose collection of modules useful for various aspects of \
running psychophysics experiments, although some might be more \
generally useful."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.7.12"

RPM_NAME = "python311-PsyLab-0.4.7.12-3.13.noarch.rpm"
RPM_HASH = "c254c8d9dfef9fd6aa1c01fbefa97fd9e2e5cfb4614797b5a856a4d25e05479b17a7e66311a3ae2c9769b540c4ce937647460b367d2fd921344a7d355088630b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-psylab \
python311-PsyLab \
python3dist-psylab"

RDEPENDS:${PN} += "python-abi \
python311-matplotlib \
python311-numpy \
python311-scipy"

inherit rpm
