SUMMARY = "Moose minus the antlers"
DESCRIPTION = "Moose is a postmodern object system for Perl5. Moose is wonderful. \
 \
Unfortunately, Moose has a compile-time penalty. Though significant \
progress has been made over the years, the compile time penalty is a \
non-starter for some very specific applications. If you are writing a \
command-line application or CGI script where startup time is essential, you \
may not be able to use Moose (we recommend that you instead use persistent \
Perl executing environments like 'FastCGI' for the latter, if possible). \
 \
Mouse is a Moose compatible object system, which aims to alleviate this \
penalty by providing a subset of Moose's functionality. \
 \
We're also going as light on dependencies as possible. Mouse currently has \
*no dependencies* except for building/testing modules. Mouse also works \
without XS, although it has an XS backend to make it much faster."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.5.10"

RPM_NAME = "perl-Mouse-2.5.10-1.19.aarch64.rpm"
RPM_HASH = "9003ac9cbb1d721346cf3c21d8b3ec76c8d341208e57781d6c63716f7d54aa5b0e70a6a9b0e9e2a19910fdbadbcfd0b40a93ac69fbd2c589014cdb78edd0fa58"

RPROVIDES:${PN} += "perl-Mouse \
perl-Mouse--Exporter \
perl-Mouse--Meta--Attribute \
perl-Mouse--Meta--Class \
perl-Mouse--Meta--Method \
perl-Mouse--Meta--Method--Accessor \
perl-Mouse--Meta--Method--Constructor \
perl-Mouse--Meta--Method--Delegation \
perl-Mouse--Meta--Method--Destructor \
perl-Mouse--Meta--Module \
perl-Mouse--Meta--Role \
perl-Mouse--Meta--Role--Application \
perl-Mouse--Meta--Role--Application--RoleSummation \
perl-Mouse--Meta--Role--Composite \
perl-Mouse--Meta--Role--Method \
perl-Mouse--Meta--TypeConstraint \
perl-Mouse--Object \
perl-Mouse--PurePerl \
perl-Mouse--Role \
perl-Mouse--Spec \
perl-Mouse--Tiny \
perl-Mouse--TypeRegistry \
perl-Mouse--Util \
perl-Mouse--Util--MetaRole \
perl-Mouse--Util--TypeConstraints \
perl-Squirrel \
perl-Squirrel--Role \
perl-Test--Mouse \
perl-ouse"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
