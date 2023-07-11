SUMMARY = "HTML/XML templating engine for Python"
DESCRIPTION = "Meld3 is an HTML/XML templating system for Python 2.3+ which keeps template \
markup and dynamic rendering logic separate from one another. See \
http://www.entrian.com/PyMeld for a treatise on the benefits of this pattern."
LICENSE = "SUSE-Repoze"

PV = "2.0.1"

RPM_NAME = "python310-meld3-2.0.1-1.20.noarch.rpm"
RPM_HASH = "2fd4b68072b9b226fd5d2551566e6139514017b19bdd7632de6bc78614060e3c7d6d4f0492f6b42f995ff68bf355b82b41e3a980fc2900cb279d673200fa0c15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-meld3 \
python310-meld3 \
python3dist-meld3"

RDEPENDS:${PN} += "python-abi"

inherit rpm
