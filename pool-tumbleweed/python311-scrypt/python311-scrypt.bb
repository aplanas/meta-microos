SUMMARY = "Bindings for scrypt"
DESCRIPTION = "Bindings for the scrypt key derivation function library."
LICENSE = "BSD-2-Clause"

PV = "0.8.20"

RPM_NAME = "python311-scrypt-0.8.20-2.3.aarch64.rpm"
RPM_HASH = "2b1601a26e15eacd85d48650ca3c2a5b630529e4e007e918420b97f9583b31961e5634474b212e81f2baa4f522ea930a19255b837f36cc358bd103fb0b2e28bf"

RPROVIDES:${PN} += "python3-scrypt \
python3.11dist-scrypt \
python311-scrypt \
python3dist-scrypt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
python-abi"

inherit rpm
