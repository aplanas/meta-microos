SUMMARY = "An interpreter package for AIML, the Artificial Intelligence Markup Language"
DESCRIPTION = "python-aiml implements an interpreter for AIML, the Artificial Intelligence \
Markup Language developed by Dr. Richard Wallace of the A.L.I.C.E. Foundation. \
It can be used to implement a conversational AI program. \
 \
This package was forked from PyAIML 0.8.6 which seems to have been abandoned \
for a long time."
LICENSE = "BSD-2-Clause"

PV = "0.9.3"

RPM_NAME = "python311-python-aiml-0.9.3-3.9.noarch.rpm"
RPM_HASH = "77d696e79b1b608675222c321d5cd3137ba4b1277957584f616cbe16e00aaae4e3c3b56a1b425001282721489ccac4373b7c5d5601072b5f5c47e828706fa069"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-python-aiml \
python311-aiml \
python311-python-aiml \
python3dist-python-aiml"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-setuptools \
update-alternatives"

inherit rpm
