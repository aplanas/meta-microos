SUMMARY = "Python module for writing pandoc filters"
DESCRIPTION = "Pandoc filters are pipes that read a JSON serialization of the \
Pandoc AST from stdin, transform it in some way, and write it \
to stdout. They can be used with pandoc (>= 1.12) either using \
pipes. \
pandoc -t json -s | ./caps.py | pandoc -f json \
or using the --filter (or -F) command-line option."
LICENSE = "BSD-3-Clause"

PV = "1.5.0"

RPM_NAME = "python39-pandocfilters-1.5.0-1.5.noarch.rpm"
RPM_HASH = "32b3de430f5f9fc73bc76b68ab1d52ad0caddeaaf8b2cb97aa899abf24a3c2a7c490089621f565a9a328231ca8261bc251812c1b422aa700ad1bf37f0cdef12b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pandocfilters \
python39-pandocfilters \
python3dist-pandocfilters"

RDEPENDS:${PN} += "python-abi"

inherit rpm
