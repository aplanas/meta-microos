SUMMARY = "Remote command executor using ssh and Python in the remote end"
DESCRIPTION = "Remote command executor using ssh and Python in the remote end. This \
package is primarily built to support the ceph-deploy project. \
python-remoto is built upon python-execnet which manages the \
connections and processes."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "python310-remoto-1.2.1-1.7.noarch.rpm"
RPM_HASH = "5b65c27715701fb9cc3fcba50e8aae9e7ed5fcf69fc74cac18fd562961c3ea6337a2cb77ca27cf1cd5fcf6ef1ad07bf5c871ddddbccb3acfce2189665cffdfc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-remoto \
python310-remoto \
python3dist-remoto"

RDEPENDS:${PN} += "python-abi \
python310-execnet"

inherit rpm
