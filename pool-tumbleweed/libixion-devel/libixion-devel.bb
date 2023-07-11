SUMMARY = "Threaded multi-target formula parser & interpreter"
DESCRIPTION = "Ixion is a general purpose formula parser & interpreter that can calculate \
multiple named targets, or 'cells'."
LICENSE = "MIT"

PV = "0.17.0"

RPM_NAME = "libixion-devel-0.17.0-3.5.aarch64.rpm"
RPM_HASH = "1b9b3862cab0480929b44bfd86f247bbb9c015806b40141d0c7107e073dc8ac48662ff16bdeb0c8ea9dcbd36c617c754ad78caf4f7149da69abff85a67c3b266"

RPROVIDES:${PN} += "libixion-devel \
pkgconfig-libixion-0.17"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libixion-0-17-0"

inherit rpm
