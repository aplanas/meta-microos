SUMMARY = "3D racing game with ponies"
DESCRIPTION = "Pink Pony is a Tron­-like multiplayer racing­ game. You control \
little ponies that leave a trail of flowers everywhere they step. \
You have to evade these trails and force other ponies into them. \
The last pony standing wins the game."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.1"

RPM_NAME = "pink-pony-1.4.1-3.2.aarch64.rpm"
RPM_HASH = "b2edbb1f06ada0accfc8762467aaca6722067e434851ba8a627fca2e22532d15b81f2c2526d70c99fe06465b0479873f588c78ce4c06083cacdd7583f1fa7b3a"

RPROVIDES:${PN} += "pink-pony"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libIL.so.1 \
libImath-3-1.so.29 \
libSDL-1.2.so.0 \
libSDL-mixer-1.2.so.0 \
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
libabsl-crc-cord-state.so.2308.0.0 \
libabsl-crc-cpu-detect.so.2308.0.0 \
libabsl-crc-internal.so.2308.0.0 \
libabsl-crc32c.so.2308.0.0 \
libabsl-debugging-internal.so.2308.0.0 \
libabsl-demangle-internal.so.2308.0.0 \
libabsl-die-if-null.so.2308.0.0 \
libabsl-examine-stack.so.2308.0.0 \
libabsl-exponential-biased.so.2308.0.0 \
libabsl-flags-commandlineflag-internal.so.2308.0.0 \
libabsl-flags-commandlineflag.so.2308.0.0 \
libabsl-flags-config.so.2308.0.0 \
libabsl-flags-internal.so.2308.0.0 \
libabsl-flags-marshalling.so.2308.0.0 \
libabsl-flags-private-handle-accessor.so.2308.0.0 \
libabsl-flags-program-name.so.2308.0.0 \
libabsl-flags-reflection.so.2308.0.0 \
libabsl-flags.so.2308.0.0 \
libabsl-graphcycles-internal.so.2308.0.0 \
libabsl-hash.so.2308.0.0 \
libabsl-hashtablez-sampler.so.2308.0.0 \
libabsl-int128.so.2308.0.0 \
libabsl-kernel-timeout-internal.so.2308.0.0 \
libabsl-leak-check.so.2308.0.0 \
libabsl-log-entry.so.2308.0.0 \
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
libabsl-raw-hash-set.so.2308.0.0 \
libabsl-raw-logging-internal.so.2308.0.0 \
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
libc.so.6 \
libftgl.so.2 \
libgcc-s.so.1 \
libglfw.so.2 \
libm.so.6 \
libprotobuf.so.23.4.0 \
libsigc-2.0.so.0 \
libstdc++.so.6 \
pink-pony-data"

inherit rpm
