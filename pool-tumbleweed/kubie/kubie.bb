SUMMARY = "A Kubernetes context switcher"
DESCRIPTION = "kubie offers context switching, namespace switching and prompt modification in a \
way that makes each shell independent from others. It also has support for \
split configuration files, meaning it can load Kubernetes contexts from \
multiple files. You can configure the paths where kubie will look for \
contexts, see the settings section."
LICENSE = "Zlib"

PV = "0.20.1"

RPM_NAME = "kubie-0.20.1-1.1.aarch64.rpm"
RPM_HASH = "49345cd0147b01c74436dbd104e9666065584950356c7c60f996433cc2ef92c1f8db5f155f93dfdaa468211a8c2d1e78ad97c55244eb31985928d728985793c4"

RPROVIDES:${PN} += "kubie"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
