SUMMARY = "Filesystem benchmark"
DESCRIPTION = "The fs_mark benchmark tests synchronous write workloads. It can vary the number \
of files, directory depth, etc. It has detailed timings for reads, writes, \
unlinks and fsyncs that make it good for simulating mail servers and other \
setups."
LICENSE = "GPL-2.0+"

PV = "3.3"

RPM_NAME = "fs_mark-3.3-2.25.aarch64.rpm"
RPM_HASH = "eb014461283fa2083fefb031395ea3075bebc60c3ed0279be94cee1eccf9856b75dd6a2cf404b34adf091fcf587e3805eceedd9e8c3d2899a8a486f4151e54cd"

RPROVIDES:${PN} += "fs-mark"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
