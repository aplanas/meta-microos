SUMMARY = "Full Syntax Tree for Python"
DESCRIPTION = "Baron is a Full Syntax Tree (FST) library for Python. In contrast \
to an AST which drops some syntax information in the process of its \
creation (like empty lines, comments, formatting), a FST keeps \
everything and guarantees the operation \
fst_to_code(code_to_fst(source_code)) == source_code."
LICENSE = "LGPL-3.0-or-later"

PV = "0.10.1"

RPM_NAME = "python311-baron-0.10.1-1.9.noarch.rpm"
RPM_HASH = "b531413f17fb6f6835d68b0ae4974206c424f667cfdcfa24ad7b214fec0024f982d1e0761624be969777a95d2cc3ad8e2e8f120c6532cff27b8826515738f821"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-baron \
python3.11dist-baron \
python311-baron \
python3dist-baron"

RDEPENDS:${PN} += "python-abi \
python311-rply"

inherit rpm
