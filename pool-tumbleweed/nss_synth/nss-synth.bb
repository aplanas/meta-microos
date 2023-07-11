SUMMARY = "A module that synthesises uid/gid's from bare uid's for container compatibility"
DESCRIPTION = "NSS Synth is a module that synthesises uids/gids into real groups. This means that when you have a \
container with bare uids/gids, these are able to resolve to a concrete user name and group name so \
that calls like getpwnam() function correctly."
LICENSE = "MPL-2.0"

PV = "0.1.0~git2.ed6985d"

RPM_NAME = "nss_synth-0.1.0~git2.ed6985d-2.3.aarch64.rpm"
RPM_HASH = "4f765f80c4e47c49f6eb8e90728a0edbd34d949947e2710a9eb3465e9c11ea6e702d5bd8e53ab7652c09533cde96a78e276745b4f0fe8da936e9ca94b4c1697c"

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
