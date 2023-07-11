SUMMARY = "Library and tools to access the ESE Database File (EDB) format"
DESCRIPTION = "Library and tools to access the Extensible Storage Engine (ESE) Database File \
(EDB) format. ESEDB is used in may different applications like Windows Search, \
Windows Mail, Exchange, Active Directory, etc."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20230318"

RPM_NAME = "python310-libesedb-20230318-1.5.aarch64.rpm"
RPM_HASH = "a777282eb5e97273e7f9a990b1a22fba1426f807b8bf83454585148f5344d91ada7608ad0e4681d3a331882c408be45e60fa19268b5bdbe60bbf657a301aa365"

RPROVIDES:${PN} += "python310-libesedb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libesedb.so.1 \
python-abi"

inherit rpm
