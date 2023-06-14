SUMMARY = "Kernel Samepage Merging services"
DESCRIPTION = "Kernel Samepage Merging (KSM) is a memory-saving de-duplication feature, that \
merges anonymous (private) pages (not pagecache ones). \
 \
This package provides a service file for starting and stopping KSM."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-ksm-8.0.2-1.1.aarch64.rpm"
RPM_HASH = "cecfc77746311a93cccc2031945fc952c3f4c8e7ce44f73f9599b78eaba81f4d1763c4aa82af72c1b804f80ac7491d7ce0e78c1c41c5550468fe79e2feb238e8"

RPROVIDES:${PN} += "qemu-ksm"

RDEPENDS:${PN} += "/bin/sh \
coreutils"

inherit rpm
