SUMMARY = "Script to generate a dot graph from the output of several profilers"
DESCRIPTION = "GProf2Dot.py is a Python script to convert the output from many \
profilers into a dot graph."
LICENSE = "LGPL-3.0-or-later"

PV = "2022.7.29"

RPM_NAME = "python39-gprof2dot-2022.7.29-1.4.noarch.rpm"
RPM_HASH = "f5d119e3b1e3788e7e1041c66c76ee21960e99c658efa93ef1450e7fcaa8e2c7ca14ca34b5d4cf06be316ceacda87cad66519827f697a0c7128db4e98e358b7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(gprof2dot) \
python39-gprof2dot \
python3dist(gprof2dot)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
update-alternatives"

inherit rpm
