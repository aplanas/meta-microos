SUMMARY = "Full Syntax Tree for Python"
DESCRIPTION = "Baron is a Full Syntax Tree (FST) library for Python. In contrast \
to an AST which drops some syntax information in the process of its \
creation (like empty lines, comments, formatting), a FST keeps \
everything and guarantees the operation \
fst_to_code(code_to_fst(source_code)) == source_code."
LICENSE = "LGPL-3.0-or-later"

PV = "0.10.1"

RPM_NAME = "python39-baron-0.10.1-1.9.noarch.rpm"
RPM_HASH = "b633c82b9d94eda749fd3d52410408c99b11338af11e3052cfac62016abe7158c11427e9ba9f3171cb4582a183e6b84337c8fb36f8916342b295920891f114fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-baron \
python39-baron \
python3dist-baron"

RDEPENDS:${PN} += "python-abi \
python39-rply"

inherit rpm
