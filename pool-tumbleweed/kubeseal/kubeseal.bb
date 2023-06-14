SUMMARY = "CLI for encrypting secrets to SealedSecrets"
DESCRIPTION = "Problem: 'I can manage all my K8s config in git, except Secrets.' \
 \
Solution: Encrypt your Secret into a SealedSecret, which is safe to store - even to a public repository. The SealedSecret can be decrypted only by the controller running in the target cluster and nobody else (not even the original author) is able to obtain the original Secret from the SealedSecret."
LICENSE = "Apache-2.0"

PV = "0.21.0"

RPM_NAME = "kubeseal-0.21.0-1.1.aarch64.rpm"
RPM_HASH = "eec685ce4201cee39078f1f312e7f0ab51d0c637f153402975a1ba1ef60aaed1df306e55ec8b63d1761bad307d1c35b9503f1162b892300fc043fa3b1f3c28f7"

RPROVIDES:${PN} += "kubeseal"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
