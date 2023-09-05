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

PV = "2.2.0"

RPM_NAME = "cosign-2.2.0-1.1.aarch64.rpm"
RPM_HASH = "bc4593f41e5ddba8c62473c3829de93fdd3d727f43bc2a797b6c5a103b28c43c9fda08d76a5e8886dfab7867451e0f3b471a780af8e74727d9e46bdb9a328c5f"

RPROVIDES:${PN} += "cosign"

RDEPENDS:${PN} += ""

inherit rpm
