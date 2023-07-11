SUMMARY = "Remote Attestation (Verifier) Support"
DESCRIPTION = "Packages required to enable remote attestation via Keylime verifier on \
openSUSE MicroOS."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-ra_verifier-5.0-72.1.aarch64.rpm"
RPM_HASH = "0d47c658f1aa90cac8bd63c722d7d120dc06a09ab66a88d63a9bfa3971447a7afed783873094ae396b6d3561a4eb3e95771ce69af7c62d4992320d10b80afa4c"

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
