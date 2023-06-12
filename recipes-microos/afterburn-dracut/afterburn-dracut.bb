SUMMARY = "Dracut modules for afterburn"
DESCRIPTION = "Dracut module that enables afterburn and corresponding services \
to run in the initramfs on boot."
LICENSE = "Apache-2.0"

PV = "5.4.1"

RPM_NAME = "afterburn-dracut-5.4.1-1.1.aarch64.rpm"
RPM_HASH = "ab93544f0a6290ad35fcc4c7868accc0e4f3291ae2943b836222463b6e9c8e617df8778d4d935fd9065a3ebeb83b6c9bbdea49bc31e180a68c78c6f5dee4d801"

RPROVIDES:${PN} += "afterburn-dracut \
afterburn-dracut(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
afterburn(aarch-64) \
dracut"

inherit rpm
