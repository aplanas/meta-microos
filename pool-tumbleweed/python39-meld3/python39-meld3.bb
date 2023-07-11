SUMMARY = "HTML/XML templating engine for Python"
DESCRIPTION = "Meld3 is an HTML/XML templating system for Python 2.3+ which keeps template \
markup and dynamic rendering logic separate from one another. See \
http://www.entrian.com/PyMeld for a treatise on the benefits of this pattern."
LICENSE = "SUSE-Repoze"

PV = "2.0.1"

RPM_NAME = "python39-meld3-2.0.1-1.20.noarch.rpm"
RPM_HASH = "5b1f151917f264514b797ae5a043dd238884e2e4687d653e24a181762a0f207c4b91a4ecb6bc48f16566bbeb95a0f3938df88b1c26bb542658f528a8677ef3cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-meld3 \
python39-meld3 \
python3dist-meld3"

RDEPENDS:${PN} += "python-abi"

inherit rpm
