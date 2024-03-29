SUMMARY = "Work with nestable Pod elements"
DESCRIPTION = "Pod::Elemental is a system for treating a Pod (plain old \
documentation|perlpod) documents as trees of elements. This model may be \
familiar from many other document systems, especially the HTML DOM. \
Pod::Elemental's document object model is much less sophisticated than the \
HTML DOM, but still makes a lot of document transformations easy. \
 \
In general, you'll want to read in a Pod document and then perform a number \
of prepackaged transformations on it. The most common of these will be the \
Pod5 transformation|Pod::Elemental::Transformer::Pod5, which assumes that \
the basic meaning of Pod commands described in the Perl 5 documentation \
hold: '=begin', '=end', and '=for' commands mark regions of the document, \
leading whitespace marks a verbatim paragraph, and so on. The Pod5 \
transformer also eliminates the need to track elements representing \
vertical whitespace."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.103006"

RPM_NAME = "perl-Pod-Elemental-0.103006-1.4.noarch.rpm"
RPM_HASH = "1e38ac36937ee30d3f99400b847f44e78e00900f8a8deb89a75eb5c1fce1eb26a2f6057b79bf5d0b73a581b9602d0047bb97e13dac4776a4abd04385b08d7a91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Pod--Elemental \
perl-Pod--Elemental--Autoblank \
perl-Pod--Elemental--Autochomp \
perl-Pod--Elemental--Command \
perl-Pod--Elemental--Document \
perl-Pod--Elemental--Element--Generic--Blank \
perl-Pod--Elemental--Element--Generic--Command \
perl-Pod--Elemental--Element--Generic--Nonpod \
perl-Pod--Elemental--Element--Generic--Text \
perl-Pod--Elemental--Element--Nested \
perl-Pod--Elemental--Element--Pod5--Command \
perl-Pod--Elemental--Element--Pod5--Data \
perl-Pod--Elemental--Element--Pod5--Nonpod \
perl-Pod--Elemental--Element--Pod5--Ordinary \
perl-Pod--Elemental--Element--Pod5--Region \
perl-Pod--Elemental--Element--Pod5--Verbatim \
perl-Pod--Elemental--Flat \
perl-Pod--Elemental--Node \
perl-Pod--Elemental--Objectifier \
perl-Pod--Elemental--Paragraph \
perl-Pod--Elemental--Selectors \
perl-Pod--Elemental--Transformer \
perl-Pod--Elemental--Transformer--Gatherer \
perl-Pod--Elemental--Transformer--Nester \
perl-Pod--Elemental--Transformer--Pod5 \
perl-Pod--Elemental--Types \
perl-Pod-Elemental"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Class--Load \
perl-List--Util \
perl-Mixin--Linewise--Readers \
perl-Moose \
perl-Moose--Role \
perl-MooseX--Types \
perl-MooseX--Types--Moose \
perl-Pod--Eventual--Simple \
perl-String--RewritePrefix \
perl-String--Truncate \
perl-Sub--Exporter \
perl-Sub--Exporter--ForMethods \
perl-namespace--autoclean"

inherit rpm
