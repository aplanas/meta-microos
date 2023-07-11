SUMMARY = "An Earley-Algorithm Context-free grammar Parser Toolkit"
DESCRIPTION = "SPARK stands for Scanning, Parsing, and Rewriting Kit. It uses Jay \
Earley's algorithm for parsing context-free grammars, and comes with \
some generic Abstract Syntax Tree routines. There is also a prototype \
scanner which does its job by combining Python regular expressions. \
 \
Please Note: Earley algorithm parsers are almost linear when given an LR \
grammar. These are grammars which are left-recursive."
LICENSE = "MIT"

PV = "1.8.9"

RPM_NAME = "python39-spark_parser-1.8.9-3.15.noarch.rpm"
RPM_HASH = "1accb726c22cea2a9799bad54abc246db173a3fd2eae3f67d921cb6790112fa3b5ffff5e8b204a239869ea1a0bb77942f073f4fd396aca5bdd2fbc7245d81cc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-spark-parser \
python39-spark-parser \
python3dist-spark-parser"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-click \
update-alternatives"

inherit rpm
