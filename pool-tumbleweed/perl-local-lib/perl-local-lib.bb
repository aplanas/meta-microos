SUMMARY = "Create and use a local lib/ for perl modules with PERL5LIB"
DESCRIPTION = "This module provides a quick, convenient way of bootstrapping a user-local \
Perl module library located within the user's home directory. It also \
constructs and prints out for the user the list of environment variables \
using the syntax appropriate for the user's current shell (as specified by \
the 'SHELL' environment variable), suitable for directly adding to one's \
shell configuration file. \
 \
More generally, local::lib allows for the bootstrapping and usage of a \
directory containing Perl modules outside of Perl's '@INC'. This makes it \
easier to ship an application with an app-specific copy of a Perl module, \
or collection of modules. Useful in cases like when an upstream maintainer \
hasn't applied a patch to a module of theirs that you need for your \
application. \
 \
On import, local::lib sets the following environment variables to \
appropriate values: \
 \
* PERL_MB_OPT \
 \
* PERL_MM_OPT \
 \
* PERL5LIB \
 \
* PATH \
 \
* PERL_LOCAL_LIB_ROOT \
 \
When possible, these will be appended to instead of overwritten entirely. \
 \
These values are then available for reference by any code after import."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.000029"

RPM_NAME = "perl-local-lib-2.000029-1.1.noarch.rpm"
RPM_HASH = "9a6e6b4b30347224b52c684c750b8ab534d1a5f458ac4fc32d9b0acb5471f1d89ea9e993b1d60f2d2ea498a56d37aaf9ceacce0edaf9a9c63bdae3cef93da781"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-lib--core--only \
perl-local--lib \
perl-local-lib"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-CPAN \
perl-ExtUtils--Install \
perl-ExtUtils--MakeMaker \
perl-Module--Build"

inherit rpm
