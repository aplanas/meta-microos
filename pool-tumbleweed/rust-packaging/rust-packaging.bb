SUMMARY = "RPM macros for building Rust packages on various architectures"
DESCRIPTION = "The package provides macros for building projects in Rust \
on various architectures."
LICENSE = "MIT"

PV = "15"

RPM_NAME = "rust-packaging-15-2.16.noarch.rpm"
RPM_HASH = "956473e0b73fc40dd3f6651e63b9b1d534252e9c21d7db88e7728e218f5fbdec1b6b83cf0b6fad9d2e9426e885a4c176d85f65c8d2be984b4195f6296ccf5135"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rpm_macro(build_rustflags) \
rpm_macro(cargo_build) \
rpm_macro(cargo_generate_buildrequires) \
rpm_macro(cargo_install) \
rpm_macro(cargo_prep) \
rpm_macro(cargo_registry) \
rpm_macro(cargo_test) \
rust-packaging"
RDEPENDS:${PN} += "cargo \
gawk \
python3-rust2rpm \
rust \
rust-srpm-macros"

inherit rpm
