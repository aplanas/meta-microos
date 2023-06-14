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

RPM_NAME = "perl-Feature-Compat-Try-0.05-1.4.noarch.rpm"
RPM_HASH = "29f20aa1285edaecf2899307a643745d9cc786b46124de2342e55c234ad2d25a9691815963a1f37482446e6968ee653b7380f4aa8e7902a17f9ee9ef39e6cddc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Feature--Compat--Try \
perl-Feature-Compat-Try"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Syntax--Keyword--Try"

inherit rpm
