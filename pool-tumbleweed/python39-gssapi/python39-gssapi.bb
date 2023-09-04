SUMMARY = "A Python interface to RFC 2743/2744 (plus common extensions)"
DESCRIPTION = "Python-GSSAPI provides both low-level and high level wrappers around the GSSAPI \
C libraries. While it focuses on the Kerberos mechanism, it should also be \
usable with other GSSAPI mechanisms."
LICENSE = "ISC"

PV = "1.8.2"

RPM_NAME = "python39-gssapi-1.8.2-3.1.aarch64.rpm"
RPM_HASH = "bcda06e1ad3f315916d758a57890078b0c32e3f60635d4b25249c7621f76273d47925dde7dcc641f32e5b7837c8f246b8aac9984c7a9a517d54176b653358139"

RPROVIDES:${PN} += "python3.9dist-gssapi \
python39-gssapi \
python3dist-gssapi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgssapi-krb5.so.2 \
python-abi \
python39-decorator"

inherit rpm
