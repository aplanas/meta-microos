SUMMARY = "Python module for writing pandoc filters"
DESCRIPTION = "Pandoc filters are pipes that read a JSON serialization of the \
Pandoc AST from stdin, transform it in some way, and write it \
to stdout. They can be used with pandoc (>= 1.12) either using \
pipes. \
pandoc -t json -s | ./caps.py | pandoc -f json \
or using the --filter (or -F) command-line option."
LICENSE = "BSD-3-Clause"

PV = "1.5.0"

RPM_NAME = "python39-pandocfilters-1.5.0-2.1.noarch.rpm"
RPM_HASH = "4f49aa689837520b3527ee36f89d78834ff324d49a69246c785fd0fb69ca524398de117c54d8bd8ac62437891973bbd4ec46165836f4e9f585242044c3e3637e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pandocfilters \
python39-pandocfilters \
python3dist-pandocfilters"

RDEPENDS:${PN} += "python-abi"

inherit rpm
