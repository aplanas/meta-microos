SUMMARY = "Behaviour-driven development, Python style"
DESCRIPTION = "Behavior-driven development (or BDD) is an agile software development \
technique that encourages collaboration between developers, QA and \
non-technical or business participants in a software project. \
 \
*behave* uses tests written in a natural language style, backed up by Python \
code."
LICENSE = "BSD-2-Clause"

PV = "1.2.6"

RPM_NAME = "python311-behave-1.2.6-5.8.noarch.rpm"
RPM_HASH = "554c11c6524f6560e1adb98032f5e61421270ecfe4f42febb599333da7bfc0284692b3f56e44666517476523b5e91c9af207c217c27d160a16f1e4d862a4b5b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-behave \
python3.11dist-behave \
python311-behave \
python3dist-behave"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-parse \
python311-parse-type \
python311-six \
update-alternatives"

inherit rpm
