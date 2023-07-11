SUMMARY = "An OBS source service: Audit vendored Rust crates for security issues"
DESCRIPTION = "An OBS Source Service that will audit vendored Rust \
crates (libraries) for security issues"
LICENSE = "MPL-2.0"

PV = "0.1.8~6"

RPM_NAME = "obs-service-cargo_audit-0.1.8~6-1.1.aarch64.rpm"
RPM_HASH = "4cd6183d9a77bd7cd6bf859bb55479fb4fb534d02fbc45aa5808168133b7e25910d4842b1f39b314f85b9412c51604c33b762a0612259768aac91234e50830ed"

RPROVIDES:${PN} += "obs-service-cargo-audit"

RDEPENDS:${PN} += "/usr/bin/env \
cargo-audit \
cargo-audit-advisory-db \
python3"

inherit rpm
