SUMMARY = "KtoBLZCheck python-bindings"
DESCRIPTION = "This package contains the python-bindings for ktoblzcheck."
LICENSE = "LGPL-2.1-only"

PV = "1.53"

RPM_NAME = "python3-ktoblzcheck-1.53-1.5.aarch64.rpm"
RPM_HASH = "c2dffd3573b44d52e2804e70871b78c841bf4d1f09fe63e60bc9fa528396be4e7b3cdd0ad3464025a557fc1f4225dc3d892f359f1fdc526220480058a31799ec"

RPROVIDES:${PN} += "python3-ktoblzcheck"

RDEPENDS:${PN} += "ktoblzcheck \
libktoblzcheck1 \
python-abi"

inherit rpm
