SUMMARY = "FIDO Device Onboard Client SDK"
DESCRIPTION = "This is a production-ready implementation of the Device component defined \
in FIDO Device Onboard Spec published by the FIDO Alliance. \
Appropriate security measures should be taken for storing the device \
credentials while porting this to different platforms."
LICENSE = "Apache-2.0"

PV = "1.1.4+git20221209.c8ef757"

RPM_NAME = "fdo-client-devel-1.1.4+git20221209.c8ef757-1.5.aarch64.rpm"
RPM_HASH = "599f4cd1b80ca68683ef9dfd0a917735a6f3b5d4879ed1d4cb7a69a44ceef6cc1401b5e69f31f4df22bcc170c6c332b1aa16c804188737454a0d3a8f8f3ca403"

RPROVIDES:${PN} += "fdo-client-devel"

RDEPENDS:${PN} += "libopenssl-1-1-devel"

inherit rpm
