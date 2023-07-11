SUMMARY = "Minimal and flexible login manager daemon"
DESCRIPTION = "greetd is a login manager daemon. greetd on its own does not have any user interface, \
but instead offloads that to greeters, which are arbitrary applications that implement the greetd IPC protocol."
LICENSE = "GPL-3.0-only"

PV = "0.9.0"

RPM_NAME = "greetd-0.9.0-1.3.aarch64.rpm"
RPM_HASH = "c9ba14fe6d2931a2bee899c5333aabad29b8454ef14704072ee70839fd1c1a59a2a857c222b3b7e9a1141c1f25492ccb7570c129e0012374cb97ee3e5e787ef2"

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

RDEPENDS:${PN} += "/usr/bin/getent \
/usr/bin/sh \
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
