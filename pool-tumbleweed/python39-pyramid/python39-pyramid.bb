SUMMARY = "The Pyramid web application development framework"
DESCRIPTION = "Pyramid is a Python web application development framework \
produced by the Pylons Project (http://pylonsproject.org). \
It was previously known as repoze.bfg (http://bfg.repoze.org)."
LICENSE = "BSD-4-Clause & ZPL-2.1 & MIT"

PV = "2.0.1"

RPM_NAME = "python39-pyramid-2.0.1-2.3.noarch.rpm"
RPM_HASH = "928faa0f123418f348d191d6d8401d147ee1dbfc9f32706e88356f4ca8b15a940ccd511f3ce5af2e55feeb9f45332e477218e31f6e3f972447c3295f3a420b77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyramid \
python39-pyramid \
python3dist-pyramid"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
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
