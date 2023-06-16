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

RPM_NAME = "python310-spark_parser-1.8.9-3.13.noarch.rpm"
RPM_HASH = "7c579750ce25b3ca7745bcf7136fef565c3da19b2b788aab4ed3305d837b7733e29f459b57bb8fc07ceb4d374a93dbf6bf6574a6b09098a05fd1a57668b67fa8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-spark-parser \
python3.10dist-spark-parser \
python310-spark-parser \
python3dist-spark-parser"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-click \
update-alternatives"

inherit rpm
