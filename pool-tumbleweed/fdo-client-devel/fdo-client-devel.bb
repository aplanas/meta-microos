SUMMARY = "FIDO Device Onboard Client SDK"
DESCRIPTION = "This is a production-ready implementation of the Device component defined \
in FIDO Device Onboard Spec published by the FIDO Alliance. \
Appropriate security measures should be taken for storing the device \
credentials while porting this to different platforms."
LICENSE = "Apache-2.0"

PV = "1.1.4+git20221209.c8ef757"

RPM_NAME = "fdo-client-devel-1.1.4+git20221209.c8ef757-1.3.aarch64.rpm"
RPM_HASH = "55bdf003be1ff11e78432b6c3a7735870b762a8c41fbda91e317326cc219f99c4022f7dcf705944fb861e9622971291b60eafce8a3d07490bc80994a25104643"

RPROVIDES:${PN} += "fdo-client-devel"

RDEPENDS:${PN} += "libopenssl-1-1-devel"

inherit rpm
