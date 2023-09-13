SUMMARY = "PEP 567 (context variables) backport"
DESCRIPTION = "PEP 567 (Context Variables) backport."
LICENSE = "Apache-2.0"

PV = "2.4"

RPM_NAME = "python310-contextvars-2.4-5.1.noarch.rpm"
RPM_HASH = "7d37f7b407b621a793e16a26d01acc1e1e43af6268ec263f41d878b5aa15f629f871e96abea1c714402e721fa3b1a2e94ec1bc8b3c51b27cff1011bec2aa513d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-contextvars \
python310-contextvars \
python3dist-contextvars"

RDEPENDS:${PN} += "python-abi \
python310-immutables"

inherit rpm
