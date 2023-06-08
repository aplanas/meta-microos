SUMMARY = "A database of known security issues for Rust depedencies"
DESCRIPTION = "The RustSec Advisory Database is a repository of security advisories filed against Rust crates \
published via https://crates.io. A human-readable version of the advisory database can be \
found at https://rustsec.org/advisories/."
LICENSE = "CC0-1.0"

PV = "20230413"

RPM_NAME = "cargo-audit-advisory-db-20230413-1.1.aarch64.rpm"
RPM_HASH = "a17155de6ea03065b883234563b2afc70234f71a0f505230e33203eef55b315a3f63fa4df8845ce768f6a4b1d1a090d61349aa589803df2ce628e97ca478f87d"

RPROVIDES:${PN} += "cargo-audit-advisory-db cargo-audit-advisory-db(aarch-64)"
RDEPENDS:${PN} += "cargo-audit"

inherit rpm
