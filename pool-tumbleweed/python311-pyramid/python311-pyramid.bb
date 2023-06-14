SUMMARY = "The Pyramid web application development framework"
DESCRIPTION = "Pyramid is a Python web application development framework \
produced by the Pylons Project (http://pylonsproject.org). \
It was previously known as repoze.bfg (http://bfg.repoze.org)."
LICENSE = "BSD-4-Clause & ZPL-2.1 & MIT"

PV = "2.0.1"

RPM_NAME = "python311-pyramid-2.0.1-1.3.noarch.rpm"
RPM_HASH = "33844027e815f4048a8d9eb9e797f4a7cdabe2c2b8ded4f9f0dc2bccf0f4ff60a06cc99304b01b5dae77bb909069479b20a967f5436069d6c9a15c6c73626d50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pyramid \
python311-pyramid \
python3dist-pyramid"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-PasteDeploy \
python311-WebOb \
python311-hupper \
python311-plaster \
python311-plaster-pastedeploy \
python311-setuptools \
python311-translationstring \
python311-venusian \
python311-zope.deprecation \
python311-zope.interface \
update-alternatives"

inherit rpm
