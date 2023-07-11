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

RPM_NAME = "python39-tinycss2-1.2.1-3.3.noarch.rpm"
RPM_HASH = "3bd720e84b8b31f106cfd960e554365e6b1fd97595432518ebd77aefb43f466fc1a32b863ea6a07e47d3f66e57c716dac7b9f7385253211f0ea8c4a4b387c172"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-tinycss2 \
python39-tinycss2 \
python3dist-tinycss2"

RDEPENDS:${PN} += "python-abi \
python39-webencodings"

inherit rpm
