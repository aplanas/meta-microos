SUMMARY = "A Python interface to RFC 2743/2744 (plus common extensions)"
DESCRIPTION = "Python-GSSAPI provides both low-level and high level wrappers around the GSSAPI \
C libraries. While it focuses on the Kerberos mechanism, it should also be \
usable with other GSSAPI mechanisms."
LICENSE = "ISC"

PV = "1.8.2"

RPM_NAME = "python310-gssapi-1.8.2-3.1.aarch64.rpm"
RPM_HASH = "8d4d06471251b59b129491b9548866ec73921bd993b40b7ccc13897a2c05323d7e01c6e5ada7b1708974cbdbe5646da94f6d764f95d703c44ee05a113ff58229"

RPROVIDES:${PN} += "python3.10dist-gssapi \
python310-gssapi \
python3dist-gssapi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgssapi-krb5.so.2 \
python-abi \
python310-decorator"

inherit rpm
