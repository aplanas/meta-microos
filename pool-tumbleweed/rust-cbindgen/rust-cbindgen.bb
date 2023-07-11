SUMMARY = "A tool for generating C bindings from Rust code"
DESCRIPTION = "A tool for generating C bindings from Rust code."
LICENSE = "MPL-2.0"

PV = "0.24.3+git0"

RPM_NAME = "rust-cbindgen-0.24.3+git0-1.5.aarch64.rpm"
RPM_HASH = "a66668097f7d8fe5d542c425c85b901343b7b32190da5468122f5aa85dee134ab770328eba9111410d1679c117f9631bd63ab4e01738abbb9a251c640986e461"

RPROVIDES:${PN} += "rust-cbindgen"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
