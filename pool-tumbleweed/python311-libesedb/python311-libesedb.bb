SUMMARY = "Library and tools to access the ESE Database File (EDB) format"
DESCRIPTION = "Library and tools to access the Extensible Storage Engine (ESE) Database File \
(EDB) format. ESEDB is used in may different applications like Windows Search, \
Windows Mail, Exchange, Active Directory, etc."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20230318"

RPM_NAME = "python311-libesedb-20230318-2.1.aarch64.rpm"
RPM_HASH = "c474aa916b1d22e5c856a3f7ff115edc34daa83b884ed4c6bbc359176e5f02621150fdb2d369c3bc7dfaa0c58d539987b12b7616ef6efda8d6d9187947e995a9"

RPROVIDES:${PN} += "python3-libesedb \
python311-libesedb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libesedb.so.1 \
python-abi"

inherit rpm
