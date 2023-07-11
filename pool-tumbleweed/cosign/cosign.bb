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

RPM_NAME = "cosign-2.0.1-1.3.aarch64.rpm"
RPM_HASH = "78c06a16e8e5a2362f85c412199fe8e2786dc29e655fcade8635936361a32031193c9972e0be7df32b376ab8b78b4b7f493aefbd694ce245fdd7c53589c4025f"

RPROVIDES:${PN} += "cosign"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
