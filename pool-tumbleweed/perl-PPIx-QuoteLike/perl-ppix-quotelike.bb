SUMMARY = "Parse Perl string literals and string-literal-like things"
DESCRIPTION = "This Perl class parses Perl string literals and things that are reasonably \
like string literals. Its real reason for being is to find interpolated \
variables for Perl::Critic policies and similar code. \
 \
The parse is fairly straightforward, and a little poking around with \
_eg/pqldump_ should show how it normally goes. \
 \
But there is at least one quote-like thing that probably needs some \
explanation."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.023"

RPM_NAME = "perl-PPIx-QuoteLike-0.023-1.3.noarch.rpm"
RPM_HASH = "6d019202b39f2a79701fa4523b3bd29a2cb3304d1bec61f49ac909990e37c8fee0a2c5f44c4647b64c847ba47fd78b697dfa509e6113a0f85209637c9c3a671c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-PPIx--QuoteLike \
perl-PPIx--QuoteLike--Constant \
perl-PPIx--QuoteLike--Dumper \
perl-PPIx--QuoteLike--Token \
perl-PPIx--QuoteLike--Token--Control \
perl-PPIx--QuoteLike--Token--Delimiter \
perl-PPIx--QuoteLike--Token--Interpolation \
perl-PPIx--QuoteLike--Token--String \
perl-PPIx--QuoteLike--Token--Structure \
perl-PPIx--QuoteLike--Token--Unknown \
perl-PPIx--QuoteLike--Token--Whitespace \
perl-PPIx--QuoteLike--Utils \
perl-PPIx-QuoteLike"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-PPI--Document \
perl-PPI--Dumper \
perl-Readonly"

inherit rpm
