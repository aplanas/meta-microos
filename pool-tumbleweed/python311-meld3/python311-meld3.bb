SUMMARY = "HTML/XML templating engine for Python"
DESCRIPTION = "Meld3 is an HTML/XML templating system for Python 2.3+ which keeps template \
markup and dynamic rendering logic separate from one another. See \
http://www.entrian.com/PyMeld for a treatise on the benefits of this pattern."
LICENSE = "SUSE-Repoze"

PV = "2.0.1"

RPM_NAME = "python311-meld3-2.0.1-1.20.noarch.rpm"
RPM_HASH = "2a8de7e272f515e0b749379322e76e2e032d3b57e6a2f29238ec7ff77ca65b113da260de5904b84ab1c24de82ad18d5e5d8edd50e3bd835436146b7e371d0718"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-meld3 \
python3.11dist-meld3 \
python311-meld3 \
python3dist-meld3"

RDEPENDS:${PN} += "python-abi"

inherit rpm
