SUMMARY = "Documentation for OpenStack messaging library"
DESCRIPTION = "The Oslo messaging API supports RPC and notifications over a number \
of different messaging transports. \
This package contains the documentation."
LICENSE = "Apache-2.0"

PV = "14.3.1"

RPM_NAME = "python3-oslo.messaging-doc-14.3.1-1.1.noarch.rpm"
RPM_HASH = "f5fe838028cad04a24589fe1c0ec5dcf0f077a2ecbc1dd19284231f9ee7b4b2633338f33ee1baea11511251ff2653165034b6de3868d7fba8bc53f4f7948c31b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.messaging-doc"

RDEPENDS:${PN} += ""

inherit rpm
