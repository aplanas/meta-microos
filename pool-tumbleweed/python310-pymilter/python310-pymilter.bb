SUMMARY = "Python interface to the sendmail milter API"
DESCRIPTION = "This is a Python extension module to enable python scripts to attach to \
sendmail's libmilter functionality. Additional Python modules provide for \
navigation and modification of MIME parts, sending DSNs, and doing CBV."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.4"

RPM_NAME = "python310-pymilter-1.0.4-3.14.aarch64.rpm"
RPM_HASH = "981189c0f58b3cd5d9253cb729a2e56faf02527b872d1cc74cad2a2c7e3f97c59d8181ba32c2307d8da56f05518a1b6892ac1e1fccf25d344b0a0a1e013925a2"

RPROVIDES:${PN} += "python3.10dist-pymilter \
python310-pymilter \
python3dist-pymilter"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmilter.so.1.0 \
pymilter-common \
python-abi \
python310 \
python310-py3dns"

inherit rpm
