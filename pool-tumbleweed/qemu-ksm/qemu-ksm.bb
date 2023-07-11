SUMMARY = "Kernel Samepage Merging services"
DESCRIPTION = "Kernel Samepage Merging (KSM) is a memory-saving de-duplication feature, that \
merges anonymous (private) pages (not pagecache ones). \
 \
This package provides a service file for starting and stopping KSM."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-ksm-8.0.2-2.1.aarch64.rpm"
RPM_HASH = "68c6c79b28c6fa5da5719c36a136a3d447105de953d36e307d1e37c7832ec173188bbdc9ae4ea5728ff7553e5c7ef540ab8fe561da097dd3f64d7ecc9c0f0d66"

RPROVIDES:${PN} += "qemu-ksm"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
