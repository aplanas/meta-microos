SUMMARY = "Simplistic Interface to Pkg-Config"
DESCRIPTION = "The pkg-config program retrieves information about installed libraries, \
usually for the purposes of compiling against and linking to them. \
 \
ExtUtils::PkgConfig is a very simplistic interface to this utility, \
intended for use in the Makefile.PL of perl extensions which bind libraries \
that pkg-config knows. It is really just boilerplate code that you would've \
written yourself."
LICENSE = "LGPL-2.1+"

PV = "1.160000"

RPM_NAME = "perl-ExtUtils-PkgConfig-1.160000-1.24.noarch.rpm"
RPM_HASH = "d2a4d9f5703694dffff52d8e5dbf1e09ac1bbdc141dd8fcc512272bd7a7d6b3bf263de626481e2378976f671f100bba7be3e61dfe076a9a4a09b0f3f99035873"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-ExtUtils--PkgConfig \
perl-ExtUtils-PkgConfig"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
pkgconfig"

inherit rpm
