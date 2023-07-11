SUMMARY = "Full Syntax Tree for Python"
DESCRIPTION = "Baron is a Full Syntax Tree (FST) library for Python. In contrast \
to an AST which drops some syntax information in the process of its \
creation (like empty lines, comments, formatting), a FST keeps \
everything and guarantees the operation \
fst_to_code(code_to_fst(source_code)) == source_code."
LICENSE = "LGPL-3.0-or-later"

PV = "0.10.1"

RPM_NAME = "python310-baron-0.10.1-1.9.noarch.rpm"
RPM_HASH = "629504b79cc718b329246718f26ccf8768acb74ff3f1de40265af1a85e96b38b004f26c5bf3ba883f9471895a5a9805b3e858f7fc3b8dec69d0ce91b7f311f17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-baron \
python310-baron \
python3dist-baron"

RDEPENDS:${PN} += "python-abi \
python310-rply"

inherit rpm
