SUMMARY = "The Pyramid web application development framework"
DESCRIPTION = "Pyramid is a Python web application development framework \
produced by the Pylons Project (http://pylonsproject.org). \
It was previously known as repoze.bfg (http://bfg.repoze.org)."
LICENSE = "BSD-4-Clause & ZPL-2.1 & MIT"

PV = "2.0.1"

RPM_NAME = "python39-pyramid-2.0.1-1.3.noarch.rpm"
RPM_HASH = "4a20f5f081dd5bff4f5adf8db0387fcdb6b88d3ed479362ac559531bb9eaff1489c63d00663a18442c14862e9acc84c3dd6e294a8cbf7650a89666e4a91ba487"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyramid) \
python39-pyramid \
python3dist(pyramid)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-PasteDeploy \
python39-WebOb \
python39-hupper \
python39-plaster \
python39-plaster-pastedeploy \
python39-setuptools \
python39-translationstring \
python39-venusian \
python39-zope.deprecation \
python39-zope.interface \
update-alternatives"

inherit rpm
