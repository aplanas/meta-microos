SUMMARY = "Extension to include jQuery on newer Sphinx releases"
DESCRIPTION = "Extension to include jQuery on newer Sphinx releases"
LICENSE = "0BSD"

PV = "4.1"

RPM_NAME = "python39-sphinxcontrib-jquery-4.1-1.1.noarch.rpm"
RPM_HASH = "d5b59dfd74b57fd11122d0ead1f483418fa85483393bc9786b78c81daf9a008a14a00564f26ab7d03f6cb299d101510638ab1c4672df8986460953c9c1fd71c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sphinxcontrib-jquery) \
python39-sphinxcontrib-jquery \
python3dist(sphinxcontrib-jquery)"
RDEPENDS:${PN} += "python(abi) \
python39-Sphinx"

inherit rpm
