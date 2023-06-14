SUMMARY = "Library and tools to access the ESE Database File (EDB) format"
DESCRIPTION = "Library and tools to access the Extensible Storage Engine (ESE) Database File \
(EDB) format. ESEDB is used in may different applications like Windows Search, \
Windows Mail, Exchange, Active Directory, etc."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20230318"

RPM_NAME = "python39-libesedb-20230318-1.2.aarch64.rpm"
RPM_HASH = "e5f97591527252f711550dec777df4268f759cfd570af06e72f7651d0440ccae0505f3db58eebece73b5357486c53d0518d2041e5372e44e10cc2d2655a9042f"

RPROVIDES:${PN} += "python39-libesedb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libesedb.so.1 \
python-abi"

inherit rpm
