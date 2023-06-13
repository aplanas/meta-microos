SUMMARY = "Tabbed views for Sphinx"
DESCRIPTION = "Create tabbed content in Sphinx documentation when building HTML."
LICENSE = "MIT"

PV = "3.4.1"

RPM_NAME = "python39-sphinx-tabs-3.4.1-1.3.noarch.rpm"
RPM_HASH = "6c9277c6b99a20e8776657719e4efe9ce8bf631d1f287b5f69316e32fcf6a8a2cc55a93d3dd483c4e6c5a10b09fc6f3c2c961a9fe80b014a499efbf15970c7af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sphinx-tabs) \
python39-sphinx-tabs \
python3dist(sphinx-tabs)"

RDEPENDS:${PN} += "python(abi) \
python39-Pygments \
python39-Sphinx \
python39-docutils"

inherit rpm
