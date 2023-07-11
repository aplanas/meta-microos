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

RPM_NAME = "python310-spark_parser-1.8.9-3.15.noarch.rpm"
RPM_HASH = "d48c5321dc5c0f69f409b6f162f68256da5b88e7188ad701ffc59e8c1a183219db377c4dce2c74a357cb3e384ce7ad25fda707ffdcd8a63317a6255f5a44b55e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-spark-parser \
python310-spark-parser \
python3dist-spark-parser"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-click \
update-alternatives"

inherit rpm
