SUMMARY = "Fish Completion for river"
DESCRIPTION = "Fish command-line completion support for river."
LICENSE = "GPL-3.0-only"

PV = "0.2.4+g953"

RPM_NAME = "river-fish-completion-0.2.4+g953-1.1.noarch.rpm"
RPM_HASH = "78f3afe4d8e80dcd1146c18693a312c5460bd2ae0d56b3c9344cb029916febffef27af3802f070016256216a653ccd23bc9abdd8c7f78c03dce9ee601670673b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "river-fish-completion"

RDEPENDS:${PN} += "fish"

inherit rpm
