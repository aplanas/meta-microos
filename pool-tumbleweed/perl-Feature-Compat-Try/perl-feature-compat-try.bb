SUMMARY = "Make try/catch syntax available"
DESCRIPTION = "This module makes syntax support for 'try/catch' control flow easily \
available. \
 \
Perl added such syntax at version 5.34.0, and extended it to support \
optional 'finally' blocks at 5.35.9, which is enabled by \
 \
   use feature 'try'; \
 \
On that version of perl or later, this module simply enables the core \
feature equivalent to using it directly. On such perls, this module will \
install with no non-core dependencies, and requires no C compiler. \
 \
On older versions of perl before such syntax is available, it is currently \
provided instead using the Syntax::Keyword::Try module, imported with a \
special set of options to configure it to recognise exactly and only the \
same syntax as the core perl feature, thus ensuring that any code using it \
will still continue to function on that newer perl."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.05"

RPM_NAME = "perl-Feature-Compat-Try-0.05-1.5.noarch.rpm"
RPM_HASH = "2f0650cb7b3c31c917315d6a0b2f220340def69267c9c3dd94e45601fb9a59384e283fa2e2ac1f90a3dbe8e2f7d5e0a09b56adfb9b7d46bf8d4fd4e8defcfd47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Feature--Compat--Try \
perl-Feature-Compat-Try"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Syntax--Keyword--Try"

inherit rpm
