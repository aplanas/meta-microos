SUMMARY = "Python module for writing pandoc filters"
DESCRIPTION = "Pandoc filters are pipes that read a JSON serialization of the \
Pandoc AST from stdin, transform it in some way, and write it \
to stdout. They can be used with pandoc (>= 1.12) either using \
pipes. \
pandoc -t json -s | ./caps.py | pandoc -f json \
or using the --filter (or -F) command-line option."
LICENSE = "BSD-3-Clause"

PV = "1.5.0"

RPM_NAME = "python310-pandocfilters-1.5.0-1.4.noarch.rpm"
RPM_HASH = "619235eeaeff3f65b71598a1b8fa1ddfed82812e17f37a37efe5aa08acdd58d66c7cf66d253940fe355c1ee8deef6d419c6bfb503c4e0f4ab6d3e8a91b92f4b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandocfilters \
python3.10dist(pandocfilters) \
python310-pandocfilters \
python3dist(pandocfilters)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
