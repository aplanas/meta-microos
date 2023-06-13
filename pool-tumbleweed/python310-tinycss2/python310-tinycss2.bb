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

RPM_NAME = "python310-tinycss2-1.2.1-3.1.noarch.rpm"
RPM_HASH = "8310beef23a3faab1db11db5be7e10624566abe3ecb39e92836747d782414b7f7d589e4bcbcf9354ba42603ce126e1ab74bdc1a198b303e0b8112889d7eefaeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tinycss2 \
python3.10dist(tinycss2) \
python310-tinycss2 \
python3dist(tinycss2)"

RDEPENDS:${PN} += "python(abi) \
python310-webencodings"

inherit rpm
