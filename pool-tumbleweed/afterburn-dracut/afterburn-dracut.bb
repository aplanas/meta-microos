SUMMARY = "Dracut modules for afterburn"
DESCRIPTION = "Dracut module that enables afterburn and corresponding services \
to run in the initramfs on boot."
LICENSE = "Apache-2.0"

PV = "5.4.1"

RPM_NAME = "afterburn-dracut-5.4.1-1.3.aarch64.rpm"
RPM_HASH = "fca4af6711e90172816213db32c4f13c0ede5f2f717f65e631f5c074869d36e167e823bb7a29df4803efbbeae021c9d5659523bdb082369e9c40243ee9be4211"

RPROVIDES:${PN} += "afterburn-dracut"

RDEPENDS:${PN} += "/usr/bin/bash \
afterburn \
dracut"

inherit rpm
