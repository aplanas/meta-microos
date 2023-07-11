SUMMARY = "Python implementation of the lex and yacc tools"
DESCRIPTION = "SLY is a 100% Python implementation of the lex and yacc tools commonly used to write parsers and compilers. Parsing is based on the same LALR(1) algorithm used by many yacc tools. Here are a few notable features: \
* SLY provides very extensive error reporting and diagnostic information to assist in parser construction. The original implementation was developed for instructional purposes. As a result, the system tries to identify the most common types of errors made by novice users. \
* SLY provides full support for empty productions, error recovery, precedence specifiers, and moderately ambiguous grammars. \
* SLY uses various Python metaprogramming features to specify lexers and parsers. There are no generated files or extra steps involved. You simply write Python code and run it. \
* SLY can be used to build parsers for 'real' programming languages. Although it is not ultra-fast due to its Python implementation, SLY can be used to parse grammars consisting of several hundred rules (as might be found for a language like C)."
LICENSE = "MIT"

PV = "0.5"

RPM_NAME = "python39-sly-0.5-1.1.noarch.rpm"
RPM_HASH = "7b95fc358692fbf5a73abcf0af078b649a9cc5179033ad26b4bb0c6dc087c549a868035286b5e3bb38bf4f2b7aa0b424d18f84e5e725138fe4f4ccaf36095ada"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sly \
python39-sly \
python3dist-sly"

RDEPENDS:${PN} += "python-abi"

inherit rpm
