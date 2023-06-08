SUMMARY = "Broadcom based arm64 systems"
DESCRIPTION = "Device Tree files for Broadcom based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "dtb-broadcom-6.3.1-1.2.aarch64.rpm"
RPM_HASH = "049792d02f63eb50690f0163ff3fc1991c2b54f3d58ced1dcd08236395b4ddfcaf27bf1a91bd611f8c4fa4bcf0da83e938baddbd9345e1fe5af93ee27f8cd35a"

RPROVIDES:${PN} += "dtb-broadcom dtb-broadcom(aarch-64) multiversion(dtb)"
RDEPENDS:${PN} += "/bin/sh coreutils"

inherit rpm
