SUMMARY = "The Pyramid web application development framework"
DESCRIPTION = "Pyramid is a Python web application development framework \
produced by the Pylons Project (http://pylonsproject.org). \
It was previously known as repoze.bfg (http://bfg.repoze.org)."
LICENSE = "BSD-4-Clause & ZPL-2.1 & MIT"

PV = "2.0.1"

RPM_NAME = "python310-pyramid-2.0.1-2.3.noarch.rpm"
RPM_HASH = "7c67097e2359957194510dc9d05e1ec274ee9372468ae9cc964cfe4c005ec84dff4a2474cf0048320a0bf0845bae02429828649dc0cd3c11905968c7dfb2dfef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyramid \
python310-pyramid \
python3dist-pyramid"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
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
