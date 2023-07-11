SUMMARY = "A DIscrepany AnaLYZer for ERlang programs"
DESCRIPTION = "A DIscrepany AnaLYZer for ERlang programs."
LICENSE = "Apache-2.0"

PV = "25.3.2.2"

RPM_NAME = "erlang-dialyzer-25.3.2.2-1.1.aarch64.rpm"
RPM_HASH = "06302c58f16d149de4ef04b844ce43ce3ceeedd9513f130aa362074b56d2c5bb9012c604a41afc3aaf7f143705d20a567d0a06468ff532a34f3d96913b6f3f6a"

RPROVIDES:${PN} += "erlang-dialyzer"

RDEPENDS:${PN} += "erlang \
erlang-wx \
graphviz \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
