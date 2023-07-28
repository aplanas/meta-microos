SUMMARY = "Tools to access the Windows Prefetch File (PF) format"
DESCRIPTION = "libscca-tools is a project to access the Windows Prefetch File (PF) format. \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "LGPL-3.0-or-later"

PV = "20230716"

RPM_NAME = "libscca-tools-20230716-1.1.aarch64.rpm"
RPM_HASH = "1bf8e8cfce9188eeb1441e92ca2f164b90347f1830131b04456433667836576d12dc496334a909efa0ae4797ef3b294a4aceadee1e4c0f504f94f46ed4f9cf4e"

RPROVIDES:${PN} += "libscca-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfdatetime.so.1 \
libscca.so.1 \
libuna.so.1"

inherit rpm
