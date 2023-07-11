SUMMARY = "Python implementation of the lex and yacc tools"
DESCRIPTION = "SLY is a 100% Python implementation of the lex and yacc tools commonly used to write parsers and compilers. Parsing is based on the same LALR(1) algorithm used by many yacc tools. Here are a few notable features: \
* SLY provides very extensive error reporting and diagnostic information to assist in parser construction. The original implementation was developed for instructional purposes. As a result, the system tries to identify the most common types of errors made by novice users. \
* SLY provides full support for empty productions, error recovery, precedence specifiers, and moderately ambiguous grammars. \
* SLY uses various Python metaprogramming features to specify lexers and parsers. There are no generated files or extra steps involved. You simply write Python code and run it. \
* SLY can be used to build parsers for 'real' programming languages. Although it is not ultra-fast due to its Python implementation, SLY can be used to parse grammars consisting of several hundred rules (as might be found for a language like C)."
LICENSE = "MIT"

PV = "0.5"

RPM_NAME = "python311-sly-0.5-1.1.noarch.rpm"
RPM_HASH = "d4962c99c8b1ecca5516653b31be8524913126a130bdb51b7a18b84fb473d36c4c052fa32c8752374f7b0a7959f74c3e21ff06a206aed5c5b5d72798fc115842"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sly \
python3.11dist-sly \
python311-sly \
python3dist-sly"

RDEPENDS:${PN} += "python-abi"

inherit rpm
