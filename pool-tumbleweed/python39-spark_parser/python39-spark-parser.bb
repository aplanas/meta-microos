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

RPM_NAME = "python39-spark_parser-1.8.9-3.13.noarch.rpm"
RPM_HASH = "732b912db2c3a27362f1527bb8f52631e6f58bd0ebb6eaa0075603e4e21a10d68525d7c84933faf33dae717fa39793a897bc5adacd107c05c4241aacc6e93f61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(spark-parser) \
python39-spark_parser \
python3dist(spark-parser)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-click \
update-alternatives"

inherit rpm
