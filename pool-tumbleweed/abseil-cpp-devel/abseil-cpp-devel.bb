SUMMARY = "Header files for Abseil"
DESCRIPTION = "Abseil is a collection of C++11 libraries which augment the C++ \
standard library. \
This package contains headers and build system files for it."
LICENSE = "Apache-2.0"

PV = "20230125.3"

RPM_NAME = "abseil-cpp-devel-20230125.3-2.1.aarch64.rpm"
RPM_HASH = "462c34c9429d772b5738962e2d8c8cea87de36736438aa913a6c032f5645f44d5f2d1f871e22a77b75bf4b44d5f2eaf02209344635453b0da651d192dc30e6c4"

RPROVIDES:${PN} += "abseil-cpp-devel \
cmake-absl \
pkgconfig-absl-absl-check \
pkgconfig-absl-absl-log \
pkgconfig-absl-algorithm \
pkgconfig-absl-algorithm-container \
pkgconfig-absl-any \
pkgconfig-absl-any-invocable \
pkgconfig-absl-atomic-hook \
pkgconfig-absl-bad-any-cast \
pkgconfig-absl-bad-any-cast-impl \
pkgconfig-absl-bad-optional-access \
pkgconfig-absl-bad-variant-access \
pkgconfig-absl-base \
pkgconfig-absl-base-internal \
pkgconfig-absl-bind-front \
pkgconfig-absl-bits \
pkgconfig-absl-btree \
pkgconfig-absl-check \
pkgconfig-absl-city \
pkgconfig-absl-civil-time \
pkgconfig-absl-cleanup \
pkgconfig-absl-cleanup-internal \
pkgconfig-absl-common-policy-traits \
pkgconfig-absl-compare \
pkgconfig-absl-compressed-tuple \
pkgconfig-absl-config \
pkgconfig-absl-container-common \
pkgconfig-absl-container-memory \
pkgconfig-absl-cord \
pkgconfig-absl-cord-internal \
pkgconfig-absl-cordz-functions \
pkgconfig-absl-cordz-handle \
pkgconfig-absl-cordz-info \
pkgconfig-absl-cordz-sample-token \
pkgconfig-absl-cordz-statistics \
pkgconfig-absl-cordz-update-scope \
pkgconfig-absl-cordz-update-tracker \
pkgconfig-absl-core-headers \
pkgconfig-absl-counting-allocator \
pkgconfig-absl-crc-cord-state \
pkgconfig-absl-crc-cpu-detect \
pkgconfig-absl-crc-internal \
pkgconfig-absl-crc32c \
pkgconfig-absl-debugging \
pkgconfig-absl-debugging-internal \
pkgconfig-absl-demangle-internal \
pkgconfig-absl-die-if-null \
pkgconfig-absl-dynamic-annotations \
pkgconfig-absl-endian \
pkgconfig-absl-errno-saver \
pkgconfig-absl-examine-stack \
pkgconfig-absl-exponential-biased \
pkgconfig-absl-failure-signal-handler \
pkgconfig-absl-fast-type-id \
pkgconfig-absl-fixed-array \
pkgconfig-absl-flags \
pkgconfig-absl-flags-commandlineflag \
pkgconfig-absl-flags-commandlineflag-internal \
pkgconfig-absl-flags-config \
pkgconfig-absl-flags-internal \
pkgconfig-absl-flags-marshalling \
pkgconfig-absl-flags-parse \
pkgconfig-absl-flags-path-util \
pkgconfig-absl-flags-private-handle-accessor \
pkgconfig-absl-flags-program-name \
pkgconfig-absl-flags-reflection \
pkgconfig-absl-flags-usage \
pkgconfig-absl-flags-usage-internal \
pkgconfig-absl-flat-hash-map \
pkgconfig-absl-flat-hash-set \
pkgconfig-absl-function-ref \
pkgconfig-absl-graphcycles-internal \
pkgconfig-absl-hash \
pkgconfig-absl-hash-function-defaults \
pkgconfig-absl-hash-policy-traits \
pkgconfig-absl-hashtable-debug \
pkgconfig-absl-hashtable-debug-hooks \
pkgconfig-absl-hashtablez-sampler \
pkgconfig-absl-inlined-vector \
pkgconfig-absl-inlined-vector-internal \
pkgconfig-absl-int128 \
pkgconfig-absl-kernel-timeout-internal \
pkgconfig-absl-layout \
pkgconfig-absl-leak-check \
pkgconfig-absl-log \
pkgconfig-absl-log-entry \
pkgconfig-absl-log-flags \
pkgconfig-absl-log-globals \
pkgconfig-absl-log-initialize \
pkgconfig-absl-log-internal-append-truncated \
pkgconfig-absl-log-internal-check-impl \
pkgconfig-absl-log-internal-check-op \
pkgconfig-absl-log-internal-conditions \
pkgconfig-absl-log-internal-config \
pkgconfig-absl-log-internal-flags \
pkgconfig-absl-log-internal-format \
pkgconfig-absl-log-internal-globals \
pkgconfig-absl-log-internal-log-impl \
pkgconfig-absl-log-internal-log-sink-set \
pkgconfig-absl-log-internal-message \
pkgconfig-absl-log-internal-nullguard \
pkgconfig-absl-log-internal-nullstream \
pkgconfig-absl-log-internal-proto \
pkgconfig-absl-log-internal-strip \
pkgconfig-absl-log-internal-structured \
pkgconfig-absl-log-internal-voidify \
pkgconfig-absl-log-severity \
pkgconfig-absl-log-sink \
pkgconfig-absl-log-sink-registry \
pkgconfig-absl-log-streamer \
pkgconfig-absl-log-structured \
pkgconfig-absl-low-level-hash \
pkgconfig-absl-malloc-internal \
pkgconfig-absl-memory \
pkgconfig-absl-meta \
pkgconfig-absl-node-hash-map \
pkgconfig-absl-node-hash-set \
pkgconfig-absl-node-slot-policy \
pkgconfig-absl-non-temporal-arm-intrinsics \
pkgconfig-absl-non-temporal-memcpy \
pkgconfig-absl-numeric \
pkgconfig-absl-numeric-representation \
pkgconfig-absl-optional \
pkgconfig-absl-periodic-sampler \
pkgconfig-absl-prefetch \
pkgconfig-absl-pretty-function \
pkgconfig-absl-random-bit-gen-ref \
pkgconfig-absl-random-distributions \
pkgconfig-absl-random-internal-distribution-caller \
pkgconfig-absl-random-internal-distribution-test-util \
pkgconfig-absl-random-internal-fast-uniform-bits \
pkgconfig-absl-random-internal-fastmath \
pkgconfig-absl-random-internal-generate-real \
pkgconfig-absl-random-internal-iostream-state-saver \
pkgconfig-absl-random-internal-mock-helpers \
pkgconfig-absl-random-internal-nonsecure-base \
pkgconfig-absl-random-internal-pcg-engine \
pkgconfig-absl-random-internal-platform \
pkgconfig-absl-random-internal-pool-urbg \
pkgconfig-absl-random-internal-randen \
pkgconfig-absl-random-internal-randen-engine \
pkgconfig-absl-random-internal-randen-hwaes \
pkgconfig-absl-random-internal-randen-hwaes-impl \
pkgconfig-absl-random-internal-randen-slow \
pkgconfig-absl-random-internal-salted-seed-seq \
pkgconfig-absl-random-internal-seed-material \
pkgconfig-absl-random-internal-traits \
pkgconfig-absl-random-internal-uniform-helper \
pkgconfig-absl-random-internal-wide-multiply \
pkgconfig-absl-random-random \
pkgconfig-absl-random-seed-gen-exception \
pkgconfig-absl-random-seed-sequences \
pkgconfig-absl-raw-hash-map \
pkgconfig-absl-raw-hash-set \
pkgconfig-absl-raw-logging-internal \
pkgconfig-absl-sample-recorder \
pkgconfig-absl-scoped-set-env \
pkgconfig-absl-span \
pkgconfig-absl-spinlock-wait \
pkgconfig-absl-stacktrace \
pkgconfig-absl-status \
pkgconfig-absl-statusor \
pkgconfig-absl-str-format \
pkgconfig-absl-str-format-internal \
pkgconfig-absl-strerror \
pkgconfig-absl-strings \
pkgconfig-absl-strings-internal \
pkgconfig-absl-symbolize \
pkgconfig-absl-synchronization \
pkgconfig-absl-throw-delegate \
pkgconfig-absl-time \
pkgconfig-absl-time-zone \
pkgconfig-absl-type-traits \
pkgconfig-absl-utility \
pkgconfig-absl-variant"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libabsl2301-0-0"

inherit rpm
