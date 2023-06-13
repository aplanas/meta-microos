SUMMARY = "Development files for the NV-CONTROL X extension library"
DESCRIPTION = "This package contains the development files for the \
NV-CONTROL X extension library"
LICENSE = "MIT"

PV = "510.47.03"

RPM_NAME = "libXNVCtrl-devel-510.47.03-1.3.aarch64.rpm"
RPM_HASH = "95aa61293d906b0dccb3606b1b82f24a5e0f6cf10d79ab4e8b8987b34c050fc3b7797155e06f688a759971bc973e92df76c25bc78388a1c6b6657a27996fc08d"

RPROVIDES:${PN} += "libXNVCtrl-devel \
libXNVCtrl-devel(aarch-64)"

RDEPENDS:${PN} += "libXNVCtrl0"

inherit rpm
