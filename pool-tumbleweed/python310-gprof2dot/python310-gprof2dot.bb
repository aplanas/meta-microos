SUMMARY = "Script to generate a dot graph from the output of several profilers"
DESCRIPTION = "GProf2Dot.py is a Python script to convert the output from many \
profilers into a dot graph."
LICENSE = "LGPL-3.0-or-later"

PV = "2022.7.29"

RPM_NAME = "python310-gprof2dot-2022.7.29-1.5.noarch.rpm"
RPM_HASH = "f3e77644557105e0fa9ac7a7a8e0dfeb0f00f07c63c684c0f3fb3e1e0f59de2ad2d7161b06d3fdb88977fb8145704bb4790b49646b6a480e40bc98621b2f17f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-gprof2dot \
python310-gprof2dot \
python3dist-gprof2dot"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
