SUMMARY = "Zig Standard Library"
DESCRIPTION = "zig Standard Library"
LICENSE = "MIT"

PV = "0.10.1"

RPM_NAME = "zig-libs-0.10.1-2.4.noarch.rpm"
RPM_HASH = "87bfbb25fde9fea9fe496a3b494c5f73d4b2e376119700b6f5579f3412d6558ec910aeff1ee9b58ec97cbbe69df9d569d7a1fe2c4e2e5e37f2d0fee3a6b6bda9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zig-libs"

RDEPENDS:${PN} += ""

inherit rpm
