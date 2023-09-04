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

RPM_NAME = "perl-Debug-Trace-0.05-3.28.noarch.rpm"
RPM_HASH = "291dd877bef3611bb088b97d027c098a0d61ed7962541e70eb38604bfa592df4c7002dda95786d161eea37a4e882dd4b282a0841d29c55d55719ac07929e2c18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Debug--Trace \
perl-Debug-Trace"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
