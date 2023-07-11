SUMMARY = "Library and tools to access the ESE Database File (EDB) format"
DESCRIPTION = "Library and tools to access the Extensible Storage Engine (ESE) Database File \
(EDB) format. ESEDB is used in may different applications like Windows Search, \
Windows Mail, Exchange, Active Directory, etc."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20230318"

RPM_NAME = "python311-libesedb-20230318-1.5.aarch64.rpm"
RPM_HASH = "b7cb854ade677bd50df88d2adadb98382c3f1305eaec2c14ac6cef850f89cc516653abf1c49ee9ec0c70b43e0b54ddc4abca7ef5009ab0fb4f3acfceab1240de"

RPROVIDES:${PN} += "python3-libesedb \
python311-libesedb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libesedb.so.1 \
python-abi"

inherit rpm
