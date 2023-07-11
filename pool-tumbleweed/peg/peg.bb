SUMMARY = "Recursive-Descent parser generators for C"
DESCRIPTION = "peg(1) and leg(1) are tools for generating recursive-descent \
parsers: programs that perform pattern matching on text. They \
processes a Parsing Expression Grammar (PEG) to produce a program \
that recognises legal sentences of that grammar. peg(1) processes \
PEGs written using the original syntax described by Ford while \
leg(1) processes PEGs written using slightly different syntax and \
conventions that are intended to make it an attractive replacement \
for parsers built with lex(1) and yacc(1). Unlike lex(1) and \
yacc(1), peg(1) and leg(1) support unlimited backtracking, provide \
ordered choice as a means for disambiguation, and can combine \
scanning (lexical analysis) and parsing (syntactic analysis) into a \
single activity."
LICENSE = "MIT"

PV = "0.1.18"

RPM_NAME = "peg-0.1.18-1.12.aarch64.rpm"
RPM_HASH = "7ef25b1986fb326251d7645f0ff7309e8d1a887ae47151a03161791739a54ed2a64b6b8a4cf05e9f8a61b9d85c92f84d4d56a10b471593176d607ab986b774e0"

RPROVIDES:${PN} += "peg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
