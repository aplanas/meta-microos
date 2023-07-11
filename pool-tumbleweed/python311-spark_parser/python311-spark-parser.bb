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

RPM_NAME = "python311-spark_parser-1.8.9-3.15.noarch.rpm"
RPM_HASH = "abb0856983f5f5dd2881d92a5db1eca889d50b4b653fc4c36774d8dd596bf247d4e47cecc1b0176574742825d10da69ce75e58b78b2db4a16ca6cf954b0186b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-spark-parser \
python3.11dist-spark-parser \
python311-spark-parser \
python3dist-spark-parser"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-click \
update-alternatives"

inherit rpm
