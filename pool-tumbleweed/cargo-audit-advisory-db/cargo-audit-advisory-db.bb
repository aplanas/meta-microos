SUMMARY = "A database of known security issues for Rust depedencies"
DESCRIPTION = "The RustSec Advisory Database is a repository of security advisories filed against Rust crates \
published via https://crates.io. A human-readable version of the advisory database can be \
found at https://rustsec.org/advisories/."
LICENSE = "CC0-1.0"

PV = "20230731"

RPM_NAME = "cargo-audit-advisory-db-20230731-1.1.aarch64.rpm"
RPM_HASH = "7cebfafe7588de81b2f6697fb29bce312cac146a0978fabbe4dc49b4286a5d89c73e8d3396e1921d884f075c8dc8fa494278bb6a1687b7c0ad42d67616b8ca7f"

RPROVIDES:${PN} += "cargo-audit-advisory-db"

RDEPENDS:${PN} += "cargo-audit"

inherit rpm
