SUMMARY = "A module that synthesises uid/gid's from bare uid's for container compatibility"
DESCRIPTION = "NSS Synth is a module that synthesises uids/gids into real groups. This means that when you have a \
container with bare uids/gids, these are able to resolve to a concrete user name and group name so \
that calls like getpwnam() function correctly."
LICENSE = "MPL-2.0"

PV = "0.1.0~git2.ed6985d"

RPM_NAME = "nss_synth-0.1.0~git2.ed6985d-2.2.aarch64.rpm"
RPM_HASH = "3a5792e99ccfb5e9da7612d1fc67a84fc043e60c7a9aec6d0f85f2cec50482e3918d6b0126c2124980aa69e5e67be6fd397e49a1eba7d0cdfac51a132a605c7a"

RPROVIDES:${PN} += "bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-libnss \
bundled-rust-crate-nss-synth \
bundled-rust-crate-paste \
bundled-rust-crate-paste-impl \
bundled-rust-crate-proc-macro-hack \
libnss-synth.so.2 \
nss-synth"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
