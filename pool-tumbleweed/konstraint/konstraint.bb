SUMMARY = "A policy management tool for interacting with Gatekeeper"
DESCRIPTION = "Konstraint is a CLI tool to assist with the creation and management of templates and constraints when using Gatekeeper."
LICENSE = "Apache-2.0"

PV = "0.29.0"

RPM_NAME = "konstraint-0.29.0-1.1.aarch64.rpm"
RPM_HASH = "c2d40dd85d7e6868a2ee2c5ded843b35f5d24dd3c6e0f314adcb2537b7819ab865bd9c1cfb1db59a301af43ecc1045c637ba131a65923ca02ab622b79101b708"

RPROVIDES:${PN} += "konstraint \
konstraint(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
