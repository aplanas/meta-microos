SUMMARY = "A database of known security issues for Rust depedencies"
DESCRIPTION = "The RustSec Advisory Database is a repository of security advisories filed against Rust crates \
published via https://crates.io. A human-readable version of the advisory database can be \
found at https://rustsec.org/advisories/."
LICENSE = "CC0-1.0"

PV = "20230711"

RPM_NAME = "cargo-audit-advisory-db-20230711-1.1.aarch64.rpm"
RPM_HASH = "d393f163fcb764d49c6c31db00873e8254ca034028d4eca4cfe7e149e1b14d5944b3c4b8224a87979be5e51a2dc636d427279fde8b180e6c2c01ced181d22114"

RPROVIDES:${PN} += "cargo-audit-advisory-db"

RDEPENDS:${PN} += "cargo-audit"

inherit rpm
