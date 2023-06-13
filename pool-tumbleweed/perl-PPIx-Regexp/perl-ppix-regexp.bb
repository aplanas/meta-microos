SUMMARY = "Parse regular expressions"
DESCRIPTION = "The purpose of the _PPIx-Regexp_ package is to parse regular expressions in \
a manner similar to the way the PPI package parses Perl. This class forms \
the root of the parse tree, playing a role similar to PPI::Document. \
 \
This package shares with PPI the property of being round-trip safe. That \
is, \
 \
 my $expr = 's/ ( \\d+ ) ( \\D+ ) /$2$1/smxg'; \
 my $re = PPIx::Regexp->new( $expr ); \
 print $re->content() eq $expr ? 'yes\\n' : 'no\\n' \
 \
should print 'yes' for any valid regular expression. \
 \
Navigation is similar to that provided by PPI. That is to say, things like \
'children', 'find_first', 'snext_sibling' and so on all work pretty much \
the same way as in PPI. \
 \
The class hierarchy is also similar to PPI. Except for some utility classes \
(the dumper, the lexer, and the tokenizer) all classes are descended from \
PPIx::Regexp::Element, which provides basic navigation. Tokens are \
descended from PPIx::Regexp::Token, which provides content. All containers \
are descended from PPIx::Regexp::Node, which provides for children, and all \
structure elements are descended from PPIx::Regexp::Structure, which \
provides beginning and ending delimiters, and a type. \
 \
There are two features of PPI that this package does not provide - \
mutability and operator overloading. There are no plans for serious \
mutability, though something like PPI's 'prune' functionality might be \
considered. Similarly there are no plans for operator overloading, which \
appears to the author to represent a performance hit for little tangible \
gain."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.088"

RPM_NAME = "perl-PPIx-Regexp-0.088-1.1.noarch.rpm"
RPM_HASH = "3cdc3689886394bb579c7ae1cd695c4d567bdfbdd0a1c7c7cb2a621a50dde1e9a389161e613405b95d7623fed509b0510202a62dbd2bb0e840268e0d24af8602"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(PPIx::Regexp) \
perl(PPIx::Regexp::Constant) \
perl(PPIx::Regexp::Constant::Inf) \
perl(PPIx::Regexp::Dumper) \
perl(PPIx::Regexp::Element) \
perl(PPIx::Regexp::Lexer) \
perl(PPIx::Regexp::Node) \
perl(PPIx::Regexp::Node::Range) \
perl(PPIx::Regexp::Node::Unknown) \
perl(PPIx::Regexp::Structure) \
perl(PPIx::Regexp::Structure::Assertion) \
perl(PPIx::Regexp::Structure::Atomic_Script_Run) \
perl(PPIx::Regexp::Structure::BranchReset) \
perl(PPIx::Regexp::Structure::Capture) \
perl(PPIx::Regexp::Structure::CharClass) \
perl(PPIx::Regexp::Structure::Code) \
perl(PPIx::Regexp::Structure::Main) \
perl(PPIx::Regexp::Structure::Modifier) \
perl(PPIx::Regexp::Structure::NamedCapture) \
perl(PPIx::Regexp::Structure::Quantifier) \
perl(PPIx::Regexp::Structure::RegexSet) \
perl(PPIx::Regexp::Structure::Regexp) \
perl(PPIx::Regexp::Structure::Replacement) \
perl(PPIx::Regexp::Structure::Script_Run) \
perl(PPIx::Regexp::Structure::Subexpression) \
perl(PPIx::Regexp::Structure::Switch) \
perl(PPIx::Regexp::Structure::Unknown) \
perl(PPIx::Regexp::Support) \
perl(PPIx::Regexp::Token) \
perl(PPIx::Regexp::Token::Assertion) \
perl(PPIx::Regexp::Token::Backreference) \
perl(PPIx::Regexp::Token::Backtrack) \
perl(PPIx::Regexp::Token::CharClass) \
perl(PPIx::Regexp::Token::CharClass::POSIX) \
perl(PPIx::Regexp::Token::CharClass::POSIX::Unknown) \
perl(PPIx::Regexp::Token::CharClass::Simple) \
perl(PPIx::Regexp::Token::Code) \
perl(PPIx::Regexp::Token::Comment) \
perl(PPIx::Regexp::Token::Condition) \
perl(PPIx::Regexp::Token::Control) \
perl(PPIx::Regexp::Token::Delimiter) \
perl(PPIx::Regexp::Token::Greediness) \
perl(PPIx::Regexp::Token::GroupType) \
perl(PPIx::Regexp::Token::GroupType::Assertion) \
perl(PPIx::Regexp::Token::GroupType::Atomic_Script_Run) \
perl(PPIx::Regexp::Token::GroupType::BranchReset) \
perl(PPIx::Regexp::Token::GroupType::Code) \
perl(PPIx::Regexp::Token::GroupType::Modifier) \
perl(PPIx::Regexp::Token::GroupType::NamedCapture) \
perl(PPIx::Regexp::Token::GroupType::Script_Run) \
perl(PPIx::Regexp::Token::GroupType::Subexpression) \
perl(PPIx::Regexp::Token::GroupType::Switch) \
perl(PPIx::Regexp::Token::Interpolation) \
perl(PPIx::Regexp::Token::Literal) \
perl(PPIx::Regexp::Token::Modifier) \
perl(PPIx::Regexp::Token::NoOp) \
perl(PPIx::Regexp::Token::Operator) \
perl(PPIx::Regexp::Token::Quantifier) \
perl(PPIx::Regexp::Token::Recursion) \
perl(PPIx::Regexp::Token::Reference) \
perl(PPIx::Regexp::Token::Structure) \
perl(PPIx::Regexp::Token::Unknown) \
perl(PPIx::Regexp::Token::Unmatched) \
perl(PPIx::Regexp::Token::Whitespace) \
perl(PPIx::Regexp::Tokenizer) \
perl(PPIx::Regexp::Util) \
perl-PPIx-Regexp"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(PPI::Document) \
perl(PPI::Dumper) \
perl(Task::Weaken)"

inherit rpm
