SUMMARY = "A Python interface to RFC 2743/2744 (plus common extensions)"
DESCRIPTION = "Python-GSSAPI provides both low-level and high level wrappers around the GSSAPI \
C libraries. While it focuses on the Kerberos mechanism, it should also be \
usable with other GSSAPI mechanisms."
LICENSE = "ISC"

PV = "1.8.2"

RPM_NAME = "python311-gssapi-1.8.2-3.1.aarch64.rpm"
RPM_HASH = "02c49d00915ce981bfe406da3a6f085c06420a5b145315e5faad6825a0d7a628e07d7767be04a8f8d9454affdb74663930d784a20e53c8f99bfc98a83c4f25e2"

RPROVIDES:${PN} += "python3-gssapi \
python3.11dist-gssapi \
python311-gssapi \
python3dist-gssapi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgssapi-krb5.so.2 \
python-abi \
python311-decorator"

inherit rpm
