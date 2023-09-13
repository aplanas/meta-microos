SUMMARY = "A tool for generating C bindings from Rust code"
DESCRIPTION = "A tool for generating C bindings from Rust code."
LICENSE = "MPL-2.0"

PV = "0.25.0+git0"

RPM_NAME = "rust-cbindgen-0.25.0+git0-1.1.aarch64.rpm"
RPM_HASH = "9915c7bbfcef418293f1aa20e8f511b17fecb80d89dbca2bb83d29ae8d54b929b3a969cc4bdec0d52cdb0363316fb0a24435174f8f852dc65f7911e4e615bca6"

RPROVIDES:${PN} += "rust-cbindgen"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
