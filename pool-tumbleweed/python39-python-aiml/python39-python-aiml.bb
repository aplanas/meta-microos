SUMMARY = "An interpreter package for AIML, the Artificial Intelligence Markup Language"
DESCRIPTION = "python-aiml implements an interpreter for AIML, the Artificial Intelligence \
Markup Language developed by Dr. Richard Wallace of the A.L.I.C.E. Foundation. \
It can be used to implement a conversational AI program. \
 \
This package was forked from PyAIML 0.8.6 which seems to have been abandoned \
for a long time."
LICENSE = "BSD-2-Clause"

PV = "0.9.3"

RPM_NAME = "python39-python-aiml-0.9.3-3.10.noarch.rpm"
RPM_HASH = "f9d57b8c1f263a79e451ea72c79ffb99b084c826e42739efd671759b8587ae6bebd7534690ad87f3eb50053a0d3fbda8ca84f55a24a3c6d7454c5cc356a52c9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-aiml \
python39-aiml \
python39-python-aiml \
python3dist-python-aiml"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-setuptools \
update-alternatives"

inherit rpm
