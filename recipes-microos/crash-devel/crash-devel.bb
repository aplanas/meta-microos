SUMMARY = "Development files for crash"
DESCRIPTION = "This files are required to build extensions for crash. \
 \
Crash is the core analysis suite that can be used to investigate either \
live systems, kernel core dumps created from the netdump and diskdump \
packages from Red Hat Linux, the mcore kernel patch offered by Mission \
Critical Linux, or the LKCD kernel patch. \
 \
 \
 \
Authors: \
-------- \
    David Anderson <anderson@redhat.com>"
LICENSE = "GPL-2.0-or-later"

PV = "8.0.3"

RPM_NAME = "crash-devel-8.0.3-1.1.aarch64.rpm"
RPM_HASH = "0a585f7ddd5155155c43e8034ecba304ec7be375ed0b8bbfacf756fecb89c630c92bc504c920c7578b29ecf883a4f22109e36657264b896f1ddc846e291e3343"

RPROVIDES:${PN} += "crash-devel crash-devel(aarch-64)"
RDEPENDS:${PN} += "crash zlib-devel"

inherit rpm
