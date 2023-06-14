SUMMARY = "Icarus Verilog development files"
DESCRIPTION = "This package contains necessary header files for Icarus Verilog"
LICENSE = "GPL-2.0-or-later"

PV = "11.0"

RPM_NAME = "iverilog-devel-11.0-1.11.aarch64.rpm"
RPM_HASH = "b711f81d639b33f4914b67d4581517e4c3a867975885d6321f14b4c7055a64b4b48d694c41cc5b66ef513e672392dc2b151f723e09a01c9a7c3e5d01ee290f9e"

RPROVIDES:${PN} += "iverilog-devel"

RDEPENDS:${PN} += "iverilog"

inherit rpm
