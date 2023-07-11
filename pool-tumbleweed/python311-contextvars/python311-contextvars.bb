SUMMARY = "PEP 567 (context variables) backport"
DESCRIPTION = "PEP 567 (Context Variables) backport."
LICENSE = "Apache-2.0"

PV = "2.4"

RPM_NAME = "python311-contextvars-2.4-4.3.noarch.rpm"
RPM_HASH = "77497728640af02a10a5c3e72a9bd4dc72a1cb8ab4a2b209fa3721f70e6778884c81227e3fae46d991d35ea28ca1ed6b37f573d27bc2e5bad8df69048ee7c775"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-contextvars \
python3.11dist-contextvars \
python311-contextvars \
python3dist-contextvars"

RDEPENDS:${PN} += "python-abi \
python311-immutables"

inherit rpm
