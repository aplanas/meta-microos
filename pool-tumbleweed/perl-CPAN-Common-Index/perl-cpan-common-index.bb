SUMMARY = "Common library for searching CPAN modules, authors and distributions"
DESCRIPTION = "This module provides a common library for working with a variety of CPAN \
index services. It is intentionally minimalist, trying to use as few \
non-core modules as possible. \
 \
The 'CPAN::Common::Index' module is an abstract base class that defines a \
common API. Individual backends deliver the API for a particular index. \
 \
As shown in the SYNOPSIS, one interesting application is multiplexing -- \
using different index backends, querying each in turn, and returning the \
first result."
LICENSE = "Apache-2.0"

PV = "0.010"

RPM_NAME = "perl-CPAN-Common-Index-0.010-1.11.noarch.rpm"
RPM_HASH = "b1c4096ef5a7b16bb5d931fdb6bda68bc85419e40f6bdd1a64ca7f1b91a6102f05038250ce39b00306eb9f5e312aca9d5157de7ef8adfe0b98476e1a7b39f909"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-CPAN--Common--Index \
perl-CPAN--Common--Index--LocalPackage \
perl-CPAN--Common--Index--MetaDB \
perl-CPAN--Common--Index--Mirror \
perl-CPAN--Common--Index--Mux--Ordered \
perl-CPAN-Common-Index"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-CPAN--DistnameInfo \
perl-CPAN--Meta--YAML \
perl-Class--Tiny \
perl-File--Fetch \
perl-File--Temp \
perl-HTTP--Tiny \
perl-Module--Load \
perl-Search--Dict \
perl-Tie--Handle--SkipHeader \
perl-URI \
perl-parent"

inherit rpm
