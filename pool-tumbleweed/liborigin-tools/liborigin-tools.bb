SUMMARY = "Converter for OriginLab OPJ project files"
DESCRIPTION = "Converter for OriginLab OPJ project files. \
Features: \
* reads any worksheets with all columns \
* supports 4.1, 5.0, 6.0, 6.1, 7.0, 7.5 projects"
LICENSE = "GPL-2.0-or-later"

PV = "3.0.1"

RPM_NAME = "liborigin-tools-3.0.1-1.11.aarch64.rpm"
RPM_HASH = "8cdeb324261b130ba5fa0db0b25400129d91c12081742f2a3029dda3fbd1b062d6cb61d8a1aed68df801a004ca8c1197547e42b90192fc30af5a1a47d3926c36"

RPROVIDES:${PN} += "liborigin-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
liborigin.so.3 \
libstdc++.so.6"

inherit rpm
