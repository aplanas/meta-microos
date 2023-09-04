SUMMARY = "A Kubernetes context switcher"
DESCRIPTION = "kubie offers context switching, namespace switching and prompt modification in a \
way that makes each shell independent from others. It also has support for \
split configuration files, meaning it can load Kubernetes contexts from \
multiple files. You can configure the paths where kubie will look for \
contexts, see the settings section."
LICENSE = "Zlib"

PV = "0.21.2"

RPM_NAME = "kubie-0.21.2-1.1.aarch64.rpm"
RPM_HASH = "4bf7641116eaaa230d760e8291f4854b5a68d1f422a36fa8911d27bce1b12d80df5cac675403df38480db2ebbdfa17cab05dce749e26247dd551f20e3431ec43"

RPROVIDES:${PN} += "kubie"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
