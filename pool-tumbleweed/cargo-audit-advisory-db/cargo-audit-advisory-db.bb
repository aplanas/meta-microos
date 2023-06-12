SUMMARY = "A database of known security issues for Rust depedencies"
DESCRIPTION = "The RustSec Advisory Database is a repository of security advisories filed against Rust crates \
published via https://crates.io. A human-readable version of the advisory database can be \
found at https://rustsec.org/advisories/."
LICENSE = "CC0-1.0"

PV = "20230530"

RPM_NAME = "cargo-audit-advisory-db-20230530-1.1.aarch64.rpm"
RPM_HASH = "ceecbd5b71e0c991393fb3519500ead0670a7e10233e2772ee0bde6694ca318a340b09dec3945cc83bf6dd71e25e136c1dfc129b1e6baac37434a557fc682e60"

RPROVIDES:${PN} += "cargo-audit-advisory-db \
cargo-audit-advisory-db(aarch-64)"
RDEPENDS:${PN} += "cargo-audit"

inherit rpm
