SUMMARY = "Systemd unit generator for zram swap devices"
DESCRIPTION = "This is a systemd unit generator that enables swap on zram. \
(With zram, there is no physical swap device. Part of the avaialable RAM \
is used to store compressed pages, essentially trading CPU cycles for memory.) \
 \
To configure and activate swap and zram devices with file-systems,  create a configuration file in /etc/systemd/zram-generator.conf. You can consult  /usr/share/doc/zram-generator/zram-generator.conf.example for an example and a list of available settings."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "zram-generator-1.1.2-2.4.aarch64.rpm"
RPM_HASH = "d9fd7399d45734babac8a8bcb54a322d7f3be4c91aca24473e5721a4e0ec4e7e9af58f9b641da95fedff6845a198e0e1912d21883518b191d52ae2de58856ff4"

RPROVIDES:${PN} += "bundled-rust-crate-ahash \
bundled-rust-crate-anyhow \
bundled-rust-crate-bitflags \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-dlv-list \
bundled-rust-crate-fasteval \
bundled-rust-crate-getrandom \
bundled-rust-crate-hashbrown \
bundled-rust-crate-libc \
bundled-rust-crate-liboverdrop \
bundled-rust-crate-log \
bundled-rust-crate-ordered-multimap \
bundled-rust-crate-ppv-lite86 \
bundled-rust-crate-rand \
bundled-rust-crate-rand-chacha \
bundled-rust-crate-rand-core \
bundled-rust-crate-rust-ini \
bundled-rust-crate-textwrap \
bundled-rust-crate-unicode-width \
bundled-rust-crate-zram-generator \
zram-generator"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
