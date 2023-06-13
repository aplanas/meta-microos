SUMMARY = "Path::Tiny types and coercions for Specio"
DESCRIPTION = "This library provides a set of Path::Tiny types and coercions for Specio. \
These types can be used with Moose, Moo, Params::ValidationCompiler, and \
other modules."
LICENSE = "Apache-2.0"

PV = "0.05"

RPM_NAME = "perl-Specio-Library-Path-Tiny-0.05-1.4.noarch.rpm"
RPM_HASH = "bc2865e98886852b941dc5878dfcc52866319d878452cf54a59d4006bbb4b80b2ead1a0b3d34ff00e1d7f245d4e864fb51eeab56fd0ed865199ba18c65bc64e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Specio::Library::Path::Tiny) \
perl-Specio-Library-Path-Tiny"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Path::Tiny) \
perl(Specio) \
perl(Specio::Declare) \
perl(Specio::Exporter) \
perl(Specio::Library::Builtins) \
perl(Specio::PartialDump) \
perl(parent)"

inherit rpm
