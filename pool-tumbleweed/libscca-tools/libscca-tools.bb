SUMMARY = "Tools to access the Windows Prefetch File (PF) format"
DESCRIPTION = "libscca-tools is a project to access the Windows Prefetch File (PF) format. \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "LGPL-3.0-or-later"

PV = "20221027"

RPM_NAME = "libscca-tools-20221027-3.7.aarch64.rpm"
RPM_HASH = "bd833f79289a0c18357ff4c5329cb7fb61aeade9bf372f83de8924c397284e5502edc871875770cec1ad770ecb8d08451d8e5d9b04b6a99129f33a4cdc10ae27"

RPROVIDES:${PN} += "libscca-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfdatetime.so.1 \
libscca.so.1"

inherit rpm
