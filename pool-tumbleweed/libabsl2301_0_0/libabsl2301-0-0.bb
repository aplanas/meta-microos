SUMMARY = "C++11 libraries which augment the C++ stdlib"
DESCRIPTION = "Abseil is a collection of C++11 libraries which augment the C++ \
standard library. It also provides features incorporated into C++14 \
and C++17 standards."
LICENSE = "Apache-2.0"

PV = "20230125.3"

RPM_NAME = "libabsl2301_0_0-20230125.3-2.1.aarch64.rpm"
RPM_HASH = "6463363204baa38a68b2b3c4c44139e6845e54104af00d9ae20ff14e3653443e3ecd37da6565c087f9215dc3d214c46a462092b6ebb38a9fb8687ccccee1c91b"

RPROVIDES:${PN} += "abseil-cpp \
libabsl-bad-any-cast-impl.so.2301.0.0 \
libabsl-bad-optional-access.so.2301.0.0 \
libabsl-bad-variant-access.so.2301.0.0 \
libabsl-base.so.2301.0.0 \
libabsl-city.so.2301.0.0 \
libabsl-civil-time.so.2301.0.0 \
libabsl-cord-internal.so.2301.0.0 \
libabsl-cord.so.2301.0.0 \
libabsl-cordz-functions.so.2301.0.0 \
libabsl-cordz-handle.so.2301.0.0 \
libabsl-cordz-info.so.2301.0.0 \
libabsl-cordz-sample-token.so.2301.0.0 \
libabsl-crc-cord-state.so.2301.0.0 \
libabsl-crc-cpu-detect.so.2301.0.0 \
libabsl-crc-internal.so.2301.0.0 \
libabsl-crc32c.so.2301.0.0 \
libabsl-debugging-internal.so.2301.0.0 \
libabsl-demangle-internal.so.2301.0.0 \
libabsl-die-if-null.so.2301.0.0 \
libabsl-examine-stack.so.2301.0.0 \
libabsl-exponential-biased.so.2301.0.0 \
libabsl-failure-signal-handler.so.2301.0.0 \
libabsl-flags-commandlineflag-internal.so.2301.0.0 \
libabsl-flags-commandlineflag.so.2301.0.0 \
libabsl-flags-config.so.2301.0.0 \
libabsl-flags-internal.so.2301.0.0 \
libabsl-flags-marshalling.so.2301.0.0 \
libabsl-flags-parse.so.2301.0.0 \
libabsl-flags-private-handle-accessor.so.2301.0.0 \
libabsl-flags-program-name.so.2301.0.0 \
libabsl-flags-reflection.so.2301.0.0 \
libabsl-flags-usage-internal.so.2301.0.0 \
libabsl-flags-usage.so.2301.0.0 \
libabsl-flags.so.2301.0.0 \
libabsl-graphcycles-internal.so.2301.0.0 \
libabsl-hash.so.2301.0.0 \
libabsl-hashtablez-sampler.so.2301.0.0 \
libabsl-int128.so.2301.0.0 \
libabsl-leak-check.so.2301.0.0 \
libabsl-log-entry.so.2301.0.0 \
libabsl-log-flags.so.2301.0.0 \
libabsl-log-globals.so.2301.0.0 \
libabsl-log-initialize.so.2301.0.0 \
libabsl-log-internal-check-op.so.2301.0.0 \
libabsl-log-internal-conditions.so.2301.0.0 \
libabsl-log-internal-format.so.2301.0.0 \
libabsl-log-internal-globals.so.2301.0.0 \
libabsl-log-internal-log-sink-set.so.2301.0.0 \
libabsl-log-internal-message.so.2301.0.0 \
libabsl-log-internal-nullguard.so.2301.0.0 \
libabsl-log-internal-proto.so.2301.0.0 \
libabsl-log-severity.so.2301.0.0 \
libabsl-log-sink.so.2301.0.0 \
libabsl-low-level-hash.so.2301.0.0 \
libabsl-malloc-internal.so.2301.0.0 \
libabsl-periodic-sampler.so.2301.0.0 \
libabsl-random-distributions.so.2301.0.0 \
libabsl-random-internal-distribution-test-util.so.2301.0.0 \
libabsl-random-internal-platform.so.2301.0.0 \
libabsl-random-internal-pool-urbg.so.2301.0.0 \
libabsl-random-internal-randen-hwaes-impl.so.2301.0.0 \
libabsl-random-internal-randen-hwaes.so.2301.0.0 \
libabsl-random-internal-randen-slow.so.2301.0.0 \
libabsl-random-internal-randen.so.2301.0.0 \
libabsl-random-internal-seed-material.so.2301.0.0 \
libabsl-random-seed-gen-exception.so.2301.0.0 \
libabsl-random-seed-sequences.so.2301.0.0 \
libabsl-raw-hash-set.so.2301.0.0 \
libabsl-raw-logging-internal.so.2301.0.0 \
libabsl-scoped-set-env.so.2301.0.0 \
libabsl-spinlock-wait.so.2301.0.0 \
libabsl-stacktrace.so.2301.0.0 \
libabsl-status.so.2301.0.0 \
libabsl-statusor.so.2301.0.0 \
libabsl-str-format-internal.so.2301.0.0 \
libabsl-strerror.so.2301.0.0 \
libabsl-strings-internal.so.2301.0.0 \
libabsl-strings.so.2301.0.0 \
libabsl-symbolize.so.2301.0.0 \
libabsl-synchronization.so.2301.0.0 \
libabsl-throw-delegate.so.2301.0.0 \
libabsl-time-zone.so.2301.0.0 \
libabsl-time.so.2301.0.0 \
libabsl2301-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
