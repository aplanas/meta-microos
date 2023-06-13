SUMMARY = "Static build of utilities for the Btrfs filesystem"
DESCRIPTION = "Static build of utilities needed to create and maintain btrfs file systems \
under Linux. Suitable for limited or rescue environments. \
 \
Warning: the zlib and lzo libraries are statically linked in and may lack \
important updates"
LICENSE = "GPL-2.0-only"

PV = "6.3"

RPM_NAME = "btrfsprogs-static-6.3-1.1.aarch64.rpm"
RPM_HASH = "33e936e11c3614f8d490e7d2944c953a7e977afc44a61839d7ed05b2e2c6f936d838bc36c25a0c644779b314899d4f5f498def96dd43547804518a1dac3c35c3"

RPROVIDES:${PN} += "btrfs-progs-static \
btrfs-progs-static(aarch64) \
btrfsprogs-static \
btrfsprogs-static(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
