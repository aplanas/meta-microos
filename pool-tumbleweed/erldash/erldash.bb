SUMMARY = "A simple, terminal-based Erlang dashboard"
DESCRIPTION = "A simple, terminal-based Erlang dashboard. \
erldash connects to an Erlang node using the dynamic node name feature (since OTP-23) to collect metrics."
LICENSE = "MIT"

PV = "0.1.2~0"

RPM_NAME = "erldash-0.1.2~0-1.2.aarch64.rpm"
RPM_HASH = "97038d01502f96086afae7e847786274890cdb849e2d3d75c987634e248a72478151ef8bd833d26ce36dd7f3b045ba600deca88792019770d2467dc6637cc133"

RPROVIDES:${PN} += "bundled(rust-crate:adler32) \
bundled(rust-crate:anyhow) \
bundled(rust-crate:async-channel) \
bundled(rust-crate:async-executor) \
bundled(rust-crate:async-fs) \
bundled(rust-crate:async-io) \
bundled(rust-crate:async-lock) \
bundled(rust-crate:async-net) \
bundled(rust-crate:async-process) \
bundled(rust-crate:async-task) \
bundled(rust-crate:atomic-waker) \
bundled(rust-crate:atty) \
bundled(rust-crate:autocfg) \
bundled(rust-crate:bitflags) \
bundled(rust-crate:blocking) \
bundled(rust-crate:byteorder) \
bundled(rust-crate:cache-padded) \
bundled(rust-crate:cassowary) \
bundled(rust-crate:cfg-if) \
bundled(rust-crate:clap) \
bundled(rust-crate:clap_derive) \
bundled(rust-crate:clap_lex) \
bundled(rust-crate:concurrent-queue) \
bundled(rust-crate:crc32fast) \
bundled(rust-crate:crossterm) \
bundled(rust-crate:dirs) \
bundled(rust-crate:dirs-sys) \
bundled(rust-crate:eetf) \
bundled(rust-crate:erl_dist) \
bundled(rust-crate:erl_rpc) \
bundled(rust-crate:erldash) \
bundled(rust-crate:event-listener) \
bundled(rust-crate:fastrand) \
bundled(rust-crate:futures) \
bundled(rust-crate:futures-channel) \
bundled(rust-crate:futures-core) \
bundled(rust-crate:futures-executor) \
bundled(rust-crate:futures-io) \
bundled(rust-crate:futures-lite) \
bundled(rust-crate:futures-macro) \
bundled(rust-crate:futures-sink) \
bundled(rust-crate:futures-task) \
bundled(rust-crate:futures-util) \
bundled(rust-crate:getrandom) \
bundled(rust-crate:hashbrown) \
bundled(rust-crate:heck) \
bundled(rust-crate:indexmap) \
bundled(rust-crate:itoa) \
bundled(rust-crate:libc) \
bundled(rust-crate:libflate) \
bundled(rust-crate:libflate_lz77) \
bundled(rust-crate:lock_api) \
bundled(rust-crate:log) \
bundled(rust-crate:md5) \
bundled(rust-crate:memchr) \
bundled(rust-crate:mio) \
bundled(rust-crate:num) \
bundled(rust-crate:num-bigint) \
bundled(rust-crate:num-complex) \
bundled(rust-crate:num-integer) \
bundled(rust-crate:num-iter) \
bundled(rust-crate:num-rational) \
bundled(rust-crate:num-traits) \
bundled(rust-crate:num_threads) \
bundled(rust-crate:once_cell) \
bundled(rust-crate:ordered-float) \
bundled(rust-crate:os_str_bytes) \
bundled(rust-crate:parking) \
bundled(rust-crate:parking_lot) \
bundled(rust-crate:parking_lot_core) \
bundled(rust-crate:pin-project-lite) \
bundled(rust-crate:pin-utils) \
bundled(rust-crate:polling) \
bundled(rust-crate:ppv-lite86) \
bundled(rust-crate:proc-macro-error) \
bundled(rust-crate:proc-macro-error-attr) \
bundled(rust-crate:proc-macro2) \
bundled(rust-crate:quote) \
bundled(rust-crate:rand) \
bundled(rust-crate:rand_chacha) \
bundled(rust-crate:rand_core) \
bundled(rust-crate:rle-decode-fast) \
bundled(rust-crate:scopeguard) \
bundled(rust-crate:serde) \
bundled(rust-crate:signal-hook) \
bundled(rust-crate:signal-hook-mio) \
bundled(rust-crate:signal-hook-registry) \
bundled(rust-crate:simplelog) \
bundled(rust-crate:slab) \
bundled(rust-crate:smallvec) \
bundled(rust-crate:smol) \
bundled(rust-crate:socket2) \
bundled(rust-crate:strsim) \
bundled(rust-crate:syn) \
bundled(rust-crate:termcolor) \
bundled(rust-crate:textwrap) \
bundled(rust-crate:thiserror) \
bundled(rust-crate:thiserror-impl) \
bundled(rust-crate:time) \
bundled(rust-crate:time-core) \
bundled(rust-crate:time-macros) \
bundled(rust-crate:tui) \
bundled(rust-crate:unicode-ident) \
bundled(rust-crate:unicode-segmentation) \
bundled(rust-crate:unicode-width) \
bundled(rust-crate:version_check) \
bundled(rust-crate:waker-fn) \
erldash \
erldash(aarch-64)"
RDEPENDS:${PN} += "erlang \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm