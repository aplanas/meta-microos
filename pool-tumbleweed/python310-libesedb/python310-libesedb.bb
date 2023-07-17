SUMMARY = "Library and tools to access the ESE Database File (EDB) format"
DESCRIPTION = "Library and tools to access the Extensible Storage Engine (ESE) Database File \
(EDB) format. ESEDB is used in may different applications like Windows Search, \
Windows Mail, Exchange, Active Directory, etc."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20230318"

RPM_NAME = "python310-libesedb-20230318-1.6.aarch64.rpm"
RPM_HASH = "23e2a9daf7ad4af5fd96bc25d49e8610f0ebc52768fa25e483e907cc46d63e36e91f3453a6fdcff6a67212e9037d2dfd14552d4b5af902f4868bf81a711fec19"

RPROVIDES:${PN} += "python310-libesedb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libesedb.so.1 \
python-abi"

inherit rpm
