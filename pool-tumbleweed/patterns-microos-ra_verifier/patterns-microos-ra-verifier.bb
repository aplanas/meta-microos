SUMMARY = "Remote Attestation (Verifier) Support"
DESCRIPTION = "Packages required to enable remote attestation via Keylime verifier on \
openSUSE MicroOS."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-ra_verifier-5.0-70.1.aarch64.rpm"
RPM_HASH = "22fbc79cc5188abdb97bc76d2b82ab2646bd32513b9f7d3cfe07cfacd80c0223166efdeffea788c23280b576cb558b1a7cf043d2903ffb92f5e27174ce7c760f"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-microos-ra-verifier"

RDEPENDS:${PN} += "keylime-firewalld \
keylime-registrar \
keylime-tenant \
keylime-verifier"

inherit rpm
