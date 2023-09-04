SUMMARY = "Remote Attestation (Verifier) Support"
DESCRIPTION = "Packages required to enable remote attestation via Keylime verifier on \
openSUSE MicroOS."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-ra_verifier-5.0-73.1.aarch64.rpm"
RPM_HASH = "b6136df202ddcc3777ac1f57bef88afd144ff5bca77c31e57e1339b3f33f8f650a9ea133d6c71c3bf766c08c473856eed3b931096f938c507dd641bbce1b9af7"

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
