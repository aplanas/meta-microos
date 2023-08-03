SUMMARY = "Python module for writing pandoc filters"
DESCRIPTION = "Pandoc filters are pipes that read a JSON serialization of the \
Pandoc AST from stdin, transform it in some way, and write it \
to stdout. They can be used with pandoc (>= 1.12) either using \
pipes. \
pandoc -t json -s | ./caps.py | pandoc -f json \
or using the --filter (or -F) command-line option."
LICENSE = "BSD-3-Clause"

PV = "1.5.0"

RPM_NAME = "python310-pandocfilters-1.5.0-2.1.noarch.rpm"
RPM_HASH = "80f33eba696d99ab3ec18dc1dd21800c3604e7e7e9f619a917e3d26193a420f7e2ba7a9c4c0836676bf1e8b017532177082bde7b1db6c859e6b184f21b12c3f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pandocfilters \
python310-pandocfilters \
python3dist-pandocfilters"

RDEPENDS:${PN} += "python-abi"

inherit rpm
