SUMMARY = "PsyLab: Psychophysics Lab"
DESCRIPTION = "Psylab is a loose collection of modules useful for various aspects of \
running psychophysics experiments, although some might be more \
generally useful."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.7.12"

RPM_NAME = "python39-PsyLab-0.4.7.12-3.13.noarch.rpm"
RPM_HASH = "5f9d9bd88faeff9c698fdd35c2d4870925379ba547b54b60e736c0a73eb9eddfdb1511ae3f21d0d1d14643ef0dc589f719f8c79adbfee5ccc101baaea77befc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(psylab) \
python39-PsyLab \
python3dist(psylab)"

RDEPENDS:${PN} += "python(abi) \
python39-matplotlib \
python39-numpy \
python39-scipy"

inherit rpm
