SUMMARY = "Python multiprocessing fork"
DESCRIPTION = "billiard is a fork of the Python 2.7 multiprocessing package. The \
multiprocessing package itself is a renamed and updated version of \
R. Oudkerk's pyprocessing package. This standalone variant is \
compatible with Python 2.4 and 2.5, and will draw its \
fixes/improvements from python-trunk."
LICENSE = "BSD-3-Clause"

PV = "4.1.0"

RPM_NAME = "python311-billiard-4.1.0-1.3.noarch.rpm"
RPM_HASH = "654ba8fd20a82b254a426cef19dc880286180a6ff3fbe71f871495593d30908d846224c2359b7e41480c0f40bd4e3aef26e268d46bcf8a364e0be68aec94b1e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(billiard) \
python311-billiard \
python3dist(billiard)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
