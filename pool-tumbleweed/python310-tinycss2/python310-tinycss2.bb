SUMMARY = "A tiny CSS parser"
DESCRIPTION = "tinycss2 is a low-level CSS parser and generator written in Python: \
it can parse strings, return objects representing tokens and blocks, \
and generate CSS strings corresponding to these objects. \
 \
Based on the CSS Syntax Level 3 specification, tinycss2 knows the \
grammar of CSS but doesn't know specific rules, properties or values \
supported in various CSS modules."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "python310-tinycss2-1.2.1-3.3.noarch.rpm"
RPM_HASH = "7c2c44a55ff04ece84e4536939d498d66929a054e73acd10b741e6f7b8208367c2a59ab99b74376c16fa918cd04138770adcea7947ab9b9b97a80ed16bb13b1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-tinycss2 \
python310-tinycss2 \
python3dist-tinycss2"

RDEPENDS:${PN} += "python-abi \
python310-webencodings"

inherit rpm
