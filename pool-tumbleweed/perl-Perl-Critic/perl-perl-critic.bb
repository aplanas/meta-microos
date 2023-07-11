SUMMARY = "Critique Perl source code for best-practices"
DESCRIPTION = "Perl::Critic is an extensible framework for creating and applying coding \
standards to Perl source code. Essentially, it is a static source code \
analysis engine. Perl::Critic is distributed with a number of \
Perl::Critic::Policy modules that attempt to enforce various coding \
guidelines. Most Policy modules are based on Damian Conway's book *Perl \
Best Practices*. However, Perl::Critic is *not* limited to PBP and will \
even support Policies that contradict Conway. You can enable, disable, and \
customize those Polices through the Perl::Critic interface. You can also \
create new Policy modules that suit your own tastes. \
 \
For a command-line interface to Perl::Critic, see the documentation for \
perlcritic. If you want to integrate Perl::Critic with your build process, \
Test::Perl::Critic provides an interface that is suitable for test \
programs. Also, Test::Perl::Critic::Progressive is useful for gradually \
applying coding standards to legacy code. For the ultimate convenience (at \
the expense of some flexibility) see the criticism pragma. \
 \
If you'd like to try Perl::Critic without installing anything, there is a \
web-service available at http://perlcritic.com. The web-service does not \
yet support all the configuration features that are available in the native \
Perl::Critic API, but it should give you a good idea of what it does. \
 \
Also, ActivePerl includes a very slick graphical interface to Perl-Critic \
called 'perlcritic-gui'. You can get a free community edition of ActivePerl \
from http://www.activestate.com."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.150"

