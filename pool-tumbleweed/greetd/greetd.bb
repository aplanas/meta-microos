SUMMARY = "Minimal and flexible login manager daemon"
DESCRIPTION = "greetd is a login manager daemon. greetd on its own does not have any user interface, \
but instead offloads that to greeters, which are arbitrary applications that implement the greetd IPC protocol."
LICENSE = "GPL-3.0-only"

PV = "0.9.0"

RPM_NAME = "greetd-0.9.0-1.2.aarch64.rpm"
RPM_HASH = "fb10be6f53d6ba684a15214e4a4cbc03f687789d3d9e69fc66b53bf3c59e9daec6b3ebdda78c170f7f22c55b4e42036eefedd598e60221e785064197835d529f"

RPROVIDES:${PN} += "bundled-rust-crate-agreety \
bundled-rust-crate-async-trait \
bundled-rust-crate-autocfg \
bundled-rust-crate-bitflags \
bundled-rust-crate-bytes \
bundled-rust-crate-cfg-if \
bundled-rust-crate-enquote \
bundled-rust-crate-getopts \
bundled-rust-crate-greetd \
bundled-rust-crate-greetd-ipc \
bundled-rust-crate-inish \
bundled-rust-crate-itoa \
bundled-rust-crate-libc \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-memoffset \
bundled-rust-crate-mio \
bundled-rust-crate-nix \
bundled-rust-crate-pam-sys \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-pin-utils \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rpassword \
bundled-rust-crate-ryu \
bundled-rust-crate-serde \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-socket2 \
bundled-rust-crate-static-assertions \
bundled-rust-crate-syn \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-tokio \
bundled-rust-crate-tokio-macros \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-width \
bundled-rust-crate-users \
config-greetd \
greetd"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/getent \
/usr/sbin/groupadd \
/usr/sbin/useradd \
diffutils \
group-video \
libc.so.6 \
libgcc-s.so.1 \
libpam-misc.so.0 \
libpam.so.0 \
pam"

inherit rpm
