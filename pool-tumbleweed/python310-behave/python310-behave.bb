SUMMARY = "Behaviour-driven development, Python style"
DESCRIPTION = "Behavior-driven development (or BDD) is an agile software development \
technique that encourages collaboration between developers, QA and \
non-technical or business participants in a software project. \
 \
*behave* uses tests written in a natural language style, backed up by Python \
code."
LICENSE = "BSD-2-Clause"

PV = "1.2.6"

RPM_NAME = "python310-behave-1.2.6-5.8.noarch.rpm"
RPM_HASH = "81dfb1c78fc076e3e03ca79c0ceff6668fe70d5484690e5496a16e21dda5a24558b1b24da77516752d66786afcc21e94fd061ee6ac3842e554e6f0d34ee8874d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-behave \
python310-behave \
python3dist-behave"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-parse \
python310-parse-type \
python310-six \
update-alternatives"

inherit rpm
