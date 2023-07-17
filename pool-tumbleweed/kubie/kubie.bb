SUMMARY = "A Kubernetes context switcher"
DESCRIPTION = "kubie offers context switching, namespace switching and prompt modification in a \
way that makes each shell independent from others. It also has support for \
split configuration files, meaning it can load Kubernetes contexts from \
multiple files. You can configure the paths where kubie will look for \
contexts, see the settings section."
LICENSE = "Zlib"

PV = "0.20.0"

RPM_NAME = "kubie-0.20.0-1.1.aarch64.rpm"
RPM_HASH = "4e6a99770a2d5b0d452e99365696b176755b66957e86bde18d16b4a997f426cce9c59e3585b4619537434bc81c16004e4af5806a3341e2912ad0802d7e3eac64"

RPROVIDES:${PN} += "kubie"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
