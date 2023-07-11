SUMMARY = "Pythonic Task Execution"
DESCRIPTION = "Invoke is a Python (2.7 and 3.4+) task execution tool & library, drawing \
inspiration from various sources to arrive at a powerful & clean feature set."
LICENSE = "BSD-2-Clause"

PV = "2.1.2"

RPM_NAME = "python310-invoke-2.1.2-1.3.noarch.rpm"
RPM_HASH = "4132b98443a1cf439cbc529880e60ff94e8b19384e918fcc2f574f6102b54d929439096d21b544af95c3a1c23c55a2e69f6d341bb6f6151ad7f291a1d20c0cd8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-invoke \
python310-invoke \
python3dist-invoke"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-PyYAML \
python310-fluidity-sm \
python310-lexicon \
update-alternatives"

inherit rpm
