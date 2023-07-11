SUMMARY = "Remote Attestation (Agent) Support"
DESCRIPTION = "Packages required to enable remote attestation via the Rust Keylime \
agent on openSUSE MicroOS."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-ra_agent-5.0-72.1.aarch64.rpm"
RPM_HASH = "90ba907f3724feab4b1c6ed53dce6d5fbb61e6fc492ad70644eee53b13343bcf6e0478eea5d1fec5c75c01e13f8acb691e102d3ca053793b209d57cd758ae1a5"

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
