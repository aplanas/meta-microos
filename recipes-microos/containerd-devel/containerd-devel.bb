SUMMARY = "Source code for containerd"
DESCRIPTION = "This package contains the source code needed for building packages that \
reference the following Go import paths: github.com/containerd/containerd"
LICENSE = "Apache-2.0"

PV = "1.6.20"

RPM_NAME = "containerd-devel-1.6.20-1.1.aarch64.rpm"
RPM_HASH = "e64633a1aca1391e41a9b2b9c6a38a13f5ca51b4868df65810433743922389bbf72b3d284f9399dd460b904046df884c8195214b28fb737e5ae874a7ee2bd610"

RPROVIDES:${PN} += "containerd-devel containerd-devel(aarch-64)"
RDEPENDS:${PN} += "containerd"

inherit rpm
