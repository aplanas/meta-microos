SUMMARY = "Path::Tiny types and coercions for Specio"
DESCRIPTION = "This library provides a set of Path::Tiny types and coercions for Specio. \
These types can be used with Moose, Moo, Params::ValidationCompiler, and \
other modules."
LICENSE = "Apache-2.0"

PV = "0.05"

RPM_NAME = "perl-Specio-Library-Path-Tiny-0.05-1.6.noarch.rpm"
RPM_HASH = "96ed854cb0a169f4515f252753bfacacbdad1da4463c18f6fe8a73e31a3acb202f26446866e144fea5c57514943f2e9e52aa2afc54514b5a7bcf5365ba2f54f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Specio--Library--Path--Tiny \
perl-Specio-Library-Path-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Path--Tiny \
perl-Specio \
perl-Specio--Declare \
perl-Specio--Exporter \
perl-Specio--Library--Builtins \
perl-Specio--PartialDump \
perl-parent"

inherit rpm
