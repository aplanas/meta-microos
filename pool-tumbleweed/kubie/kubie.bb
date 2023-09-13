SUMMARY = "A Kubernetes context switcher"
DESCRIPTION = "kubie offers context switching, namespace switching and prompt modification in a \
way that makes each shell independent from others. It also has support for \
split configuration files, meaning it can load Kubernetes contexts from \
multiple files. You can configure the paths where kubie will look for \
contexts, see the settings section."
LICENSE = "Zlib"

PV = "0.22.0"

RPM_NAME = "kubie-0.22.0-1.1.aarch64.rpm"
RPM_HASH = "a8574d5e45cc49628b9d44feeae6b4b4a30a49440c24eb65863cac509aaee6eeb2dde5ab53efe6d7a244db6babde8e50949f73e950ca274358dc8f7af69ee093"

RPROVIDES:${PN} += "kubie"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
