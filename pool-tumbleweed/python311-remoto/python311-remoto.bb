SUMMARY = "Remote command executor using ssh and Python in the remote end"
DESCRIPTION = "Remote command executor using ssh and Python in the remote end. This \
package is primarily built to support the ceph-deploy project. \
python-remoto is built upon python-execnet which manages the \
connections and processes."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "python311-remoto-1.2.1-1.5.noarch.rpm"
RPM_HASH = "2152e28a8ab20fe24d9332e92d6ee0fff4241fee17c4b5093a610ff24daef1133a4185ec5ffc4786db7d042882a0f03357bb2500081d7927b53c87b8525f1a8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-remoto \
python311-remoto \
python3dist-remoto"

RDEPENDS:${PN} += "python-abi \
python311-execnet"

inherit rpm
