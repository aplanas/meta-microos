SUMMARY = "Tiny, yet Moo(se)-compatible type constraint"
DESCRIPTION = "This documents the internals of the Type::Tiny class. Type::Tiny::Manual is \
a better starting place if you're new. \
 \
Type::Tiny is a small class for creating Moose-like type constraint objects \
which are compatible with Moo, Moose and Mouse."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.004000"

RPM_NAME = "perl-Type-Tiny-2.004000-1.2.noarch.rpm"
RPM_HASH = "7a225ab20197e62a56aa5143071249844952d968be4e17483be67d33a8ec7e154b54dd90d10e783ede9fdb42dd335051a514d7e98b0edef42b1d15012f449a08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Devel--TypeTiny--Perl58Compat \
perl-Error--TypeTiny \
perl-Error--TypeTiny--Assertion \
perl-Error--TypeTiny--Compilation \
perl-Error--TypeTiny--WrongNumberOfParameters \
perl-Eval--TypeTiny \
perl-Eval--TypeTiny--CodeAccumulator \
perl-Reply--Plugin--TypeTiny \
perl-Test--TypeTiny \
perl-Type--Coercion \
perl-Type--Coercion--FromMoose \
perl-Type--Coercion--Union \
perl-Type--Library \
perl-Type--Params \
perl-Type--Params--Alternatives \
perl-Type--Params--Parameter \
perl-Type--Params--Signature \
perl-Type--Parser \
perl-Type--Parser--AstBuilder \
perl-Type--Parser--Token \
perl-Type--Parser--TokenStream \
perl-Type--Registry \
perl-Type--Tie \
perl-Type--Tie--ARRAY \
perl-Type--Tie--BASE \
perl-Type--Tie--HASH \
perl-Type--Tie--SCALAR \
perl-Type--Tiny \
perl-Type--Tiny---DeclaredType \
perl-Type--Tiny---HalfOp \
perl-Type--Tiny--Bitfield \
perl-Type--Tiny--Class \
perl-Type--Tiny--ConstrainedObject \
perl-Type--Tiny--Duck \
perl-Type--Tiny--Enum \
perl-Type--Tiny--Intersection \
perl-Type--Tiny--Role \
perl-Type--Tiny--Union \
perl-Type--Utils \
perl-Type-Tiny \
perl-Types--Common \
perl-Types--Common--Numeric \
perl-Types--Common--String \
perl-Types--Standard \
perl-Types--Standard--ArrayRef \
perl-Types--Standard--CycleTuple \
perl-Types--Standard--Dict \
perl-Types--Standard--HashRef \
perl-Types--Standard--Map \
perl-Types--Standard--ScalarRef \
perl-Types--Standard--StrMatch \
perl-Types--Standard--Tied \
perl-Types--Standard--Tuple \
perl-Types--TypeTiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Exporter--Tiny"

inherit rpm
