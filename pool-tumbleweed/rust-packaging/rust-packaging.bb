SUMMARY = "RPM macros for building Rust packages on various architectures"
DESCRIPTION = "The package provides macros for building projects in Rust \
on various architectures."
LICENSE = "MIT"

PV = "15"

RPM_NAME = "rust-packaging-15-2.20.noarch.rpm"
RPM_HASH = "ef2fd0f3d321c2fbaa9900b629aae0d4c1482150aca0a3d2334a9d3d54a5489bb375fc3c99d0e42145545a3a3c1ad7d77187bedfa10fadea7cca02eae6de4872"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rpm-macro-build-rustflags \
rpm-macro-cargo-build \
rpm-macro-cargo-generate-buildrequires \
rpm-macro-cargo-install \
rpm-macro-cargo-prep \
rpm-macro-cargo-registry \
rpm-macro-cargo-test \
rust-packaging"

RDEPENDS:${PN} += "cargo \
gawk \
python3-rust2rpm \
rust \
rust-srpm-macros"

inherit rpm
