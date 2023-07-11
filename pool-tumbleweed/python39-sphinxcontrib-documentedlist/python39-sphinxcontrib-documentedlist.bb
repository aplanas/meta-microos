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

RPM_NAME = "python39-sphinxcontrib-documentedlist-0.6-3.3.noarch.rpm"
RPM_HASH = "abc8473b83bc5b29e6bac228830891d1225832247d9cb1ae4e0a9ceacbdfdafee3210e0e47b198053eaaebcee3d7a531570554a25518d1a7876440a340cbe51f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinxcontrib-documentedlist \
python39-sphinxcontrib-documentedlist \
python3dist-sphinxcontrib-documentedlist"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx \
python39-six"

inherit rpm
