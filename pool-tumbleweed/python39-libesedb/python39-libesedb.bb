SUMMARY = "Library and tools to access the ESE Database File (EDB) format"
DESCRIPTION = "Library and tools to access the Extensible Storage Engine (ESE) Database File \
(EDB) format. ESEDB is used in may different applications like Windows Search, \
Windows Mail, Exchange, Active Directory, etc."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20230318"

RPM_NAME = "python39-libesedb-20230318-1.5.aarch64.rpm"
RPM_HASH = "cf97bd3cfa59a80f46394cb6b223ed6ea5d13f4a0f59e3e1e0d73046d8881b4c0696d3534fcc7b32f8458b0376013f1bc01f3dfc8c699779b272c1ba3d675832"

RPROVIDES:${PN} += "python39-libesedb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libesedb.so.1 \
python-abi"

inherit rpm
