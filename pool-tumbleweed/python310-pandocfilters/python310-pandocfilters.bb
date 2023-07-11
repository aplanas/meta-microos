SUMMARY = "Python module for writing pandoc filters"
DESCRIPTION = "Pandoc filters are pipes that read a JSON serialization of the \
Pandoc AST from stdin, transform it in some way, and write it \
to stdout. They can be used with pandoc (>= 1.12) either using \
pipes. \
pandoc -t json -s | ./caps.py | pandoc -f json \
or using the --filter (or -F) command-line option."
LICENSE = "BSD-3-Clause"

PV = "1.5.0"

RPM_NAME = "python310-pandocfilters-1.5.0-1.5.noarch.rpm"
RPM_HASH = "348170e87b4f1f3e1ef725a7b5f18b42ad83c376b2ef1e85260a0e16018c3bbfb7e638094c0f53e4b921c2301ab068e763a46c224b8e0495117e118c97763d04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pandocfilters \
python310-pandocfilters \
python3dist-pandocfilters"

RDEPENDS:${PN} += "python-abi"

inherit rpm
