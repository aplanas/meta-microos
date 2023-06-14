SUMMARY = "Full Syntax Tree for Python"
DESCRIPTION = "Baron is a Full Syntax Tree (FST) library for Python. In contrast \
to an AST which drops some syntax information in the process of its \
creation (like empty lines, comments, formatting), a FST keeps \
everything and guarantees the operation \
fst_to_code(code_to_fst(source_code)) == source_code."
LICENSE = "LGPL-3.0-or-later"

PV = "0.10.1"

RPM_NAME = "python39-baron-0.10.1-1.7.noarch.rpm"
RPM_HASH = "6dff3b023309709f92e61228546c1e5a6e8082ecf723db01048ced5d78dea8791d12c1806ef2449c8474527653311220366903c8588ca47d76577afd41c00026"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-baron \
python39-baron \
python3dist-baron"

RDEPENDS:${PN} += "python-abi \
python39-rply"

inherit rpm
