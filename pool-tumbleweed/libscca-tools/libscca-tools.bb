SUMMARY = "Tools to access the Windows Prefetch File (PF) format"
DESCRIPTION = "libscca-tools is a project to access the Windows Prefetch File (PF) format. \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "LGPL-3.0-or-later"

PV = "20221027"

RPM_NAME = "libscca-tools-20221027-3.10.aarch64.rpm"
RPM_HASH = "b6f0a5e5ffc7bfea58098f3295f7ee7c99512beb495a89c799a7515df2efd828944dbee2a1a2a845845d7c66d37902f5b4e391d2a509a41a206c8885a80b1019"

RPROVIDES:${PN} += "libscca-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfdatetime.so.1 \
libscca.so.1"

inherit rpm
