SUMMARY = "Library and tools to access the ESE Database File (EDB) format"
DESCRIPTION = "Library and tools to access the Extensible Storage Engine (ESE) Database File \
(EDB) format. ESEDB is used in may different applications like Windows Search, \
Windows Mail, Exchange, Active Directory, etc."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20230318"

RPM_NAME = "python311-libesedb-20230318-1.2.aarch64.rpm"
RPM_HASH = "dfbaab5e7c58e51ea3b2ff117fd31ed81f63b82a74143f36dcadc46cf1f7eff1a0e5c651fcbb86c54e07f7fbba9bf4f02018777835bcf794ae1a5abf4c1dafb5"

RPROVIDES:${PN} += "python311-libesedb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libesedb.so.1 \
python-abi"

inherit rpm
