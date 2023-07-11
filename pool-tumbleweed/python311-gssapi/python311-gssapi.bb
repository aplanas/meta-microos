SUMMARY = "A Python interface to RFC 2743/2744 (plus common extensions)"
DESCRIPTION = "Python-GSSAPI provides both low-level and high level wrappers around the GSSAPI \
C libraries. While it focuses on the Kerberos mechanism, it should also be \
usable with other GSSAPI mechanisms."
LICENSE = "ISC"

PV = "1.8.2"

RPM_NAME = "python311-gssapi-1.8.2-2.3.aarch64.rpm"
RPM_HASH = "211aa05e0a941610de2cfbceb9189ef9fe076955ddd2c49a5be535ffe04d96d1ffcf9575eaeb8f0f422abdcdfe98105193050a1dfdaea4f7ecb50f2c1be1011d"

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
