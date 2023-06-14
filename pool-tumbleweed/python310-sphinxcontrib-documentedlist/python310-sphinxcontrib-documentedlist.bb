SUMMARY = "Sphinx DocumentedList extension"
DESCRIPTION = "Sphinx extension to convert a Python list into a table in the generated \
documentation. The intended application of this extension is to document \
the items of essentially list-like objects of immutable data (possibly \
enums, though python 3.4 enums are not supported yet). \
 \
In the source code, each list item, instead of being just its native \
data type, should be replaced by a tuple of two elements. In the \
simplest application, the second element of the tuple should be a string \
providing a description for the item."
LICENSE = "BSD-2-Clause"

PV = "0.6"

RPM_NAME = "python310-sphinxcontrib-documentedlist-0.6-3.1.noarch.rpm"
RPM_HASH = "318c39c2b814e729e5739c5069a3246a57147bdf70dc0f70802df3b5a80131141fd2c8f8e12f6f9aff7e749b23774532148ea6422fd3ee570791220ab7258c91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-documentedlist \
python3.10dist-sphinxcontrib-documentedlist \
python310-sphinxcontrib-documentedlist \
python3dist-sphinxcontrib-documentedlist"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx \
python310-six"

inherit rpm
