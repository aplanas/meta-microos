SUMMARY = "Tools to access the Windows Prefetch File (PF) format"
DESCRIPTION = "libscca-tools is a project to access the Windows Prefetch File (PF) format. \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "LGPL-3.0-or-later"

PV = "20230716"

RPM_NAME = "libscca-tools-20230716-2.1.aarch64.rpm"
RPM_HASH = "1c2a9d8ce575dab06e3d73288f5dd7aa9eef0dd458b34058ab94c6a1a30b692bbc6a0e87939e23dd1d1ca98532d9dae077faa44bfc6afb849a1ff61a0abeabf2"

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
