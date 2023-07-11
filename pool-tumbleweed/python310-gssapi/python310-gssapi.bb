SUMMARY = "A Python interface to RFC 2743/2744 (plus common extensions)"
DESCRIPTION = "Python-GSSAPI provides both low-level and high level wrappers around the GSSAPI \
C libraries. While it focuses on the Kerberos mechanism, it should also be \
usable with other GSSAPI mechanisms."
LICENSE = "ISC"

PV = "1.8.2"

RPM_NAME = "python310-gssapi-1.8.2-2.3.aarch64.rpm"
RPM_HASH = "8e3e2bb9e1a31100f11e65a4ba2e0eef520c4aa944f9971d53b0e61a4510a52c3e57b1e1e027976086aa8a71c14726abe089734cb3337d93c2ff7da81cfd8e44"

RPROVIDES:${PN} += "python3.10dist-gssapi \
python310-gssapi \
python3dist-gssapi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgssapi-krb5.so.2 \
python-abi \
python310-decorator"

inherit rpm
