SUMMARY = "CLI for encrypting secrets to SealedSecrets"
DESCRIPTION = "Problem: 'I can manage all my K8s config in git, except Secrets.' \
 \
Solution: Encrypt your Secret into a SealedSecret, which is safe to store - even to a public repository. The SealedSecret can be decrypted only by the controller running in the target cluster and nobody else (not even the original author) is able to obtain the original Secret from the SealedSecret."
LICENSE = "Apache-2.0"

PV = "0.23.1"

RPM_NAME = "kubeseal-0.23.1-1.1.aarch64.rpm"
RPM_HASH = "58569e02d7606a22000e6145c02073b12d39a784794df04591b9f880debda0eb2d823765fcb20d49701a9b8e5615ef39fa91efdebb99f3836b0610dc2e2450bf"

RPROVIDES:${PN} += "kubeseal"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
