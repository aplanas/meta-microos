SUMMARY = "Pythonic Task Execution"
DESCRIPTION = "Invoke is a Python (2.7 and 3.4+) task execution tool & library, drawing \
inspiration from various sources to arrive at a powerful & clean feature set."
LICENSE = "BSD-2-Clause"

PV = "2.1.2"

RPM_NAME = "python39-invoke-2.1.2-1.1.noarch.rpm"
RPM_HASH = "2e8f6503551caa4aa5fc20bff6f11712870b19abb27caab5db2d8db19cce799d7caca60c459aae5cc99ab78e3028355925b7bf99524c07fe38a90b34318187c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-invoke \
python39-invoke \
python3dist-invoke"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-PyYAML \
python39-fluidity-sm \
python39-lexicon \
update-alternatives"

inherit rpm
