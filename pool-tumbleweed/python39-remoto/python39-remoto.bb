SUMMARY = "Remote command executor using ssh and Python in the remote end"
DESCRIPTION = "Remote command executor using ssh and Python in the remote end. This \
package is primarily built to support the ceph-deploy project. \
python-remoto is built upon python-execnet which manages the \
connections and processes."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "python39-remoto-1.2.1-1.7.noarch.rpm"
RPM_HASH = "2d7a76121e35c91f4e6b4851a48c78bca1725e443b7912642e40e738d8a66f3a26da81fcafbc9bee0e8d32865efc385d04ea492b8fabba8782588fd2ad97e8b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-remoto \
python39-remoto \
python3dist-remoto"

RDEPENDS:${PN} += "python-abi \
python39-execnet"

inherit rpm
