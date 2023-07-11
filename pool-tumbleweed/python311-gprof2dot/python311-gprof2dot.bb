SUMMARY = "Script to generate a dot graph from the output of several profilers"
DESCRIPTION = "GProf2Dot.py is a Python script to convert the output from many \
profilers into a dot graph."
LICENSE = "LGPL-3.0-or-later"

PV = "2022.7.29"

RPM_NAME = "python311-gprof2dot-2022.7.29-1.5.noarch.rpm"
RPM_HASH = "bff906331f9ec762c4cccc0e2be001218a3a90797f4ac19b9068a3bb60c94dd25c06260d2ff8f62f0951e321578fe20b5cb056b5529b7688ae8d703497b20e19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gprof2dot \
python3.11dist-gprof2dot \
python311-gprof2dot \
python3dist-gprof2dot"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