RPM_NAME = "perl-Perl-Critic-1.150-1.2.noarch.rpm"
RPM_HASH = "44b82a994f2b1c2fa5be6d45c9f2a6746159eeae76283eccc9befbfe47eae1a5073f74299a2808b0f9d2288fb4e05b46942d8032ade6b51a939128f6eff5538e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Perl--Critic \
perl-Perl--Critic--Annotation \
perl-Perl--Critic--Command \
perl-Perl--Critic--Config \
perl-Perl--Critic--Document \
perl-Perl--Critic--Exception \
perl-Perl--Critic--Exception--AggregateConfiguration \
perl-Perl--Critic--Exception--Configuration \
perl-Perl--Critic--Exception--Configuration--Generic \
perl-Perl--Critic--Exception--Configuration--NonExistentPolicy \
perl-Perl--Critic--Exception--Configuration--Option \
perl-Perl--Critic--Exception--Configuration--Option--Global \
perl-Perl--Critic--Exception--Configuration--Option--Global--ExtraParameter \
perl-Perl--Critic--Exception--Configuration--Option--Global--ParameterValue \
perl-Perl--Critic--Exception--Configuration--Option--Policy \
perl-Perl--Critic--Exception--Configuration--Option--Policy--ExtraParameter \
perl-Perl--Critic--Exception--Configuration--Option--Policy--ParameterValue \
perl-Perl--Critic--Exception--Fatal \
perl-Perl--Critic--Exception--Fatal--Generic \
perl-Perl--Critic--Exception--Fatal--Internal \
perl-Perl--Critic--Exception--Fatal--PolicyDefinition \
perl-Perl--Critic--Exception--IO \
perl-Perl--Critic--Exception--Parse \
perl-Perl--Critic--OptionsProcessor \
perl-Perl--Critic--Policy \
perl-Perl--Critic--Policy--BuiltinFunctions--ProhibitBooleanGrep \
perl-Perl--Critic--Policy--BuiltinFunctions--ProhibitComplexMappings \
perl-Perl--Critic--Policy--BuiltinFunctions--ProhibitLvalueSubstr \
perl-Perl--Critic--Policy--BuiltinFunctions--ProhibitReverseSortBlock \
perl-Perl--Critic--Policy--BuiltinFunctions--ProhibitShiftRef \
perl-Perl--Critic--Policy--BuiltinFunctions--ProhibitSleepViaSelect \
perl-Perl--Critic--Policy--BuiltinFunctions--ProhibitStringyEval \
perl-Perl--Critic--Policy--BuiltinFunctions--ProhibitStringySplit \
perl-Perl--Critic--Policy--BuiltinFunctions--ProhibitUniversalCan \
perl-Perl--Critic--Policy--BuiltinFunctions--ProhibitUniversalIsa \
perl-Perl--Critic--Policy--BuiltinFunctions--ProhibitUselessTopic \
perl-Perl--Critic--Policy--BuiltinFunctions--ProhibitVoidGrep \
perl-Perl--Critic--Policy--BuiltinFunctions--ProhibitVoidMap \
perl-Perl--Critic--Policy--BuiltinFunctions--RequireBlockGrep \
perl-Perl--Critic--Policy--BuiltinFunctions--RequireBlockMap \
perl-Perl--Critic--Policy--BuiltinFunctions--RequireGlobFunction \
perl-Perl--Critic--Policy--BuiltinFunctions--RequireSimpleSortBlock \
perl-Perl--Critic--Policy--ClassHierarchies--ProhibitAutoloading \
perl-Perl--Critic--Policy--ClassHierarchies--ProhibitExplicitISA \
perl-Perl--Critic--Policy--ClassHierarchies--ProhibitOneArgBless \
perl-Perl--Critic--Policy--CodeLayout--ProhibitHardTabs \
perl-Perl--Critic--Policy--CodeLayout--ProhibitParensWithBuiltins \
perl-Perl--Critic--Policy--CodeLayout--ProhibitQuotedWordLists \
perl-Perl--Critic--Policy--CodeLayout--ProhibitTrailingWhitespace \
perl-Perl--Critic--Policy--CodeLayout--RequireConsistentNewlines \
perl-Perl--Critic--Policy--CodeLayout--RequireTidyCode \
perl-Perl--Critic--Policy--CodeLayout--RequireTrailingCommas \
perl-Perl--Critic--Policy--ControlStructures--ProhibitCStyleForLoops \
perl-Perl--Critic--Policy--ControlStructures--ProhibitCascadingIfElse \
perl-Perl--Critic--Policy--ControlStructures--ProhibitDeepNests \
perl-Perl--Critic--Policy--ControlStructures--ProhibitLabelsWithSpecialBlockNames \
perl-Perl--Critic--Policy--ControlStructures--ProhibitMutatingListFunctions \
perl-Perl--Critic--Policy--ControlStructures--ProhibitNegativeExpressionsInUnlessAndUntilConditions \
perl-Perl--Critic--Policy--ControlStructures--ProhibitPostfixControls \
perl-Perl--Critic--Policy--ControlStructures--ProhibitUnlessBlocks \
perl-Perl--Critic--Policy--ControlStructures--ProhibitUnreachableCode \
perl-Perl--Critic--Policy--ControlStructures--ProhibitUntilBlocks \
perl-Perl--Critic--Policy--ControlStructures--ProhibitYadaOperator \
perl-Perl--Critic--Policy--Documentation--PodSpelling \
perl-Perl--Critic--Policy--Documentation--RequirePackageMatchesPodName \
perl-Perl--Critic--Policy--Documentation--RequirePodAtEnd \
perl-Perl--Critic--Policy--Documentation--RequirePodSections \
perl-Perl--Critic--Policy--ErrorHandling--RequireCarping \
perl-Perl--Critic--Policy--ErrorHandling--RequireCheckingReturnValueOfEval \
perl-Perl--Critic--Policy--InputOutput--ProhibitBacktickOperators \
perl-Perl--Critic--Policy--InputOutput--ProhibitBarewordDirHandles \
perl-Perl--Critic--Policy--InputOutput--ProhibitBarewordFileHandles \
perl-Perl--Critic--Policy--InputOutput--ProhibitExplicitStdin \
perl-Perl--Critic--Policy--InputOutput--ProhibitInteractiveTest \
perl-Perl--Critic--Policy--InputOutput--ProhibitJoinedReadline \
perl-Perl--Critic--Policy--InputOutput--ProhibitOneArgSelect \
perl-Perl--Critic--Policy--InputOutput--ProhibitReadlineInForLoop \
perl-Perl--Critic--Policy--InputOutput--ProhibitTwoArgOpen \
perl-Perl--Critic--Policy--InputOutput--RequireBracedFileHandleWithPrint \
perl-Perl--Critic--Policy--InputOutput--RequireBriefOpen \
perl-Perl--Critic--Policy--InputOutput--RequireCheckedClose \
perl-Perl--Critic--Policy--InputOutput--RequireCheckedOpen \
perl-Perl--Critic--Policy--InputOutput--RequireCheckedSyscalls \
perl-Perl--Critic--Policy--InputOutput--RequireEncodingWithUTF8Layer \
perl-Perl--Critic--Policy--Miscellanea--ProhibitFormats \
perl-Perl--Critic--Policy--Miscellanea--ProhibitTies \
perl-Perl--Critic--Policy--Miscellanea--ProhibitUnrestrictedNoCritic \
perl-Perl--Critic--Policy--Miscellanea--ProhibitUselessNoCritic \
perl-Perl--Critic--Policy--Modules--ProhibitAutomaticExportation \
perl-Perl--Critic--Policy--Modules--ProhibitConditionalUseStatements \
perl-Perl--Critic--Policy--Modules--ProhibitEvilModules \
perl-Perl--Critic--Policy--Modules--ProhibitExcessMainComplexity \
perl-Perl--Critic--Policy--Modules--ProhibitMultiplePackages \
perl-Perl--Critic--Policy--Modules--RequireBarewordIncludes \
perl-Perl--Critic--Policy--Modules--RequireEndWithOne \
perl-Perl--Critic--Policy--Modules--RequireExplicitPackage \
perl-Perl--Critic--Policy--Modules--RequireFilenameMatchesPackage \
perl-Perl--Critic--Policy--Modules--RequireNoMatchVarsWithUseEnglish \
perl-Perl--Critic--Policy--Modules--RequireVersionVar \
perl-Perl--Critic--Policy--NamingConventions--Capitalization \
perl-Perl--Critic--Policy--NamingConventions--ProhibitAmbiguousNames \
perl-Perl--Critic--Policy--Objects--ProhibitIndirectSyntax \
perl-Perl--Critic--Policy--References--ProhibitDoubleSigils \
perl-Perl--Critic--Policy--RegularExpressions--ProhibitCaptureWithoutTest \
perl-Perl--Critic--Policy--RegularExpressions--ProhibitComplexRegexes \
perl-Perl--Critic--Policy--RegularExpressions--ProhibitEnumeratedClasses \
perl-Perl--Critic--Policy--RegularExpressions--ProhibitEscapedMetacharacters \
perl-Perl--Critic--Policy--RegularExpressions--ProhibitFixedStringMatches \
perl-Perl--Critic--Policy--RegularExpressions--ProhibitSingleCharAlternation \
perl-Perl--Critic--Policy--RegularExpressions--ProhibitUnusedCapture \
perl-Perl--Critic--Policy--RegularExpressions--ProhibitUnusualDelimiters \
perl-Perl--Critic--Policy--RegularExpressions--ProhibitUselessTopic \
perl-Perl--Critic--Policy--RegularExpressions--RequireBracesForMultiline \
perl-Perl--Critic--Policy--RegularExpressions--RequireDotMatchAnything \
perl-Perl--Critic--Policy--RegularExpressions--RequireExtendedFormatting \
perl-Perl--Critic--Policy--RegularExpressions--RequireLineBoundaryMatching \
perl-Perl--Critic--Policy--Subroutines--ProhibitAmpersandSigils \
perl-Perl--Critic--Policy--Subroutines--ProhibitBuiltinHomonyms \
perl-Perl--Critic--Policy--Subroutines--ProhibitExcessComplexity \
perl-Perl--Critic--Policy--Subroutines--ProhibitExplicitReturnUndef \
perl-Perl--Critic--Policy--Subroutines--ProhibitManyArgs \
perl-Perl--Critic--Policy--Subroutines--ProhibitNestedSubs \
perl-Perl--Critic--Policy--Subroutines--ProhibitReturnSort \
perl-Perl--Critic--Policy--Subroutines--ProhibitSubroutinePrototypes \
perl-Perl--Critic--Policy--Subroutines--ProhibitUnusedPrivateSubroutines \
perl-Perl--Critic--Policy--Subroutines--ProtectPrivateSubs \
perl-Perl--Critic--Policy--Subroutines--RequireArgUnpacking \
perl-Perl--Critic--Policy--Subroutines--RequireFinalReturn \
perl-Perl--Critic--Policy--TestingAndDebugging--ProhibitNoStrict \
perl-Perl--Critic--Policy--TestingAndDebugging--ProhibitNoWarnings \
perl-Perl--Critic--Policy--TestingAndDebugging--ProhibitProlongedStrictureOverride \
perl-Perl--Critic--Policy--TestingAndDebugging--RequireTestLabels \
perl-Perl--Critic--Policy--TestingAndDebugging--RequireUseStrict \
perl-Perl--Critic--Policy--TestingAndDebugging--RequireUseWarnings \
perl-Perl--Critic--Policy--ValuesAndExpressions--ProhibitCommaSeparatedStatements \
perl-Perl--Critic--Policy--ValuesAndExpressions--ProhibitComplexVersion \
perl-Perl--Critic--Policy--ValuesAndExpressions--ProhibitConstantPragma \
perl-Perl--Critic--Policy--ValuesAndExpressions--ProhibitEmptyQuotes \
perl-Perl--Critic--Policy--ValuesAndExpressions--ProhibitEscapedCharacters \
perl-Perl--Critic--Policy--ValuesAndExpressions--ProhibitImplicitNewlines \
perl-Perl--Critic--Policy--ValuesAndExpressions--ProhibitInterpolationOfLiterals \
perl-Perl--Critic--Policy--ValuesAndExpressions--ProhibitLeadingZeros \
perl-Perl--Critic--Policy--ValuesAndExpressions--ProhibitLongChainsOfMethodCalls \
perl-Perl--Critic--Policy--ValuesAndExpressions--ProhibitMagicNumbers \
perl-Perl--Critic--Policy--ValuesAndExpressions--ProhibitMismatchedOperators \
perl-Perl--Critic--Policy--ValuesAndExpressions--ProhibitMixedBooleanOperators \
perl-Perl--Critic--Policy--ValuesAndExpressions--ProhibitNoisyQuotes \
perl-Perl--Critic--Policy--ValuesAndExpressions--ProhibitQuotesAsQuotelikeOperatorDelimiters \
perl-Perl--Critic--Policy--ValuesAndExpressions--ProhibitSpecialLiteralHeredocTerminator \
perl-Perl--Critic--Policy--ValuesAndExpressions--ProhibitVersionStrings \
perl-Perl--Critic--Policy--ValuesAndExpressions--RequireConstantVersion \
perl-Perl--Critic--Policy--ValuesAndExpressions--RequireInterpolationOfMetachars \
perl-Perl--Critic--Policy--ValuesAndExpressions--RequireNumberSeparators \
perl-Perl--Critic--Policy--ValuesAndExpressions--RequireQuotedHeredocTerminator \
perl-Perl--Critic--Policy--ValuesAndExpressions--RequireUpperCaseHeredocTerminator \
perl-Perl--Critic--Policy--Variables--ProhibitAugmentedAssignmentInDeclaration \
perl-Perl--Critic--Policy--Variables--ProhibitConditionalDeclarations \
perl-Perl--Critic--Policy--Variables--ProhibitEvilVariables \
perl-Perl--Critic--Policy--Variables--ProhibitLocalVars \
perl-Perl--Critic--Policy--Variables--ProhibitMatchVars \
perl-Perl--Critic--Policy--Variables--ProhibitPackageVars \
perl-Perl--Critic--Policy--Variables--ProhibitPerl4PackageNames \
perl-Perl--Critic--Policy--Variables--ProhibitPunctuationVars \
perl-Perl--Critic--Policy--Variables--ProhibitReusedNames \
perl-Perl--Critic--Policy--Variables--ProhibitUnusedVariables \
perl-Perl--Critic--Policy--Variables--ProtectPrivateVars \
perl-Perl--Critic--Policy--Variables--RequireInitializationForLocalVars \
perl-Perl--Critic--Policy--Variables--RequireLexicalLoopIterators \
perl-Perl--Critic--Policy--Variables--RequireLocalizedPunctuationVars \
perl-Perl--Critic--Policy--Variables--RequireNegativeIndices \
perl-Perl--Critic--PolicyConfig \
perl-Perl--Critic--PolicyFactory \
perl-Perl--Critic--PolicyListing \
perl-Perl--Critic--PolicyParameter \
perl-Perl--Critic--PolicyParameter--Behavior \
perl-Perl--Critic--PolicyParameter--Behavior--Boolean \
perl-Perl--Critic--PolicyParameter--Behavior--Enumeration \
perl-Perl--Critic--PolicyParameter--Behavior--Integer \
perl-Perl--Critic--PolicyParameter--Behavior--String \
perl-Perl--Critic--PolicyParameter--Behavior--StringList \
perl-Perl--Critic--ProfilePrototype \
perl-Perl--Critic--Statistics \
perl-Perl--Critic--TestUtils \
perl-Perl--Critic--Theme \
perl-Perl--Critic--ThemeListing \
perl-Perl--Critic--UserProfile \
perl-Perl--Critic--Utils \
perl-Perl--Critic--Utils--Constants \
perl-Perl--Critic--Utils--McCabe \
perl-Perl--Critic--Utils--POD \
perl-Perl--Critic--Utils--PPI \
perl-Perl--Critic--Utils--Perl \
perl-Perl--Critic--Violation \
perl-Perl-Critic \
perl-Test--Perl--Critic--Policy"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1 \
perl-B--Keywords \
perl-Config--Tiny \
perl-Exception--Class \
perl-Exporter \
perl-File--Which \
perl-List--SomeUtils \
perl-Module--Pluggable \
perl-PPI \
perl-PPI--Document \
perl-PPI--Document--File \
perl-PPI--Node \
perl-PPI--Token--Quote--Single \
perl-PPI--Token--Whitespace \
perl-PPIx--QuoteLike \
perl-PPIx--Regexp \
perl-PPIx--Regexp--Util \
perl-PPIx--Utils--Traversal \
perl-Perl--Tidy \
perl-Pod--PlainText \
perl-Pod--Select \
perl-Pod--Spell \
perl-Readonly \
perl-String--Format \
perl-Term--ANSIColor \
perl-Test--Builder \
perl-parent \
perl-version"

inherit rpm
