SUMMARY = "Tools to access the Windows Prefetch File (PF) format"
DESCRIPTION = "libscca-tools is a project to access the Windows Prefetch File (PF) format. \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "LGPL-3.0-or-later"

PV = "20221027"

RPM_NAME = "libscca-tools-20221027-3.11.aarch64.rpm"
RPM_HASH = "1eb8ad049c6b2f521aee513ead9dc2cf69894ed68228db0967cdf4b4edf327b37864120f73a6df7be5ca4fa3fafcff53f88b5f46e6e000afdfeec060e72369a5"

RPROVIDES:${PN} += "libscca-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfdatetime.so.1 \
libscca.so.1"

inherit rpm
