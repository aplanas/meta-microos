SUMMARY = "Source code for containerd"
DESCRIPTION = "This package contains the source code needed for building packages that \
reference the following Go import paths: github.com/containerd/containerd"
LICENSE = "Apache-2.0"

PV = "1.6.21"

RPM_NAME = "containerd-devel-1.6.21-1.1.aarch64.rpm"
RPM_HASH = "452d2d06d7f6c370d3d583658330d58c7f15d85afefa33a5264eb6863a48e99b4c845b4f39bdbe092fe4df0d2d216eac7d66758ded2b9a92c5c26fa837d24f2d"

RPROVIDES:${PN} += "containerd-devel \
containerd-devel(aarch-64)"

RDEPENDS:${PN} += "containerd"

inherit rpm
