SUMMARY = "CLI for encrypting secrets to SealedSecrets"
DESCRIPTION = "Problem: 'I can manage all my K8s config in git, except Secrets.' \
 \
Solution: Encrypt your Secret into a SealedSecret, which is safe to store - even to a public repository. The SealedSecret can be decrypted only by the controller running in the target cluster and nobody else (not even the original author) is able to obtain the original Secret from the SealedSecret."
LICENSE = "Apache-2.0"

PV = "0.22.0"

RPM_NAME = "kubeseal-0.22.0-1.1.aarch64.rpm"
RPM_HASH = "d277d68be9204448308ac80e262a75be8cb360a2972053f3313221a6b5dafdf17a45015c64fd5589dc8e36e30586eea9707ca1e14bea9ee6336e5fcb330605ed"

RPROVIDES:${PN} += "kubeseal"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
