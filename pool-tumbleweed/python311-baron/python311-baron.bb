SUMMARY = "Full Syntax Tree for Python"
DESCRIPTION = "Baron is a Full Syntax Tree (FST) library for Python. In contrast \
to an AST which drops some syntax information in the process of its \
creation (like empty lines, comments, formatting), a FST keeps \
everything and guarantees the operation \
fst_to_code(code_to_fst(source_code)) == source_code."
LICENSE = "LGPL-3.0-or-later"

PV = "0.10.1"

RPM_NAME = "python311-baron-0.10.1-1.7.noarch.rpm"
RPM_HASH = "6aed8d4a3e5ee47d001cfcdbdef14f72fb8863ed58b3fc2deacdb7883fb8bc0fc0eb2570cd000bec505bc6fd452408e67c845658c2bc5b9494921fae43c9e31e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(baron) \
python311-baron \
python3dist(baron)"
RDEPENDS:${PN} += "python(abi) \
python311-rply"

inherit rpm
