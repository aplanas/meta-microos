SUMMARY = "Library and tools to access the ESE Database File (EDB) format"
DESCRIPTION = "Library and tools to access the Extensible Storage Engine (ESE) Database File \
(EDB) format. ESEDB is used in may different applications like Windows Search, \
Windows Mail, Exchange, Active Directory, etc."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20230318"

RPM_NAME = "python39-libesedb-20230318-1.6.aarch64.rpm"
RPM_HASH = "47c241b5522dd15848441b796752638c5bf797f460d0dc556abd2d4094498f2fbfd16e21aea6caf8b951b20ceb1af6561af8c9b9877ff350aae9ba3e0b9d97ae"

RPROVIDES:${PN} += "python39-libesedb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libesedb.so.1 \
python-abi"

inherit rpm
