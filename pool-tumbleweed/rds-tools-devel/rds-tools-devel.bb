SUMMARY = "Development files for Reliable Datagram Sockets"
DESCRIPTION = "This package provides the header needed to use the RDS socket API."
LICENSE = "BSD-3-Clause | GPL-2.0"

PV = "2.0.7"

RPM_NAME = "rds-tools-devel-2.0.7-2.24.aarch64.rpm"
RPM_HASH = "db6a38065986368e8d449ab1f2e4361c189556112d507097aa6a079b3f06b65cab2f69f8761e9f4d2fed55af1e02f240eebcab7bf2f27167b5650dd53fc1d306"

RPROVIDES:${PN} += "rds-tools-devel"

RDEPENDS:${PN} += ""

inherit rpm
