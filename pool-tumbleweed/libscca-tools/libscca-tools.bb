SUMMARY = "Tools to access the Windows Prefetch File (PF) format"
DESCRIPTION = "libscca-tools is a project to access the Windows Prefetch File (PF) format. \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "LGPL-3.0-or-later"

PV = "20221027"

RPM_NAME = "libscca-tools-20221027-3.7.aarch64.rpm"
RPM_HASH = "bd833f79289a0c18357ff4c5329cb7fb61aeade9bf372f83de8924c397284e5502edc871875770cec1ad770ecb8d08451d8e5d9b04b6a99129f33a4cdc10ae27"

RPROVIDES:${PN} += "libscca-tools \
libscca-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libclocale.so.1()(64bit) \
libclocale.so.1(V_20221218)(64bit) \
libcnotify.so.1()(64bit) \
libcnotify.so.1(V_20220108)(64bit) \
libfdatetime.so.1()(64bit) \
libfdatetime.so.1(V_20220112)(64bit) \
libscca.so.1()(64bit) \
libscca.so.1(V_20221027)(64bit)"

inherit rpm
