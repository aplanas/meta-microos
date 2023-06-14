SUMMARY = "A Kubernetes context switcher"
DESCRIPTION = "kubie offers context switching, namespace switching and prompt modification in a \
way that makes each shell independent from others. It also has support for \
split configuration files, meaning it can load Kubernetes contexts from \
multiple files. You can configure the paths where kubie will look for \
contexts, see the settings section."
LICENSE = "Zlib"

PV = "0.19.3"

RPM_NAME = "kubie-0.19.3-2.3.aarch64.rpm"
RPM_HASH = "8c09089b5cbbe77065db18fa0ba4afcd370618032926e73888c4b92cf157c9f1d8a6679078a018d76bdbccf1db01b7082f93d8d26b0a76531f3a78cedce77ff8"

RPROVIDES:${PN} += "kubie"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
