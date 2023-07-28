SUMMARY = "Kernel Samepage Merging services"
DESCRIPTION = "Kernel Samepage Merging (KSM) is a memory-saving de-duplication feature, that \
merges anonymous (private) pages (not pagecache ones). \
 \
This package provides a service file for starting and stopping KSM."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-ksm-8.0.3-1.1.aarch64.rpm"
RPM_HASH = "f5a779b800bd5414089edf24a50a5dd672be7f9719b09096594fdd7a17acce472f21dd2327cb8bdd42d7778fd6c37fe4e64e875f7ba81c90e87317d55df23456"

RPROVIDES:${PN} += "qemu-ksm"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
