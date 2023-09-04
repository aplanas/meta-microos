SUMMARY = "A database of known security issues for Rust depedencies"
DESCRIPTION = "The RustSec Advisory Database is a repository of security advisories filed against Rust crates \
published via https://crates.io. A human-readable version of the advisory database can be \
found at https://rustsec.org/advisories/."
LICENSE = "CC0-1.0"

PV = "20230818"

RPM_NAME = "cargo-audit-advisory-db-20230818-1.1.aarch64.rpm"
RPM_HASH = "cd1882539f7e20c04800626107c5e8ba8e24b3f53aeac56b406bb0080bb4991762e86aef7c533b1b04b93e2b4646e05448c862fb6c6f570fc04b98596fc06530"

RPROVIDES:${PN} += "cargo-audit-advisory-db"

RDEPENDS:${PN} += "cargo-audit"

inherit rpm
