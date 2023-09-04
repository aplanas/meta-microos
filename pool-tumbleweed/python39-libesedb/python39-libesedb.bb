SUMMARY = "Library and tools to access the ESE Database File (EDB) format"
DESCRIPTION = "Library and tools to access the Extensible Storage Engine (ESE) Database File \
(EDB) format. ESEDB is used in may different applications like Windows Search, \
Windows Mail, Exchange, Active Directory, etc."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20230318"

RPM_NAME = "python39-libesedb-20230318-2.1.aarch64.rpm"
RPM_HASH = "3354dad3d746ed2464ea51120e099c27bc953f7b14d85e5791b59760020e57d7ac16a285d45ed05a813c4db3398358adf790361d784bbfc6723afe45ca45f03a"

RPROVIDES:${PN} += "python39-libesedb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libesedb.so.1 \
python-abi"

inherit rpm
