SUMMARY = "Python interface to the sendmail milter API"
DESCRIPTION = "This is a Python extension module to enable python scripts to attach to \
sendmail's libmilter functionality. Additional Python modules provide for \
navigation and modification of MIME parts, sending DSNs, and doing CBV."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.4"

RPM_NAME = "python311-pymilter-1.0.4-3.14.aarch64.rpm"
RPM_HASH = "6b68b773e28b27f8f81b727542ad003dfec15aad515a794d30e4afb2ae7a373625590f62087b70b5c57db29913483821840b569db6e541f5fbc7725550e449c9"

RPROVIDES:${PN} += "python3-pymilter \
python3.11dist-pymilter \
python311-pymilter \
python3dist-pymilter"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmilter.so.1.0 \
pymilter-common \
python-abi \
python311 \
python311-py3dns"

inherit rpm
