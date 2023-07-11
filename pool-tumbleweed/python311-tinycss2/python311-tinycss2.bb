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

RPM_NAME = "python311-tinycss2-1.2.1-3.3.noarch.rpm"
RPM_HASH = "7b65882b7372910bb418264699f27830fcf0d7ffe0c4a1a79b2f32539d2ae7598dd9508f23708f609837b3c45bc37f91b2f8838429f0c2512102d742394220bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tinycss2 \
python3.11dist-tinycss2 \
python311-tinycss2 \
python3dist-tinycss2"

RDEPENDS:${PN} += "python-abi \
python311-webencodings"

inherit rpm
