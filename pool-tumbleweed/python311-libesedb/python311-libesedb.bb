SUMMARY = "Library and tools to access the ESE Database File (EDB) format"
DESCRIPTION = "Library and tools to access the Extensible Storage Engine (ESE) Database File \
(EDB) format. ESEDB is used in may different applications like Windows Search, \
Windows Mail, Exchange, Active Directory, etc."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20230318"

RPM_NAME = "python311-libesedb-20230318-1.6.aarch64.rpm"
RPM_HASH = "23fb7a4370e4f9918c247dc8431a0a3871bd78d14f578216d7b75c65f4ed9f726377c73193ad16f9473ad2a1e6182e53830fede44ef5d7d5113ec0fb15ccf8eb"

RPROVIDES:${PN} += "python3-libesedb \
python311-libesedb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libesedb.so.1 \
python-abi"

inherit rpm
