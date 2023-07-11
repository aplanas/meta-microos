SUMMARY = "Community-inspired Perl::Critic policies"
DESCRIPTION = "A set of Perl::Critic policies to enforce the practices generally \
recommended by subsets of the Perl community, particularly on IRC. Formerly \
known as Perl::Critic::Freenode. Because this policy 'theme' is designed to \
be used with zero configuration on the command line, some duplication will \
occur if it is used in combination with core Perl::Critic policies."
LICENSE = "Artistic-2.0"

PV = "1.0.3"

RPM_NAME = "perl-Perl-Critic-Community-1.0.3-1.4.noarch.rpm"
RPM_HASH = "a8748cec57db931decea57d22e5e575841cdd7a58ffbc20208d3e310ea6edfc6c81ce287a36695f93479572b20ebe8a396e4e4c30c9bb25bfbb613c1aadbafb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Perl--Critic--Community \
perl-Perl--Critic--Community--Utils \
perl-Perl--Critic--Freenode \
perl-Perl--Critic--Freenode--Utils \
perl-Perl--Critic--Policy--Community--AmpersandSubCalls \
perl-Perl--Critic--Policy--Community--ArrayAssignAref \
perl-Perl--Critic--Policy--Community--BarewordFilehandles \
perl-Perl--Critic--Policy--Community--ConditionalDeclarations \
perl-Perl--Critic--Policy--Community--ConditionalImplicitReturn \
perl-Perl--Critic--Policy--Community--DeprecatedFeatures \
perl-Perl--Critic--Policy--Community--DiscouragedModules \
perl-Perl--Critic--Policy--Community--DollarAB \
perl-Perl--Critic--Policy--Community--Each \
perl-Perl--Critic--Policy--Community--EmptyReturn \
perl-Perl--Critic--Policy--Community--IndirectObjectNotation \
perl-Perl--Critic--Policy--Community--LexicalForeachIterator \
perl-Perl--Critic--Policy--Community--LoopOnHash \
perl-Perl--Critic--Policy--Community--ModPerl \
perl-Perl--Critic--Policy--Community--MultidimensionalArrayEmulation \
perl-Perl--Critic--Policy--Community--OpenArgs \
perl-Perl--Critic--Policy--Community--OverloadOptions \
perl-Perl--Critic--Policy--Community--POSIXImports \
perl-Perl--Critic--Policy--Community--PackageMatchesFilename \
perl-Perl--Critic--Policy--Community--PreferredAlternatives \
perl-Perl--Critic--Policy--Community--Prototypes \
perl-Perl--Critic--Policy--Community--StrictWarnings \
perl-Perl--Critic--Policy--Community--Threads \
perl-Perl--Critic--Policy--Community--Wantarray \
perl-Perl--Critic--Policy--Community--WarningsSwitch \
perl-Perl--Critic--Policy--Community--WhileDiamondDefaultAssignment \
perl-Perl--Critic--Policy--Freenode--AmpersandSubCalls \
perl-Perl--Critic--Policy--Freenode--ArrayAssignAref \
perl-Perl--Critic--Policy--Freenode--BarewordFilehandles \
perl-Perl--Critic--Policy--Freenode--ConditionalDeclarations \
perl-Perl--Critic--Policy--Freenode--ConditionalImplicitReturn \
perl-Perl--Critic--Policy--Freenode--DeprecatedFeatures \
perl-Perl--Critic--Policy--Freenode--DiscouragedModules \
perl-Perl--Critic--Policy--Freenode--DollarAB \
perl-Perl--Critic--Policy--Freenode--Each \
perl-Perl--Critic--Policy--Freenode--EmptyReturn \
perl-Perl--Critic--Policy--Freenode--IndirectObjectNotation \
perl-Perl--Critic--Policy--Freenode--LexicalForeachIterator \
perl-Perl--Critic--Policy--Freenode--LoopOnHash \
perl-Perl--Critic--Policy--Freenode--ModPerl \
perl-Perl--Critic--Policy--Freenode--MultidimensionalArrayEmulation \
perl-Perl--Critic--Policy--Freenode--OpenArgs \
perl-Perl--Critic--Policy--Freenode--OverloadOptions \
perl-Perl--Critic--Policy--Freenode--POSIXImports \
perl-Perl--Critic--Policy--Freenode--PackageMatchesFilename \
perl-Perl--Critic--Policy--Freenode--PreferredAlternatives \
perl-Perl--Critic--Policy--Freenode--Prototypes \
perl-Perl--Critic--Policy--Freenode--StrictWarnings \
perl-Perl--Critic--Policy--Freenode--Threads \
perl-Perl--Critic--Policy--Freenode--Wantarray \
perl-Perl--Critic--Policy--Freenode--WarningsSwitch \
perl-Perl--Critic--Policy--Freenode--WhileDiamondDefaultAssignment \
perl-Perl-Critic-Community"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-List--Util \
perl-PPI \
perl-Path--Tiny \
perl-Perl--Critic \
perl-Perl--Critic--Policy--Objects--ProhibitIndirectSyntax \
perl-Perl--Critic--Policy--Subroutines--ProhibitAmpersandSigils \
perl-Perl--Critic--Policy--ValuesAndExpressions--ProhibitArrayAssignAref \
perl-Perl--Critic--Policy--Variables--ProhibitConditionalDeclarations \
perl-Perl--Critic--Policy--Variables--ProhibitLoopOnHash \
perl-Perl--Critic--Policy--Variables--RequireLexicalLoopIterators \
perl-parent \
perl-version"

inherit rpm
