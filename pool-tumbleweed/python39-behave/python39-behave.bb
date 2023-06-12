SUMMARY = "Behaviour-driven development, Python style"
DESCRIPTION = "Behavior-driven development (or BDD) is an agile software development \
technique that encourages collaboration between developers, QA and \
non-technical or business participants in a software project. \
 \
*behave* uses tests written in a natural language style, backed up by Python \
code."
LICENSE = "BSD-2-Clause"

PV = "1.2.6"

RPM_NAME = "python39-behave-1.2.6-5.6.noarch.rpm"
RPM_HASH = "4b6ad711dd5e866a01c358af41ed33f40d4dff2c491023568664f1e56097dc12e3245838f5fd6e057ca8957bb27d9d28b9a4f7ce8b5bfa7cdb929c0046533951"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(behave) \
python39-behave \
python3dist(behave)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-parse \
python39-parse_type \
python39-six \
update-alternatives"

inherit rpm
