SUMMARY = "Parses ISO8601 formats"
DESCRIPTION = "Parses almost all ISO8601 date and time formats. ISO8601 time-intervals \
will be supported in a later release."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.16"

RPM_NAME = "perl-DateTime-Format-ISO8601-0.16-1.10.noarch.rpm"
RPM_HASH = "58fde6e1145498a0b3910ec1323551eb2bd1004ee0f310ea61e3b711d525fd1c22fd820deb4c693a8122785ac518069b17e34f07ee477bcf17594938fbb1ddff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(DateTime::Format::ISO8601) \
perl(DateTime::Format::ISO8601::Types) \
perl-DateTime-Format-ISO8601"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(DateTime) \
perl(DateTime::Format::Builder) \
perl(Params::ValidationCompiler) \
perl(Specio) \
perl(Specio::Declare) \
perl(Specio::Exporter) \
perl(Specio::Library::Builtins) \
perl(namespace::autoclean) \
perl(parent)"

inherit rpm
