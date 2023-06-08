SUMMARY = "Development Part of Curses Development Kit"
DESCRIPTION = "This package includes the development headers and static libraries for \
CDK, the Curses Development Kit."
LICENSE = "BSD-3-Clause"

PV = "5.0.20210324"

RPM_NAME = "cdk-devel-5.0.20210324-2.5.aarch64.rpm"
RPM_HASH = "0690a8c442dfb0fc331717f304ba801172ae129ac6c2e8901916708bcd3d11c048b5fce5216e7ad4f921cad179c74b013f18a9acd0b9c2461231373ae9092f30"

RPROVIDES:${PN} += "cdk-devel cdk-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/bash libcdk6_2_4 ncurses-devel"

inherit rpm
