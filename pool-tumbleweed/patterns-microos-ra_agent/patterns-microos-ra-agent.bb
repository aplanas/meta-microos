SUMMARY = "Remote Attestation (Agent) Support"
DESCRIPTION = "Packages required to enable remote attestation via the Rust Keylime \
agent on openSUSE MicroOS."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-ra_agent-5.0-73.1.aarch64.rpm"
RPM_HASH = "6c34ee858739520e664eac9cd37120bb99f8d25d2e8f7bca0021e5ebacb84223f927da02d6da9356ae4bfef64bda5dbe370113ee9d5d335f4c78be1440d417cc"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-microos-ra-agent"

RDEPENDS:${PN} += "dmidecode \
pattern- \
rust-keylime"

inherit rpm
