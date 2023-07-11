SUMMARY = "Python interface to the sendmail milter API"
DESCRIPTION = "This is a Python extension module to enable python scripts to attach to \
sendmail's libmilter functionality. Additional Python modules provide for \
navigation and modification of MIME parts, sending DSNs, and doing CBV."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.4"

RPM_NAME = "python39-pymilter-1.0.4-3.14.aarch64.rpm"
RPM_HASH = "c5cf5c3a8d4781ffa45f978f02ee0426856bf39af60b3940f544a95d61671eac78f1eb853c603cde4ca503bf2b936d1f8dbd8f219a92b790c5938aabc878a641"

RPROVIDES:${PN} += "python3.9dist-pymilter \
python39-pymilter \
python3dist-pymilter"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmilter.so.1.0 \
pymilter-common \
python-abi \
python39 \
python39-py3dns"

inherit rpm
