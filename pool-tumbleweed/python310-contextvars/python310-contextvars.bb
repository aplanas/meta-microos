SUMMARY = "PEP 567 (context variables) backport"
DESCRIPTION = "PEP 567 (Context Variables) backport."
LICENSE = "Apache-2.0"

PV = "2.4"

RPM_NAME = "python310-contextvars-2.4-4.3.noarch.rpm"
RPM_HASH = "123a8c42f7f1dd9dc82914df837a0514af211c7e4373f25e1d9ffb8a15159ad45becf83d7a6546b73ea8a80f52e2f3f6705f4af5d60970e451f8af9a73eb9e43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-contextvars \
python310-contextvars \
python3dist-contextvars"

RDEPENDS:${PN} += "python-abi \
python310-immutables"

inherit rpm
