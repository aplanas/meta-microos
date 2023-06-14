SUMMARY = "Fastest and safest AV1 encoder"
DESCRIPTION = "rav1e is an AV1 video encoder. \
 \
AV1 is a video codec by the Alliance for Open Media, composed of most \
of the important Web companies (Google, Facebook, Netflix, Amazon, \
Microsoft, Mozilla...). \
 \
AV1 has the potential to be up to 20% better than the HEVC codec, but \
the patents license is totally free, while HEVC patents licenses are \
insanely high and very confusing. \
 \
rav1e features: \
 \
* Intra and inter frames \
* 64x64 superblocks \
* 4x4 to 64x64 RDO-selected square and 2:1/1:2 rectangular blocks \
* DC, H, V, Paeth, smooth, and a subset of directional prediction modes \
* DCT, (FLIP-)ADST and identity transforms (up to 64x64, 16x16 and 32x32 respectively) \
* 8-, 10- and 12-bit depth color \
* 4:2:0 (full support), 4:2:2 and 4:4:4 (limited) chroma sampling \
* Variable speed settings \
* Near real-time encoding at high speed levels"
LICENSE = "BSD-2-Clause"

PV = "0.6.4+0"

RPM_NAME = "rav1e-0.6.4+0-1.1.aarch64.rpm"
RPM_HASH = "7e17708bc9debd5aa21c84314f146c40048d051b0d1470f0fe2a25137f5b71f2e8a32cf28a047c968ae160678c4ffd50c0829e80cb93f3f8eaf4c669eb86c8e8"

RPROVIDES:${PN} += "bundled-rust-crate-anyhow \
bundled-rust-crate-arg-enum-proc-macro \
bundled-rust-crate-arrayvec \
bundled-rust-crate-autocfg \
bundled-rust-crate-av-metrics \
bundled-rust-crate-av1-grain \
bundled-rust-crate-bitflags \
bundled-rust-crate-bitstream-io \
bundled-rust-crate-built \
bundled-rust-crate-cargo-lock \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-complete \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-console \
bundled-rust-crate-const-fn-assert \
bundled-rust-crate-crossbeam \
bundled-rust-crate-crossbeam-channel \
bundled-rust-crate-crossbeam-deque \
bundled-rust-crate-crossbeam-epoch \
bundled-rust-crate-crossbeam-queue \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-either \
bundled-rust-crate-fern \
bundled-rust-crate-form-urlencoded \
bundled-rust-crate-getrandom \
bundled-rust-crate-heck \
bundled-rust-crate-idna \
bundled-rust-crate-interpolate-name \
bundled-rust-crate-io-lifetimes \
bundled-rust-crate-is-terminal \
bundled-rust-crate-itertools \
bundled-rust-crate-ivf \
bundled-rust-crate-jobserver \
bundled-rust-crate-lab \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-log \
bundled-rust-crate-maybe-rayon \
bundled-rust-crate-memchr \
bundled-rust-crate-memoffset \
bundled-rust-crate-minimal-lexical \
bundled-rust-crate-nasm-rs \
bundled-rust-crate-new-debug-unreachable \
bundled-rust-crate-nom \
bundled-rust-crate-noop-proc-macro \
bundled-rust-crate-num-bigint \
bundled-rust-crate-num-cpus \
bundled-rust-crate-num-derive \
bundled-rust-crate-num-integer \
bundled-rust-crate-num-rational \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-os-str-bytes \
bundled-rust-crate-paste \
bundled-rust-crate-percent-encoding \
bundled-rust-crate-ppv-lite86 \
bundled-rust-crate-proc-macro-error \
bundled-rust-crate-proc-macro-error-attr \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rand \
bundled-rust-crate-rand-chacha \
bundled-rust-crate-rand-core \
bundled-rust-crate-rav1e \
bundled-rust-crate-rayon \
bundled-rust-crate-rayon-core \
bundled-rust-crate-rust-hawktracer \
bundled-rust-crate-rust-hawktracer-normal-macro \
bundled-rust-crate-rust-hawktracer-proc-macro \
bundled-rust-crate-rustc-version \
bundled-rust-crate-rustix \
bundled-rust-crate-scan-fmt \
bundled-rust-crate-scopeguard \
bundled-rust-crate-semver \
bundled-rust-crate-serde \
bundled-rust-crate-serde-derive \
bundled-rust-crate-signal-hook \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-simd-helpers \
bundled-rust-crate-syn \
bundled-rust-crate-termcolor \
bundled-rust-crate-terminal-size \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-tinyvec \
bundled-rust-crate-tinyvec-macros \
bundled-rust-crate-toml \
bundled-rust-crate-unicode-bidi \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-normalization \
bundled-rust-crate-unicode-width \
bundled-rust-crate-url \
bundled-rust-crate-v-frame \
bundled-rust-crate-version-check \
bundled-rust-crate-y4m \
rav1e"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
