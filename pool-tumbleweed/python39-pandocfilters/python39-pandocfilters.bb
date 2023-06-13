SUMMARY = "Python module for writing pandoc filters"
DESCRIPTION = "Pandoc filters are pipes that read a JSON serialization of the \
Pandoc AST from stdin, transform it in some way, and write it \
to stdout. They can be used with pandoc (>= 1.12) either using \
pipes. \
pandoc -t json -s | ./caps.py | pandoc -f json \
or using the --filter (or -F) command-line option."
LICENSE = "BSD-3-Clause"

PV = "1.5.0"

RPM_NAME = "python39-pandocfilters-1.5.0-1.4.noarch.rpm"
RPM_HASH = "328e355396a970bbfe514670fd5e1b40e1283ffd7bae5ff392029d53c0e6f6e73348c96e8ed927e493a7519549f8f215e1f5f82a8cea7a038e609ccabe62be96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pandocfilters) \
python39-pandocfilters \
python3dist(pandocfilters)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
