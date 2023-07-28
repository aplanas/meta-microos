SUMMARY = "CLI for encrypting secrets to SealedSecrets"
DESCRIPTION = "Problem: 'I can manage all my K8s config in git, except Secrets.' \
 \
Solution: Encrypt your Secret into a SealedSecret, which is safe to store - even to a public repository. The SealedSecret can be decrypted only by the controller running in the target cluster and nobody else (not even the original author) is able to obtain the original Secret from the SealedSecret."
LICENSE = "Apache-2.0"

PV = "0.23.0"

RPM_NAME = "kubeseal-0.23.0-1.1.aarch64.rpm"
RPM_HASH = "51f958e33bfad2115d6ffd549a82ac449a90ff32f7409a8186e259dd5e0f564fbfa95f7d94c693faff2f553fafa0b16d23cc0ab2da1ada0de68bd316cc5c907e"

RPROVIDES:${PN} += "kubeseal"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
