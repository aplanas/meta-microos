SUMMARY = "A Python interface to RFC 2743/2744 (plus common extensions)"
DESCRIPTION = "Python-GSSAPI provides both low-level and high level wrappers around the GSSAPI \
C libraries. While it focuses on the Kerberos mechanism, it should also be \
usable with other GSSAPI mechanisms."
LICENSE = "ISC"

PV = "1.8.2"

RPM_NAME = "python310-gssapi-1.8.2-2.1.aarch64.rpm"
RPM_HASH = "6998979c010b71ac9fff1c76fa884eed4dd3f081d712b2824b96d962ae31fd680f74a5d95fa36edd849e82c0126b99cad62cc8e72e9bdd9dfeab241a92c91de7"

RPROVIDES:${PN} += "python3-gssapi \
python3.10dist-gssapi \
python310-gssapi \
python3dist-gssapi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgssapi-krb5.so.2 \
python-abi \
python310-decorator"

inherit rpm
