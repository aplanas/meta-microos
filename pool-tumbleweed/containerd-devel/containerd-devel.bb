SUMMARY = "Source code for containerd"
DESCRIPTION = "This package contains the source code needed for building packages that \
reference the following Go import paths: github.com/containerd/containerd"
LICENSE = "Apache-2.0"

PV = "1.6.21"

RPM_NAME = "containerd-devel-1.6.21-1.2.aarch64.rpm"
RPM_HASH = "55cfd09ec4509b757117c2074d49b266164b792da4fcd59161d5c402c7283847d1b24008dbffb5a79a22a1d8d193a30a06eb17080dd802be27c708127167d23f"

RPROVIDES:${PN} += "containerd-devel"

RDEPENDS:${PN} += "containerd"

inherit rpm
