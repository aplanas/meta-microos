SUMMARY = "Behaviour-driven development, Python style"
DESCRIPTION = "Behavior-driven development (or BDD) is an agile software development \
technique that encourages collaboration between developers, QA and \
non-technical or business participants in a software project. \
 \
*behave* uses tests written in a natural language style, backed up by Python \
code."
LICENSE = "BSD-2-Clause"

PV = "1.2.6"

RPM_NAME = "python310-behave-1.2.6-5.6.noarch.rpm"
RPM_HASH = "c4050357a8f111fd5f78dab97c625c024b9b5136c87faddfd4366982918b505c87af36147fc499e5caae825a1e30c4bc78f872de86689119d20b7b4f0ac13a5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-behave \
python3.10dist(behave) \
python310-behave \
python3dist(behave)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-parse \
python310-parse_type \
python310-six \
update-alternatives"

inherit rpm
