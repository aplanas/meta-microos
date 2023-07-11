SUMMARY = "Remote command executor using ssh and Python in the remote end"
DESCRIPTION = "Remote command executor using ssh and Python in the remote end. This \
package is primarily built to support the ceph-deploy project. \
python-remoto is built upon python-execnet which manages the \
connections and processes."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "python311-remoto-1.2.1-1.7.noarch.rpm"
RPM_HASH = "76fde1b10fa834a78ececd21d5b64c95719ed0ac06b48079f61bb466e84bf0b4d3e067f62f01c7e6459cdd22b45e4bea32f55a2b2aa5a8c76cc12d74615b3e54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-remoto \
python3.11dist-remoto \
python311-remoto \
python3dist-remoto"

RDEPENDS:${PN} += "python-abi \
python311-execnet"

inherit rpm
