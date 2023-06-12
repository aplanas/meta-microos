SUMMARY = "Some add-on perlcritic policies"
DESCRIPTION = "This is a collection of add-on policies for 'Perl::Critic'. They're under a \
'pulp' theme plus other themes according to their purpose (see \
Perl::Critic/POLICY THEMES)."
LICENSE = "GPL-3.0-or-later"

PV = "99"

RPM_NAME = "perl-Perl-Critic-Pulp-99-1.10.aarch64.rpm"
RPM_HASH = "8a4849b1e1592cc18215d31b8abfe0e2fe015c4ecfeae0ef83e529f666c4027f11c8f6df9fbeae86ac315a8ae8f8b518c077d73fda1de9ea0086f39cfe9805b4"

RPROVIDES:${PN} += "perl(Perl::Critic::PodParser::ProhibitVerbatimMarkup) \
perl(Perl::Critic::Policy::CodeLayout::ProhibitFatCommaNewline) \
perl(Perl::Critic::Policy::CodeLayout::ProhibitIfIfSameLine) \
perl(Perl::Critic::Policy::CodeLayout::RequireFinalSemicolon) \
perl(Perl::Critic::Policy::CodeLayout::RequireTrailingCommaAtNewline) \
perl(Perl::Critic::Policy::Compatibility::ConstantLeadingUnderscore) \
perl(Perl::Critic::Policy::Compatibility::ConstantPragmaHash) \
perl(Perl::Critic::Policy::Compatibility::Gtk2Constants) \
perl(Perl::Critic::Policy::Compatibility::PerlMinimumVersionAndWhy) \
perl(Perl::Critic::Policy::Compatibility::PodMinimumVersion) \
perl(Perl::Critic::Policy::Compatibility::ProhibitUnixDevNull) \
perl(Perl::Critic::Policy::Documentation::ProhibitAdjacentLinks) \
perl(Perl::Critic::Policy::Documentation::ProhibitAdjacentLinks::Parser) \
perl(Perl::Critic::Policy::Documentation::ProhibitBadAproposMarkup) \
perl(Perl::Critic::Policy::Documentation::ProhibitDuplicateHeadings) \
perl(Perl::Critic::Policy::Documentation::ProhibitDuplicateSeeAlso) \
perl(Perl::Critic::Policy::Documentation::ProhibitLinkToSelf) \
perl(Perl::Critic::Policy::Documentation::ProhibitParagraphEndComma) \
perl(Perl::Critic::Policy::Documentation::ProhibitParagraphTwoDots) \
perl(Perl::Critic::Policy::Documentation::ProhibitUnbalancedParens) \
perl(Perl::Critic::Policy::Documentation::ProhibitVerbatimMarkup) \
perl(Perl::Critic::Policy::Documentation::RequireEndBeforeLastPod) \
perl(Perl::Critic::Policy::Documentation::RequireFilenameMarkup) \
perl(Perl::Critic::Policy::Documentation::RequireFinalCut) \
perl(Perl::Critic::Policy::Documentation::RequireLinkedURLs) \
perl(Perl::Critic::Policy::Miscellanea::TextDomainPlaceholders) \
perl(Perl::Critic::Policy::Miscellanea::TextDomainUnused) \
perl(Perl::Critic::Policy::Modules::ProhibitModuleShebang) \
perl(Perl::Critic::Policy::Modules::ProhibitPOSIXimport) \
perl(Perl::Critic::Policy::Modules::ProhibitUseQuotedVersion) \
perl(Perl::Critic::Policy::ValuesAndExpressions::ConstantBeforeLt) \
perl(Perl::Critic::Policy::ValuesAndExpressions::NotWithCompare) \
perl(Perl::Critic::Policy::ValuesAndExpressions::ProhibitArrayAssignAref) \
perl(Perl::Critic::Policy::ValuesAndExpressions::ProhibitBarewordDoubleColon) \
perl(Perl::Critic::Policy::ValuesAndExpressions::ProhibitDuplicateHashKeys) \
perl(Perl::Critic::Policy::ValuesAndExpressions::ProhibitEmptyCommas) \
perl(Perl::Critic::Policy::ValuesAndExpressions::ProhibitFiletest_f) \
perl(Perl::Critic::Policy::ValuesAndExpressions::ProhibitNullStatements) \
perl(Perl::Critic::Policy::ValuesAndExpressions::ProhibitUnknownBackslash) \
perl(Perl::Critic::Policy::ValuesAndExpressions::RequireNumericVersion) \
perl(Perl::Critic::Policy::ValuesAndExpressions::UnexpandedSpecialLiteral) \
perl(Perl::Critic::Pulp) \
perl(Perl::Critic::Pulp::PodMinimumVersionViolation) \
perl(Perl::Critic::Pulp::PodParser) \
perl(Perl::Critic::Pulp::PodParser::ProhibitBadAproposMarkup) \
perl(Perl::Critic::Pulp::PodParser::ProhibitDuplicateHeadings) \
perl(Perl::Critic::Pulp::PodParser::ProhibitDuplicateSeeAlso) \
perl(Perl::Critic::Pulp::PodParser::ProhibitLinkToSelf) \
perl(Perl::Critic::Pulp::PodParser::ProhibitParagraphEndComma) \
perl(Perl::Critic::Pulp::PodParser::ProhibitParagraphTwoDots) \
perl(Perl::Critic::Pulp::PodParser::ProhibitUnbalancedParens) \
perl(Perl::Critic::Pulp::PodParser::RequireFilenameMarkup) \
perl(Perl::Critic::Pulp::PodParser::RequireFinalCut) \
perl(Perl::Critic::Pulp::PodParser::RequireLinkedURLs) \
perl(Perl::Critic::Pulp::ProhibitDuplicateHashKeys::Qword) \
perl(Perl::Critic::Pulp::Utils) \
perl-Perl-Critic-Pulp \
perl-Perl-Critic-Pulp(aarch-64)"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(IO::String) \
perl(List::MoreUtils) \
perl(PPI) \
perl(PPI::Document) \
perl(PPI::Dumper) \
perl(Perl::Critic) \
perl(Perl::Critic::Policy) \
perl(Perl::Critic::Utils) \
perl(Perl::Critic::Utils::PPI) \
perl(Perl::Critic::Violation) \
perl(Pod::Escapes) \
perl(Pod::MinimumVersion) \
perl(version)"

inherit rpm