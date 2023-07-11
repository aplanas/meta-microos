SUMMARY = "A Kubernetes context switcher"
DESCRIPTION = "kubie offers context switching, namespace switching and prompt modification in a \
way that makes each shell independent from others. It also has support for \
split configuration files, meaning it can load Kubernetes contexts from \
multiple files. You can configure the paths where kubie will look for \
contexts, see the settings section."
LICENSE = "Zlib"

PV = "0.19.3"

RPM_NAME = "kubie-0.19.3-2.4.aarch64.rpm"
RPM_HASH = "a5ab7b0f7d0b76ba8b360ff0167867095a9f10ba6861ffe13879fe78cbb234e57ba5cf63836591d10c2ad10c34fc87e39b89c00b701b0855084473098b6309fa"

RPROVIDES:${PN} += "kubie"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
