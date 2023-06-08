SUMMARY = "This tool computes (dis)similarity between two (or more) PNG images"
DESCRIPTION = "This tool computes (dis)similarity between two PNG images using \
(my approximation of) algorithms approximating human vision."
LICENSE = "AGPL-3.0-only"

PV = "3.2.3"

RPM_NAME = "dssim-3.2.3-1.1.aarch64.rpm"
RPM_HASH = "03963408f5717d7fb200bdd6b7c52b0213e44975400b06498c40af00d517caf4202ccbcaca8250772636a2be68c7de7b8a51512ad5a859d998a45d08c98a1271"

RPROVIDES:${PN} += "bundled(rust-crate:adler) bundled(rust-crate:ahash) bundled(rust-crate:arrayvec) bundled(rust-crate:autocfg) bundled(rust-crate:bytemuck) bundled(rust-crate:cc) bundled(rust-crate:cfg-if) bundled(rust-crate:crc32fast) bundled(rust-crate:crossbeam-channel) bundled(rust-crate:crossbeam-deque) bundled(rust-crate:crossbeam-epoch) bundled(rust-crate:crossbeam-utils) bundled(rust-crate:dssim) bundled(rust-crate:dssim-core) bundled(rust-crate:dunce) bundled(rust-crate:either) bundled(rust-crate:fallible_collections) bundled(rust-crate:flate2) bundled(rust-crate:foreign-types) bundled(rust-crate:foreign-types-macros) bundled(rust-crate:foreign-types-shared) bundled(rust-crate:getopts) bundled(rust-crate:getrandom) bundled(rust-crate:hashbrown) bundled(rust-crate:imgref) bundled(rust-crate:itertools) bundled(rust-crate:jobserver) bundled(rust-crate:lcms2) bundled(rust-crate:lcms2-sys) bundled(rust-crate:libc) bundled(rust-crate:load_image) bundled(rust-crate:lodepng) bundled(rust-crate:memoffset) bundled(rust-crate:miniz_oxide) bundled(rust-crate:mozjpeg) bundled(rust-crate:mozjpeg-sys) bundled(rust-crate:nasm-rs) bundled(rust-crate:num) bundled(rust-crate:num-bigint) bundled(rust-crate:num-complex) bundled(rust-crate:num-integer) bundled(rust-crate:num-iter) bundled(rust-crate:num-rational) bundled(rust-crate:num-traits) bundled(rust-crate:num_cpus) bundled(rust-crate:once_cell) bundled(rust-crate:pkg-config) bundled(rust-crate:proc-macro2) bundled(rust-crate:quote) bundled(rust-crate:rayon) bundled(rust-crate:rayon-core) bundled(rust-crate:rexif) bundled(rust-crate:rgb) bundled(rust-crate:scopeguard) bundled(rust-crate:syn) bundled(rust-crate:unicode-ident) bundled(rust-crate:unicode-width) bundled(rust-crate:version_check) dssim dssim(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
