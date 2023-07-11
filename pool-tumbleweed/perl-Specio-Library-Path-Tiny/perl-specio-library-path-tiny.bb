SUMMARY = "Path::Tiny types and coercions for Specio"
DESCRIPTION = "This library provides a set of Path::Tiny types and coercions for Specio. \
These types can be used with Moose, Moo, Params::ValidationCompiler, and \
other modules."
LICENSE = "Apache-2.0"

PV = "0.05"

RPM_NAME = "perl-Specio-Library-Path-Tiny-0.05-1.5.noarch.rpm"
RPM_HASH = "a2c189905d0dfc52e20dd621b65908434fc88f24e4eb0e2c4b8f3ead5a008b6ae69350ed6cf8d7bfa632d7841927760a20982fb943ae749de6f79cd7c564f8ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Specio--Library--Path--Tiny \
perl-Specio-Library-Path-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Path--Tiny \
perl-Specio \
perl-Specio--Declare \
perl-Specio--Exporter \
perl-Specio--Library--Builtins \
perl-Specio--PartialDump \
perl-parent"

inherit rpm
