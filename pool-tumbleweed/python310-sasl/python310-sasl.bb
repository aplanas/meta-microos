SUMMARY = "SASL for Python"
DESCRIPTION = "Cyrus-SASL bindings for Python."
LICENSE = "Apache-2.0"

PV = "0.3.1"

RPM_NAME = "python310-sasl-0.3.1-1.6.aarch64.rpm"
RPM_HASH = "5fb3bc81f50b735c9fc2ad6cb3bf238372298a6d47a94551474aae2e05d142dd345b0efcd28cf03188c914adb6ffedb0f35aafa75057e5b99b557a43b373632d"

RPROVIDES:${PN} += "python3.10dist-sasl \
python310-sasl \
python3dist-sasl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libsasl2.so.3 \
libstdc++.so.6 \
python-abi \
python310-six"

inherit rpm
