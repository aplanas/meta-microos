SUMMARY = "Python bindings for TSS"
DESCRIPTION = "TPM2 TSS Python bindings for Enhanced System API (ESYS), Feature API \
(FAPI), Marshaling (MU), TCTI Loader (TCTILdr) and RC Decoding \
(rcdecode) libraries. It also contains utility methods for wrapping \
keys to TPM 2.0 data structures for importation into the TPM, \
unwrapping keys and exporting them from the TPM, TPM-less \
makecredential command and name calculations, TSS2 PEM Key format \
support, importing Keys from PEM, DER and SSH formats, conversion from \
tpm2-tools based command line strings and loading tpm2-tools context \
files."
LICENSE = "BSD-2-Clause"

PV = "2.1.0"

RPM_NAME = "python3-tpm2-pytss-2.1.0-2.4.aarch64.rpm"
RPM_HASH = "82d20b45b1f497d1058aecd42d69468bac960549d3e15076f233b5bedf1ef6f5338bf0e7319f4f55be0964251a296192fc79218708c20dd40db38eb000b1a4b0"

RPROVIDES:${PN} += "python3-tpm2-pytss \
python3.11dist-tpm2-pytss \
python3dist-tpm2-pytss"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtss2-esys.so.0 \
libtss2-fapi.so.1 \
libtss2-mu.so.0 \
libtss2-policy.so.0 \
libtss2-rc.so.0 \
libtss2-tcti-spi-helper.so.0 \
libtss2-tctildr.so.0 \
pkgconfig-tss2-esys \
pkgconfig-tss2-fapi \
python-abi \
python3-PyYAML \
python3-asn1crypto \
python3-cffi \
python3-cryptography \
python3-packaging \
python3-setuptools"

inherit rpm
