SUMMARY = "Click params for commmand line interfaces to GeoJSON"
DESCRIPTION = "Common arguments and options for GeoJSON processing commands, using Click."
LICENSE = "BSD-3-Clause"

PV = "0.7.2"

RPM_NAME = "python39-cligj-0.7.2-1.7.noarch.rpm"
RPM_HASH = "58cda2e442754db742c914f4cd3ff7a38339b17c224a81bd72d74b1b282c0647e025eb5c16028d73386a6eabda4fea2718f81c1afde403119f363143850cde78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cligj \
python39-cligj \
python3dist-cligj"

RDEPENDS:${PN} += "python-abi \
python39-click"

inherit rpm
