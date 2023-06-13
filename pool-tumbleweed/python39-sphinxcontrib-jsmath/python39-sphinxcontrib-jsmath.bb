SUMMARY = "Sphinx extension which renders display math in HTML via JavaScript"
DESCRIPTION = "sphinxcontrib-jsmath is a sphinx extension which renders display math in HTML \
via JavaScript."
LICENSE = "BSD-2-Clause"

PV = "1.0.1"

RPM_NAME = "python39-sphinxcontrib-jsmath-1.0.1-4.1.noarch.rpm"
RPM_HASH = "fdafa13ef6a6528e50a365fdbf139f2eff8d90bae4151fc0c82e8ed0300ea26d70d58d505f5ff8691a24f8e29452ecd806095c0ebd286dc52aa8bfd568d592a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sphinxcontrib-jsmath) \
python39-sphinxcontrib-jsmath \
python3dist(sphinxcontrib-jsmath)"

RDEPENDS:${PN} += "python(abi) \
python39-Sphinx"

inherit rpm
