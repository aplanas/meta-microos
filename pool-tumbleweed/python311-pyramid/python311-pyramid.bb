SUMMARY = "The Pyramid web application development framework"
DESCRIPTION = "Pyramid is a Python web application development framework \
produced by the Pylons Project (http://pylonsproject.org). \
It was previously known as repoze.bfg (http://bfg.repoze.org)."
LICENSE = "BSD-4-Clause & ZPL-2.1 & MIT"

PV = "2.0.1"

RPM_NAME = "python311-pyramid-2.0.1-2.3.noarch.rpm"
RPM_HASH = "f531e424c998e26f9f627288a09320205e8db75f8fa559dd418d34245997cb3bcb948ad84db563d0b5efd18aa896f10573222d5129f2f27874b43364391cf87f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyramid \
python3.11dist-pyramid \
python311-pyramid \
python3dist-pyramid"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
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
