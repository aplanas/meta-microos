SUMMARY = "Threaded multi-target formula parser & interpreter"
DESCRIPTION = "Ixion is a general purpose formula parser & interpreter that can calculate \
multiple named targets, or 'cells'."
LICENSE = "MIT"

PV = "0.17.0"

RPM_NAME = "libixion-devel-0.17.0-3.4.aarch64.rpm"
RPM_HASH = "c9d9afa2124434e1b46cef601c02063bafa40f5f419e7dafd4c65e9ba138252eae0eef7f1152e328fc5e78bc92f1da33d9422056d069b76a2de2c03f97ff51c5"

RPROVIDES:${PN} += "libixion-devel \
pkgconfig-libixion-0.17"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libixion-0-17-0"

inherit rpm
