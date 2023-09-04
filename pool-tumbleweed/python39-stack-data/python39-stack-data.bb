SUMMARY = "Extract data from python stack frames and tracebacks"
DESCRIPTION = "Extract data from python stack frames and tracebacks for informative displays"
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python39-stack-data-0.6.2-4.1.noarch.rpm"
RPM_HASH = "bf10835ae8b67e58f1005937a1f5abb8b6ee11f136a8f68bdbbe9c367fd1497edd01ff1096648c9fda788c87867c9734907f1ab50a3ba4de925134b0bd5cdada"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-stack-data \
python39-stack-data \
python3dist-stack-data"

RDEPENDS:${PN} += "python-abi \
python39-asttokens \
python39-executing \
python39-pure-eval"

inherit rpm
