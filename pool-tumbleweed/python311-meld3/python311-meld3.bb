SUMMARY = "HTML/XML templating engine for Python"
DESCRIPTION = "Meld3 is an HTML/XML templating system for Python 2.3+ which keeps template \
markup and dynamic rendering logic separate from one another. See \
http://www.entrian.com/PyMeld for a treatise on the benefits of this pattern."
LICENSE = "SUSE-Repoze"

PV = "2.0.1"

RPM_NAME = "python311-meld3-2.0.1-1.18.noarch.rpm"
RPM_HASH = "9d8c104cfe40a135709e3bb2ebd4800d1daa4a16d7f8c19b982668ee52577368e0ac929d64d2cf23abe8c2ab385012cc55b38e72b3b2fb546a1a89bf6dd695f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(meld3) \
python311-meld3 \
python3dist(meld3)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
