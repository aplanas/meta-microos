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

RPM_NAME = "python311-sphinxcontrib-documentedlist-0.6-3.3.noarch.rpm"
RPM_HASH = "d8cf4b128acfd53ad39817331b4d72d01c0529a3d4c8fd5e67d913f1db086f4275ba079db328f2a3461e0ea116904a09f86161ee93c117b873345455c795b89b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-documentedlist \
python3.11dist-sphinxcontrib-documentedlist \
python311-sphinxcontrib-documentedlist \
python3dist-sphinxcontrib-documentedlist"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx \
python311-six"

inherit rpm
