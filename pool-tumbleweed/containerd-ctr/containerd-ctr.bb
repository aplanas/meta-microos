SUMMARY = "Client for containerd"
DESCRIPTION = "Standalone client for containerd, which allows management of containerd containers \
separately from Docker."
LICENSE = "Apache-2.0"

PV = "1.6.21"

RPM_NAME = "containerd-ctr-1.6.21-1.2.aarch64.rpm"
RPM_HASH = "81b167402fe177615789f1e933d25c7ae3f3e6c88348dee16060c0cf575f4b0afdcf60f834ead5a657888a47331cfb702b6e3184f58b5f3128ac11707f3d06db"

RPROVIDES:${PN} += "containerd-ctr"

RDEPENDS:${PN} += "containerd \
libc.so.6"

inherit rpm
