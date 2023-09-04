SUMMARY = "Kernel Samepage Merging services"
DESCRIPTION = "Kernel Samepage Merging (KSM) is a memory-saving de-duplication feature, that \
merges anonymous (private) pages (not pagecache ones). \
 \
This package provides a service file for starting and stopping KSM."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.4"

RPM_NAME = "qemu-ksm-8.0.4-1.1.aarch64.rpm"
RPM_HASH = "01e12d6804fa17f9407094df2f0948e924eb669e6942ea82543cba582f842bca7367561bac23d4f0c4938e677d09c4f5e908efd2db59e0957a543c2640303014"

RPROVIDES:${PN} += "qemu-ksm"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
