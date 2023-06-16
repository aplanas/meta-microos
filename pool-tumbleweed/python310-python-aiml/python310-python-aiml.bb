SUMMARY = "An interpreter package for AIML, the Artificial Intelligence Markup Language"
DESCRIPTION = "python-aiml implements an interpreter for AIML, the Artificial Intelligence \
Markup Language developed by Dr. Richard Wallace of the A.L.I.C.E. Foundation. \
It can be used to implement a conversational AI program. \
 \
This package was forked from PyAIML 0.8.6 which seems to have been abandoned \
for a long time."
LICENSE = "BSD-2-Clause"

PV = "0.9.3"

RPM_NAME = "python310-python-aiml-0.9.3-3.9.noarch.rpm"
RPM_HASH = "8de8695040d227bcd846298582d6c6d444acec5e0bf9cf8fd9dc6b0bf696fdd004fc798216b8ce8e68c0ba72a8888df42f3f4e5376a9240f4318670219f6b429"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aiml \
python3-python-aiml \
python3.10dist-python-aiml \
python310-aiml \
python310-python-aiml \
python3dist-python-aiml"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-setuptools \
update-alternatives"

inherit rpm
