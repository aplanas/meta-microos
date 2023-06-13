SUMMARY = "CLI search and replace batch file editing tool"
DESCRIPTION = "Basically sad is a Batch File Edit tool. \
It will show you a really nice diff of proposed changes before you commit them. \
Unlike sed, you can double check before you fat finger your edit."
LICENSE = "(0BSD | Apache-2.0 | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | ISC | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT | Zlib) & MIT & (Artistic-2.0 | CC0-1.0) & BSD-2-Clause & BSD-3-Clause & BSL-1.0 & CC0-1.0 & ISC & MIT & (MIT | Unlicense) & MPL-2.0 & MPL-2.0+ & Zlib & zlib-acknowledgement & Apache-2.0"

PV = "0.4.22"

RPM_NAME = "sad-0.4.22-1.6.aarch64.rpm"
RPM_HASH = "defb01b5e3954378d272a1f0922ae425c0b82af650bfc8dbc9d259ca533a5a5dfd4ecb4c4d4185bc59f856510326ba86825e12b491982624645e8ff216329575"

RPROVIDES:${PN} += "bundled(rust-crate:aho-corasick) \
bundled(rust-crate:ansi_term) \
bundled(rust-crate:async-channel) \
bundled(rust-crate:atty) \
bundled(rust-crate:autocfg) \
bundled(rust-crate:bitflags) \
bundled(rust-crate:bytes) \
bundled(rust-crate:cache-padded) \
bundled(rust-crate:cfg-if) \
bundled(rust-crate:clap) \
bundled(rust-crate:clap_derive) \
bundled(rust-crate:clap_lex) \
bundled(rust-crate:concurrent-queue) \
bundled(rust-crate:difflib) \
bundled(rust-crate:either) \
bundled(rust-crate:event-listener) \
bundled(rust-crate:futures) \
bundled(rust-crate:futures-channel) \
bundled(rust-crate:futures-core) \
bundled(rust-crate:futures-executor) \
bundled(rust-crate:futures-io) \
bundled(rust-crate:futures-macro) \
bundled(rust-crate:futures-sink) \
bundled(rust-crate:futures-task) \
bundled(rust-crate:futures-util) \
bundled(rust-crate:getrandom) \
bundled(rust-crate:hashbrown) \
bundled(rust-crate:heck) \
bundled(rust-crate:indexmap) \
bundled(rust-crate:libc) \
bundled(rust-crate:lock_api) \
bundled(rust-crate:log) \
bundled(rust-crate:memchr) \
bundled(rust-crate:mio) \
bundled(rust-crate:num_cpus) \
bundled(rust-crate:once_cell) \
bundled(rust-crate:os_str_bytes) \
bundled(rust-crate:parking_lot) \
bundled(rust-crate:parking_lot_core) \
bundled(rust-crate:pin-project-lite) \
bundled(rust-crate:pin-utils) \
bundled(rust-crate:proc-macro-error) \
bundled(rust-crate:proc-macro-error-attr) \
bundled(rust-crate:proc-macro2) \
bundled(rust-crate:quote) \
bundled(rust-crate:regex) \
bundled(rust-crate:regex-syntax) \
bundled(rust-crate:sad) \
bundled(rust-crate:scopeguard) \
bundled(rust-crate:shlex) \
bundled(rust-crate:signal-hook-registry) \
bundled(rust-crate:slab) \
bundled(rust-crate:smallvec) \
bundled(rust-crate:socket2) \
bundled(rust-crate:strsim) \
bundled(rust-crate:syn) \
bundled(rust-crate:termcolor) \
bundled(rust-crate:terminal_size) \
bundled(rust-crate:textwrap) \
bundled(rust-crate:tokio) \
bundled(rust-crate:tokio-macros) \
bundled(rust-crate:unicode-ident) \
bundled(rust-crate:uuid) \
bundled(rust-crate:version_check) \
bundled(rust-crate:which) \
sad \
sad(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit)"

inherit rpm
