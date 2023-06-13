SUMMARY = "Remote command executor using ssh and Python in the remote end"
DESCRIPTION = "Remote command executor using ssh and Python in the remote end. This \
package is primarily built to support the ceph-deploy project. \
python-remoto is built upon python-execnet which manages the \
connections and processes."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "python310-remoto-1.2.1-1.5.noarch.rpm"
RPM_HASH = "eb582ce979bbdb9bc48812f1553dba05aec94157e3c38d719718b961a28b1ddbc8812898222dbccaa472096606bc33d33b6a0d0b479a5dac1c9d408c1a9b09c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-remoto \
python3.10dist(remoto) \
python310-remoto \
python3dist(remoto)"

RDEPENDS:${PN} += "python(abi) \
python310-execnet"

inherit rpm
