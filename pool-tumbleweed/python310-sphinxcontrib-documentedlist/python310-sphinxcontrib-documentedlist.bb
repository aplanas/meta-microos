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

RPM_NAME = "python310-sphinxcontrib-documentedlist-0.6-3.3.noarch.rpm"
RPM_HASH = "ebc9fb92b4545d78c08455e52daa4139b900d8f4e94284819f910198c2125a6a561c655e8d3ac2d2bdd0ff3869dfb850cd28582a1149fd5dc4366243ecb0a3b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinxcontrib-documentedlist \
python310-sphinxcontrib-documentedlist \
python3dist-sphinxcontrib-documentedlist"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx \
python310-six"

inherit rpm
