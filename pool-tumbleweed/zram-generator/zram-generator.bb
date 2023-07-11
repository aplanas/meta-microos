SUMMARY = "Systemd unit generator for zram swap devices"
DESCRIPTION = "This is a systemd unit generator that enables swap on zram. \
(With zram, there is no physical swap device. Part of the avaialable RAM \
is used to store compressed pages, essentially trading CPU cycles for memory.) \
 \
To configure and activate swap and zram devices with file-systems,  create a configuration file in /etc/systemd/zram-generator.conf. You can consult  /usr/share/doc/zram-generator/zram-generator.conf.example for an example and a list of available settings."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "zram-generator-1.1.2-2.5.aarch64.rpm"
RPM_HASH = "cf7ae6f5bc72811e96d3089424f51726d0af89cdfda5c02f7d1d523ae40bc0ba0bb736e8f16933b77898615afe74b9b723acadbed6b20678c47ea62c1fbcc22e"

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
