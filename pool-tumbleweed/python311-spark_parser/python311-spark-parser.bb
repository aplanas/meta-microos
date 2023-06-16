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

RPM_NAME = "python311-spark_parser-1.8.9-3.13.noarch.rpm"
RPM_HASH = "42d087e938e97df7e8217666bebdd61c6664d42210b72a0ff505afd2b2c10ca452979fa89df216f5ddf7b2592f9d4c8254cb170ab20854e2e669dfaf62342a82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-spark-parser \
python311-spark-parser \
python3dist-spark-parser"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-click \
update-alternatives"

inherit rpm
