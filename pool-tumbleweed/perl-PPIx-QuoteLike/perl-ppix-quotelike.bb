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

RPM_NAME = "perl-PPIx-QuoteLike-0.023-1.4.noarch.rpm"
RPM_HASH = "417f15f08a4a65bd730c3f71eba22b248305ebf1b5a065dea7ca059c6d85b831186d579116bb0590ece4c7ae7ecb71b36a64497dbb481c80c5ac1b6a022c4330"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-PPI--Document \
perl-PPI--Dumper \
perl-Readonly"

inherit rpm
