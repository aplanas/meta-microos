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

RPM_NAME = "perl-CPAN-Common-Index-0.010-1.12.noarch.rpm"
RPM_HASH = "7f21443a065de77bf44a60e849b60c7150227e4342f12072c4ce97f32f1c61eca369d590cbd45e565316d17e807a0dbd23233bec10b64a82e8efdd7d3c1c3217"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-CPAN--Common--Index \
perl-CPAN--Common--Index--LocalPackage \
perl-CPAN--Common--Index--MetaDB \
perl-CPAN--Common--Index--Mirror \
perl-CPAN--Common--Index--Mux--Ordered \
perl-CPAN-Common-Index"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
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
