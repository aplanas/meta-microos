SUMMARY = "Python module for writing pandoc filters"
DESCRIPTION = "Pandoc filters are pipes that read a JSON serialization of the \
Pandoc AST from stdin, transform it in some way, and write it \
to stdout. They can be used with pandoc (>= 1.12) either using \
pipes. \
pandoc -t json -s | ./caps.py | pandoc -f json \
or using the --filter (or -F) command-line option."
LICENSE = "BSD-3-Clause"

PV = "1.5.0"

RPM_NAME = "python311-pandocfilters-1.5.0-2.1.noarch.rpm"
RPM_HASH = "73f6f7071dfb5aee5274b7be4677bbf6f36a1b4f3efe3382df7e338d05e29fdad16e1ce3d613fb601829b330ad7565e597289bd0bafda1d52acaaa4bb424b2f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandocfilters \
python3.11dist-pandocfilters \
python311-pandocfilters \
python3dist-pandocfilters"

RDEPENDS:${PN} += "python-abi"

inherit rpm
