SUMMARY = "Kernel Samepage Merging services"
DESCRIPTION = "Kernel Samepage Merging (KSM) is a memory-saving de-duplication feature, that \
merges anonymous (private) pages (not pagecache ones). \
 \
This package provides a service file for starting and stopping KSM."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-ksm-8.0.3-2.1.aarch64.rpm"
RPM_HASH = "a55d812c4014adb178274efc9d63e1e6ffe46d621236f635dfea692fd9a314f1ea7c75f9d9d4c1f80a9bff83e2a0bc7ea9c79541e40078d262f76d80950ce4b0"

RPROVIDES:${PN} += "qemu-ksm"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
