SUMMARY = "PEP 567 (context variables) backport"
DESCRIPTION = "PEP 567 (Context Variables) backport."
LICENSE = "Apache-2.0"

PV = "2.4"

RPM_NAME = "python39-contextvars-2.4-4.1.noarch.rpm"
RPM_HASH = "07c3fa0af59b988cd6c45ece86db0fbbd4299d4e4ddb318e3eb5b3f631df425a156fc6c4f50d3a6c6a9d327f55f1613aef426832f05bde0641c06c9a9e9bc5e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(contextvars) \
python39-contextvars \
python3dist(contextvars)"

RDEPENDS:${PN} += "python(abi) \
python39-immutables"

inherit rpm
