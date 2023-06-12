SUMMARY = "Container Signing, Verification and Storage in an OCI registry"
DESCRIPTION = "Cosign aims to make signatures invisible infrastructure. \
 \
Cosign supports: \
 \
- Hardware and KMS signing \
- Bring-your-own PKI \
- Our free OIDC PKI (Fulcio) \
- Built-in binary transparency and timestamping service (Rekor)"
LICENSE = "Apache-2.0"

PV = "2.0.1"

RPM_NAME = "cosign-2.0.1-1.2.aarch64.rpm"
RPM_HASH = "3124f21686f0f5fcaf939c513f0f6bb7db16eb45b463dd5925833c7419a3c4211d1e27471082c6520ee1f9e6385c95e15cf5d6c75dc3cd2e3838cff550b17c56"

RPROVIDES:${PN} += "cosign \
cosign(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
