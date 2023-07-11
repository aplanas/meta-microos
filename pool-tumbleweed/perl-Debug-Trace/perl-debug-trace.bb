SUMMARY = "Perl extension to trace subroutine calls"
DESCRIPTION = "Debug::Trace instruments subroutines to provide tracing information upon \
every call and return. \
 \
Using Debug::Trace does not require any changes to your sources. Most \
often, it will be used from the command line: \
 \
  perl -MDebug::Trace=foo,bar yourprogram.pl \
 \
This will have your subroutines foo() and bar() printing call and return \
information. \
 \
Subroutine names may be fully qualified to denote subroutines in other \
packages than the default main::. \
 \
By default, the trace information is output using the standard warn() \
function."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.05"

RPM_NAME = "perl-Debug-Trace-0.05-3.27.noarch.rpm"
RPM_HASH = "acbcb91aef49bce40672c73d7807affb9e14ed25832633bab9d56d7862eade0cfbabd71b90c771291f89541ffdaa1a0e685f3dd2bdb06c3d193d0d0541a9b7e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Debug--Trace \
perl-Debug-Trace"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
