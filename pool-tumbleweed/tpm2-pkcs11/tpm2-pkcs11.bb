SUMMARY = "A PKCS#11 interface for TPM2 hardware"
DESCRIPTION = "tpm2-pkcs11 is a plugin shared library implementing the PKCS #11 \
Cryptographic Token Interface (Cryptoki) C API atop of TPM2 devices."
LICENSE = "BSD-2-Clause"

PV = "1.9.0"

RPM_NAME = "tpm2-pkcs11-1.9.0-2.3.aarch64.rpm"
RPM_HASH = "66ea7d03f38b38c98597a4f90dfffeffbef6e0f6e4b300143261e90129a09c35842df95250847fb581626cfef8c96ffcd0063f2589bc59d98f8da5c291c293bd"

RPROVIDES:${PN} += "libtpm2-pkcs11-0 \
libtpm2-pkcs11.so.0 \
pkgconfig-tpm2-pkcs11 \
python3.11dist-tpm2-pkcs11-tools \
python3dist-tpm2-pkcs11-tools \
tpm2-pkcs11 \
tpm2-pkcs11-devel"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/pkg-config \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libsqlite3.so.0 \
libtss2-esys.so.0 \
libtss2-fapi.so.1 \
libtss2-mu.so.0 \
libtss2-rc.so.0 \
libtss2-tctildr.so.0 \
libyaml-0.so.2 \
pkgconfig-libcrypto \
pkgconfig-sqlite3 \
pkgconfig-tss2-esys \
pkgconfig-tss2-mu \
python-abi \
python3.11dist-bcrypt \
python3.11dist-cryptography \
python3.11dist-pyasn1 \
python3.11dist-pyasn1-modules \
python3.11dist-pyyaml \
python3.11dist-setuptools \
python3.11dist-tpm2-pytss"

inherit rpm
