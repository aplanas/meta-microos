SUMMARY = "Tiny, yet Moo(se)-compatible type constraint"
DESCRIPTION = "This documents the internals of the Type::Tiny class. Type::Tiny::Manual is \
a better starting place if you're new. \
 \
Type::Tiny is a small class for creating Moose-like type constraint objects \
which are compatible with Moo, Moose and Mouse."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.004000"

RPM_NAME = "perl-Type-Tiny-2.004000-1.3.noarch.rpm"
RPM_HASH = "e0ed41c7f5bed324ebbc2a578509f21c06084d826d861d15db48fe468d7421e3f4190f05ce581b84d1fdb326fb6a2d4a64ba36d322622c7069b4e9a4d93daf39"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Exporter--Tiny"

inherit rpm
