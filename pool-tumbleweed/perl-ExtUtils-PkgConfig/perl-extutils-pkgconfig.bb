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

RPM_NAME = "perl-ExtUtils-PkgConfig-1.160000-1.25.noarch.rpm"
RPM_HASH = "c49a2923a7ef8bfef44344cc2188a440a887a2444917f434ed1087d76a8a66e4af936fcc1ed7b6b691af09a558f680f53bb5055dd7493ec2b48f9c080f273fc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-ExtUtils--PkgConfig \
perl-ExtUtils-PkgConfig"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
pkgconfig"

inherit rpm
