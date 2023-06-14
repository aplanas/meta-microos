SUMMARY = "An OBS source service: Audit vendored Rust crates for security issues"
DESCRIPTION = "An OBS Source Service that will audit vendored Rust \
crates (libraries) for security issues"
LICENSE = "MPL-2.0"

PV = "0.1.8~1"

RPM_NAME = "obs-service-cargo_audit-0.1.8~1-2.3.aarch64.rpm"
RPM_HASH = "bb59e187e72db9c596c80694c2314ca610d02c5e4ae3b8af4e18d4478eb1584d77d1a3851e1281100b0db8f1487cef0927041ddfa0145718cac41fd5552c543c"

RPROVIDES:${PN} += "obs-service-cargo-audit"

RDEPENDS:${PN} += "/usr/bin/env \
cargo-audit \
cargo-audit-advisory-db \
python3"

inherit rpm
