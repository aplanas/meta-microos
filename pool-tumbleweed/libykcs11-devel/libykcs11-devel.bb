SUMMARY = "Development files for the Yubikey NEO PKCS#11 applet library"
DESCRIPTION = "This package contains the header file needed to develop applications that use \
Yubikey NEO PKCS#11 applet library."
LICENSE = "BSD-2-Clause"

PV = "2.3.1"

RPM_NAME = "libykcs11-devel-2.3.1-1.2.aarch64.rpm"
RPM_HASH = "1b13f9a96b09bd6bf165ee02c5f00961aca839ee8d5fe8975b88bac2a056aff84ee006dda630fc5d0296c81e4e89366adeca96d59db8a20be189163758e31d8a"

RPROVIDES:${PN} += "libykcs11-devel \
pkgconfig-ykcs11"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libykcs11-2"

inherit rpm
