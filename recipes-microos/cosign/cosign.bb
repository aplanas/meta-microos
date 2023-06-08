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

RPM_NAME = "cosign-2.0.1-1.1.aarch64.rpm"
RPM_HASH = "64efa00383e6a28206a0f48e5f3d3d945d60f4ec96c0904f988bf45868af42063403092b74b0f4e8aaca3277eeeaf2afc41b9acd3fbdc0d906b81782a941dad4"

RPROVIDES:${PN} += "cosign cosign(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
