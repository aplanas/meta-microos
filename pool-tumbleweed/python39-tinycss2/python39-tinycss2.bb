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

RPM_NAME = "python39-tinycss2-1.2.1-3.1.noarch.rpm"
RPM_HASH = "b4645256b771bfcd1e15f62371359f68ad236dc89b0f3b5ebc2c17d7df594cc7047064f994ec4054c4092923bfd93a6e0f401f1c3bfa66c45e1b2f7c0c00b642"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-tinycss2 \
python39-tinycss2 \
python3dist-tinycss2"

RDEPENDS:${PN} += "python-abi \
python39-webencodings"

inherit rpm
