SUMMARY = "C++11 libraries which augment the C++ stdlib"
DESCRIPTION = "Abseil is a collection of C++11 libraries which augment the C++ \
standard library. It also provides features incorporated into C++14 \
and C++17 standards."
LICENSE = "Apache-2.0"

PV = "20230802.0"

RPM_NAME = "libabsl2308_0_0-20230802.0-1.1.aarch64.rpm"
RPM_HASH = "6e44f7ebbcfbee9ebcb1257902433a3abbebcbbf1e36f2735bd0cfa98a7e59bea3e56a38aec0721ce8d317fb27c00fbc543c31555a156c38cdf7fcaabf03eaff"

RPROVIDES:${PN} += "abseil-cpp \
libabsl-bad-any-cast-impl.so.2308.0.0 \
libabsl-bad-optional-access.so.2308.0.0 \
libabsl-bad-variant-access.so.2308.0.0 \
libabsl-base.so.2308.0.0 \
libabsl-city.so.2308.0.0 \
libabsl-civil-time.so.2308.0.0 \
libabsl-cord-internal.so.2308.0.0 \
libabsl-cord.so.2308.0.0 \
libabsl-cordz-functions.so.2308.0.0 \
libabsl-cordz-handle.so.2308.0.0 \
libabsl-cordz-info.so.2308.0.0 \
libabsl-cordz-sample-token.so.2308.0.0 \
libabsl-crc-cord-state.so.2308.0.0 \
libabsl-crc-cpu-detect.so.2308.0.0 \
libabsl-crc-internal.so.2308.0.0 \
libabsl-crc32c.so.2308.0.0 \
libabsl-debugging-internal.so.2308.0.0 \
libabsl-demangle-internal.so.2308.0.0 \
libabsl-die-if-null.so.2308.0.0 \
libabsl-examine-stack.so.2308.0.0 \
libabsl-exponential-biased.so.2308.0.0 \
libabsl-failure-signal-handler.so.2308.0.0 \
libabsl-flags-commandlineflag-internal.so.2308.0.0 \
libabsl-flags-commandlineflag.so.2308.0.0 \
libabsl-flags-config.so.2308.0.0 \
libabsl-flags-internal.so.2308.0.0 \
libabsl-flags-marshalling.so.2308.0.0 \
libabsl-flags-parse.so.2308.0.0 \
libabsl-flags-private-handle-accessor.so.2308.0.0 \
libabsl-flags-program-name.so.2308.0.0 \
libabsl-flags-reflection.so.2308.0.0 \
libabsl-flags-usage-internal.so.2308.0.0 \
libabsl-flags-usage.so.2308.0.0 \
libabsl-flags.so.2308.0.0 \
libabsl-graphcycles-internal.so.2308.0.0 \
libabsl-hash.so.2308.0.0 \
libabsl-hashtablez-sampler.so.2308.0.0 \
libabsl-int128.so.2308.0.0 \
libabsl-kernel-timeout-internal.so.2308.0.0 \
libabsl-leak-check.so.2308.0.0 \
libabsl-log-entry.so.2308.0.0 \
libabsl-log-flags.so.2308.0.0 \
libabsl-log-globals.so.2308.0.0 \
libabsl-log-initialize.so.2308.0.0 \
libabsl-log-internal-check-op.so.2308.0.0 \
libabsl-log-internal-conditions.so.2308.0.0 \
libabsl-log-internal-format.so.2308.0.0 \
libabsl-log-internal-globals.so.2308.0.0 \
libabsl-log-internal-log-sink-set.so.2308.0.0 \
libabsl-log-internal-message.so.2308.0.0 \
libabsl-log-internal-nullguard.so.2308.0.0 \
libabsl-log-internal-proto.so.2308.0.0 \
libabsl-log-severity.so.2308.0.0 \
libabsl-log-sink.so.2308.0.0 \
libabsl-low-level-hash.so.2308.0.0 \
libabsl-malloc-internal.so.2308.0.0 \
libabsl-periodic-sampler.so.2308.0.0 \
libabsl-random-distributions.so.2308.0.0 \
libabsl-random-internal-distribution-test-util.so.2308.0.0 \
libabsl-random-internal-platform.so.2308.0.0 \
libabsl-random-internal-pool-urbg.so.2308.0.0 \
libabsl-random-internal-randen-hwaes-impl.so.2308.0.0 \
libabsl-random-internal-randen-hwaes.so.2308.0.0 \
libabsl-random-internal-randen-slow.so.2308.0.0 \
libabsl-random-internal-randen.so.2308.0.0 \
libabsl-random-internal-seed-material.so.2308.0.0 \
libabsl-random-seed-gen-exception.so.2308.0.0 \
libabsl-random-seed-sequences.so.2308.0.0 \
libabsl-raw-hash-set.so.2308.0.0 \
libabsl-raw-logging-internal.so.2308.0.0 \
libabsl-scoped-set-env.so.2308.0.0 \
libabsl-spinlock-wait.so.2308.0.0 \
libabsl-stacktrace.so.2308.0.0 \
libabsl-status.so.2308.0.0 \
libabsl-statusor.so.2308.0.0 \
libabsl-str-format-internal.so.2308.0.0 \
libabsl-strerror.so.2308.0.0 \
libabsl-string-view.so.2308.0.0 \
libabsl-strings-internal.so.2308.0.0 \
libabsl-strings.so.2308.0.0 \
libabsl-symbolize.so.2308.0.0 \
libabsl-synchronization.so.2308.0.0 \
libabsl-throw-delegate.so.2308.0.0 \
libabsl-time-zone.so.2308.0.0 \
libabsl-time.so.2308.0.0 \
libabsl2308-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
