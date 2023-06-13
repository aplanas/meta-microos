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

PV = "2.000024"

RPM_NAME = "perl-local-lib-2.000024-2.9.noarch.rpm"
RPM_HASH = "a50603589b530370ba68832777b0664873bb501c2056dc57b34ba482200bcfa8f86e7ba07b168527fe55ff4c66e5c7b4724744b4b3b80ad40f0cefb321b24dc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(lib::core::only) \
perl(local::lib) \
perl-local-lib"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(CPAN) \
perl(ExtUtils::Install) \
perl(ExtUtils::MakeMaker) \
perl(Module::Build)"

inherit rpm
