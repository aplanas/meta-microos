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

RPM_NAME = "perl-Debug-Trace-0.05-3.26.noarch.rpm"
RPM_HASH = "708e7a2aaa3d8f0211dded08e0db1f5e8efc0741a39b5fe4ada55487b24940820c2393fb52f8d791df44ce54fe36c7d5bf3781dbc97c374353d902f08a17a814"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Debug::Trace) \
perl-Debug-Trace"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
