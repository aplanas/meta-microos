SUMMARY = "A Python interface to RFC 2743/2744 (plus common extensions)"
DESCRIPTION = "Python-GSSAPI provides both low-level and high level wrappers around the GSSAPI \
C libraries. While it focuses on the Kerberos mechanism, it should also be \
usable with other GSSAPI mechanisms."
LICENSE = "ISC"

PV = "1.8.2"

RPM_NAME = "python39-gssapi-1.8.2-2.3.aarch64.rpm"
RPM_HASH = "9fedec9e0c07a356eeede9ff8aee26ea78b5b18daf486b89665991c8403a58bcf581e946282c3f85430338fa6c6c53fc9b30454bb252a8a88046af39dcc3c448"

RPROVIDES:${PN} += "python3.9dist-gssapi \
python39-gssapi \
python3dist-gssapi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgssapi-krb5.so.2 \
python-abi \
python39-decorator"

inherit rpm
