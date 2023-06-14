SUMMARY = "Remote command executor using ssh and Python in the remote end"
DESCRIPTION = "Remote command executor using ssh and Python in the remote end. This \
package is primarily built to support the ceph-deploy project. \
python-remoto is built upon python-execnet which manages the \
connections and processes."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "python39-remoto-1.2.1-1.5.noarch.rpm"
RPM_HASH = "cafb31983b79b1f2789b083d67d0a22817699b9466fdc3fbff92db18178ee9f4b2ba600e9ca6c8267d7d21fd3827316701852d2739f3eb70d3d957e31726b0f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-remoto \
python39-remoto \
python3dist-remoto"

RDEPENDS:${PN} += "python-abi \
python39-execnet"

inherit rpm
