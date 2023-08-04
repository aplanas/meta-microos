SUMMARY = "A Kubernetes context switcher"
DESCRIPTION = "kubie offers context switching, namespace switching and prompt modification in a \
way that makes each shell independent from others. It also has support for \
split configuration files, meaning it can load Kubernetes contexts from \
multiple files. You can configure the paths where kubie will look for \
contexts, see the settings section."
LICENSE = "Zlib"

PV = "0.21.0"

RPM_NAME = "kubie-0.21.0-1.1.aarch64.rpm"
RPM_HASH = "0879524c4c0af55acee75476b0dc7e054ff66d1e2ad6a0b301924ed23ff534dcc20199912929341b18e32848bad282c29378aaa32f196c6cd6adbd22497c8ea5"

RPROVIDES:${PN} += "kubie"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
