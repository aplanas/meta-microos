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

RPM_NAME = "peg-0.1.18-1.11.aarch64.rpm"
RPM_HASH = "6c4983926b6d84d75925ca1ef20d493717d124a7cfd7195a0d0e792dadc08db39b9690964871410a1cc9394a4d4747f0e9efea8f0bdb467ff80d3b8b9f45bff9"

RPROVIDES:${PN} += "peg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
