SUMMARY = "Auto provides for system users"
DESCRIPTION = "Generate auto provides for system users."
LICENSE = "MIT"

PV = "3.1"

RPM_NAME = "sysuser-tools-3.1-5.5.noarch.rpm"
RPM_HASH = "2d82e38c64f8e4ffda0417a32c64fdbe74445aa156fc816acf793af62a763ed9e1ff34f94cb5d6eafd950b55d19bd82ba6e2a8d50bb0c22b59be796af8810868"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rpm-macro-sysusers-generate-pre \
rpm-macro-sysusers-requires \
sysuser-tools"

RDEPENDS:${PN} += "/usr/bin/bash \
sysuser-shadow"

inherit rpm
