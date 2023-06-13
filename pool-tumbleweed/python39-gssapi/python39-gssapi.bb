SUMMARY = "A Python interface to RFC 2743/2744 (plus common extensions)"
DESCRIPTION = "Python-GSSAPI provides both low-level and high level wrappers around the GSSAPI \
C libraries. While it focuses on the Kerberos mechanism, it should also be \
usable with other GSSAPI mechanisms."
LICENSE = "ISC"

PV = "1.8.2"

RPM_NAME = "python39-gssapi-1.8.2-2.1.aarch64.rpm"
RPM_HASH = "b28a5531cccaa5b547a73da18b2ecd2c3f926ea16fbdf3247ef1f5a2930bf0955fd8cd47373419f6361e7546683f0b4099d93359044023d56befa02602766957"

RPROVIDES:${PN} += "python3.9dist(gssapi) \
python39-gssapi \
python39-gssapi(aarch-64) \
python3dist(gssapi)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgssapi_krb5.so.2()(64bit) \
libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) \
python(abi) \
python39-decorator"

inherit rpm
