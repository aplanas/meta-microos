SUMMARY = "Python module for writing pandoc filters"
DESCRIPTION = "Pandoc filters are pipes that read a JSON serialization of the \
Pandoc AST from stdin, transform it in some way, and write it \
to stdout. They can be used with pandoc (>= 1.12) either using \
pipes. \
pandoc -t json -s | ./caps.py | pandoc -f json \
or using the --filter (or -F) command-line option."
LICENSE = "BSD-3-Clause"

PV = "1.5.0"

RPM_NAME = "python311-pandocfilters-1.5.0-1.5.noarch.rpm"
RPM_HASH = "6a5b8d0998750c72c8c19ad3d3205ee183d46b3691c66b87af20815f69673fd9f1bf5fae8ee06017e3f8d03f0b58353c9a1c17fc11c48e6c2f30e3cfa041a8da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandocfilters \
python3.11dist-pandocfilters \
python311-pandocfilters \
python3dist-pandocfilters"

RDEPENDS:${PN} += "python-abi"

inherit rpm
