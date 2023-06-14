SUMMARY = "Many-body dispersion library -- headers and sources"
DESCRIPTION = "Libmbd implements the many-body dispersion (MBD) method in several programming \
languages and frameworks. This is the reference implementation in Fortran and \
C. \
 \
This package provides the files needed for developing against libmbd."
LICENSE = "MPL-2.0"

PV = "0.12.6"

RPM_NAME = "libmbd-devel-0.12.6-1.3.aarch64.rpm"
RPM_HASH = "d074106586532b1663f490e9d7154f002232ad737c82c738dacfe312940ee596a029624d0e82898147486468c6c0185488ede7ed8e55fe908cd057caf3e8877e"

RPROVIDES:${PN} += "cmake-Mbd \
libmbd-devel"

RDEPENDS:${PN} += "libmbd"

inherit rpm
