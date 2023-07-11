SUMMARY = "An interpreter package for AIML, the Artificial Intelligence Markup Language"
DESCRIPTION = "python-aiml implements an interpreter for AIML, the Artificial Intelligence \
Markup Language developed by Dr. Richard Wallace of the A.L.I.C.E. Foundation. \
It can be used to implement a conversational AI program. \
 \
This package was forked from PyAIML 0.8.6 which seems to have been abandoned \
for a long time."
LICENSE = "BSD-2-Clause"

PV = "0.9.3"

RPM_NAME = "python311-python-aiml-0.9.3-3.10.noarch.rpm"
RPM_HASH = "8d881dbe8547d3a371e327c4cb48fae44ee2d8bd0bda8292fdd99f54ca76bd019fc9aa74e8447549837df714a04e5b6749195ee502c3039297e56cf8c1d46302"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aiml \
python3-python-aiml \
python3.11dist-python-aiml \
python311-aiml \
python311-python-aiml \
python3dist-python-aiml"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-setuptools \
update-alternatives"

inherit rpm
