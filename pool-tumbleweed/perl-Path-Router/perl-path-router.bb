SUMMARY = "Tool for Routing Paths"
DESCRIPTION = "This module provides a way of deconstructing paths into parameters suitable \
for dispatching on. It also provides the inverse in that it will take a \
list of parameters, and construct an appropriate uri for it."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.15"

RPM_NAME = "perl-Path-Router-0.15-1.23.noarch.rpm"
RPM_HASH = "d68eb130f94bcf54a2e73e3372326c619445c16253934f4d920c969a2737cf7d19df2e83e8be15092428206a2a93458d975a4d9fa6dc274e57485f278d7f46f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Path::Router) \
perl(Path::Router::Route) \
perl(Path::Router::Route::Match) \
perl(Path::Router::Shell) \
perl(Path::Router::Types) \
perl(Test::Path::Router) \
perl-Path-Router"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Carp) \
perl(Clone::PP) \
perl(Data::Dumper) \
perl(Eval::Closure) \
perl(File::Spec::Unix) \
perl(Moo) \
perl(Sub::Exporter) \
perl(Term::ReadLine) \
perl(Test::Builder) \
perl(Test::Deep) \
perl(Try::Tiny) \
perl(Type::Tiny) \
perl(Types::Standard) \
perl(constant) \
perl(namespace::clean)"

inherit rpm
