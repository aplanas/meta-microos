SUMMARY = "Behaviour-driven development, Python style"
DESCRIPTION = "Behavior-driven development (or BDD) is an agile software development \
technique that encourages collaboration between developers, QA and \
non-technical or business participants in a software project. \
 \
*behave* uses tests written in a natural language style, backed up by Python \
code."
LICENSE = "BSD-2-Clause"

PV = "1.2.6"

RPM_NAME = "python39-behave-1.2.6-5.8.noarch.rpm"
RPM_HASH = "ed59302a8778def45fb763d0477fd9e64b3ed4181dd6f5322d37f8a61eb771daae704798338e924aca6896a77ac7291b181fd3473e6c03b52e904bedeff00d55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-behave \
python39-behave \
python3dist-behave"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-parse \
python39-parse-type \
python39-six \
update-alternatives"

inherit rpm
