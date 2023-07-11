SUMMARY = "Empty package to ensure rebuilding kernel-default-base in OBS"
DESCRIPTION = "This is empty package that ensures kernel-default-base is rebuilt every time \
kernel-default is rebuilt in OBS. \
 \
There is no reason to install this package."
LICENSE = "GPL-2.0-only"

PV = "6.3.9"

RPM_NAME = "kernel-default-base-rebuild-6.3.9-1.1.28.1.aarch64.rpm"
RPM_HASH = "f371850f102f5c92e4a6d56dbb40d81747d82e827436a4c124d7bd1246a3a940f2d95a0f2c128ae0baebac4249c4c2f2e7224ef7bf32ff632bf3d8fa08bb2251"

RPROVIDES:${PN} += "kernel-default-base-rebuild"

RDEPENDS:${PN} += "kernel-default"

inherit rpm
