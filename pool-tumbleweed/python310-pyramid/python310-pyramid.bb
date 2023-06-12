SUMMARY = "The Pyramid web application development framework"
DESCRIPTION = "Pyramid is a Python web application development framework \
produced by the Pylons Project (http://pylonsproject.org). \
It was previously known as repoze.bfg (http://bfg.repoze.org)."
LICENSE = "BSD-4-Clause & ZPL-2.1 & MIT"

PV = "2.0.1"

RPM_NAME = "python310-pyramid-2.0.1-1.3.noarch.rpm"
RPM_HASH = "b0001f7467e9f75d50bc93f60d2b69eaf712b246f7cafde9d4721682e66816e6a1c7db44ca29d3c43023280ced777fea465c89c149da3a6d981404273a9e1391"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyramid \
python3.10dist(pyramid) \
python310-pyramid \
python3dist(pyramid)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-PasteDeploy \
python310-WebOb \
python310-hupper \
python310-plaster \
python310-plaster-pastedeploy \
python310-setuptools \
python310-translationstring \
python310-venusian \
python310-zope.deprecation \
python310-zope.interface \
update-alternatives"

inherit rpm
