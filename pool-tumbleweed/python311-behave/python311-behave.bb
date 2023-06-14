SUMMARY = "Behaviour-driven development, Python style"
DESCRIPTION = "Behavior-driven development (or BDD) is an agile software development \
technique that encourages collaboration between developers, QA and \
non-technical or business participants in a software project. \
 \
*behave* uses tests written in a natural language style, backed up by Python \
code."
LICENSE = "BSD-2-Clause"

PV = "1.2.6"

RPM_NAME = "python311-behave-1.2.6-5.6.noarch.rpm"
RPM_HASH = "76eaa3f5394084955bab82581378cb7a53cb76f464d60bc3b8535ff03569068a1d0527771025abc8912a86e96fd163155d4129cfa75ad42f809192c67dd59b80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-behave \
python311-behave \
python3dist-behave"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-parse \
python311-parse-type \
python311-six \
update-alternatives"

inherit rpm
