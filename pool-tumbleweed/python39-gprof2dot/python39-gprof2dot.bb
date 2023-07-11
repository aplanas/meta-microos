SUMMARY = "Script to generate a dot graph from the output of several profilers"
DESCRIPTION = "GProf2Dot.py is a Python script to convert the output from many \
profilers into a dot graph."
LICENSE = "LGPL-3.0-or-later"

PV = "2022.7.29"

RPM_NAME = "python39-gprof2dot-2022.7.29-1.5.noarch.rpm"
RPM_HASH = "8af17de1c1c9b4ec15168faaa91593758fa07da850a5fdebde9a8b4a367684b2b5069e0bd745283291a6e0f20eb4c61d1211dac8373c3405ebcbb3eccfb0e12b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-gprof2dot \
python39-gprof2dot \
python3dist-gprof2dot"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
