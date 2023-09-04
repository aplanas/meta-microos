SUMMARY = "Library and tools to access the ESE Database File (EDB) format"
DESCRIPTION = "Library and tools to access the Extensible Storage Engine (ESE) Database File \
(EDB) format. ESEDB is used in may different applications like Windows Search, \
Windows Mail, Exchange, Active Directory, etc."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20230318"

RPM_NAME = "python310-libesedb-20230318-2.1.aarch64.rpm"
RPM_HASH = "464af1a02fa6091be20dd4b79e61d0b15c8566f1b801c39e7f0306f6050899a360b7e19006653979e51327aeee9946cd5b006676c7f0f2129faea25f91d7a960"

RPROVIDES:${PN} += "python310-libesedb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libesedb.so.1 \
python-abi"

inherit rpm
