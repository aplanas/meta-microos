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

RPM_NAME = "perl-Feature-Compat-Try-0.05-1.6.noarch.rpm"
RPM_HASH = "4e1552cbc7f3ebaf452c6606f809d5b73f25c7b6fdf9139b80d3a538c496fa6fe5c4925b2d3315b6c582526f596091ceb6e3364206e7caeb7a26b8d75e72908c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Feature--Compat--Try \
perl-Feature-Compat-Try"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Syntax--Keyword--Try"

inherit rpm
