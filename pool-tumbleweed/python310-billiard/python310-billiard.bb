SUMMARY = "Python multiprocessing fork"
DESCRIPTION = "billiard is a fork of the Python 2.7 multiprocessing package. The \
multiprocessing package itself is a renamed and updated version of \
R. Oudkerk's pyprocessing package. This standalone variant is \
compatible with Python 2.4 and 2.5, and will draw its \
fixes/improvements from python-trunk."
LICENSE = "BSD-3-Clause"

PV = "4.1.0"

RPM_NAME = "python310-billiard-4.1.0-1.3.noarch.rpm"
RPM_HASH = "45e5e1e1ea4bae4101b585eee39d429a4692726b5fc1efa00c801cad4bfd9b6109cf6438ae9044b8f9c6db43a6c1ae17372d86a0e0f9931bfd7bd736d7cbe005"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-billiard \
python3.10dist-billiard \
python310-billiard \
python3dist-billiard"

RDEPENDS:${PN} += "python-abi"

inherit rpm
