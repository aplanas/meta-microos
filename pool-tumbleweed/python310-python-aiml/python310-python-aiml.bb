SUMMARY = "An interpreter package for AIML, the Artificial Intelligence Markup Language"
DESCRIPTION = "python-aiml implements an interpreter for AIML, the Artificial Intelligence \
Markup Language developed by Dr. Richard Wallace of the A.L.I.C.E. Foundation. \
It can be used to implement a conversational AI program. \
 \
This package was forked from PyAIML 0.8.6 which seems to have been abandoned \
for a long time."
LICENSE = "BSD-2-Clause"

PV = "0.9.3"

RPM_NAME = "python310-python-aiml-0.9.3-3.10.noarch.rpm"
RPM_HASH = "701cf56db3363dae69643db146a7a307fcdb34d800e1eecbd2abd72876b9f52454f0909c68cb225085db2224a167991206ab71125b6da0865f94ba7e6a0ecc2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-aiml \
python310-aiml \
python310-python-aiml \
python3dist-python-aiml"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-setuptools \
update-alternatives"

inherit rpm
