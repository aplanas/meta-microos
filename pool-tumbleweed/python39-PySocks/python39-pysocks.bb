SUMMARY = "A Python SOCKS client module"
DESCRIPTION = "A Python SOCKS client module. \
 \
It is an actively maintained SocksiPy fork. Contains many \
improvements to the original. \
 \
See https://github.com/Anorov/PySocks for more information."
LICENSE = "BSD-3-Clause"

PV = "1.7.1"

RPM_NAME = "python39-PySocks-1.7.1-2.2.noarch.rpm"
RPM_HASH = "1833a845668021f39dd1e3e04166a27f75418506c7b6afd2a3d92d557c0d0c577e7620c52ba77dac262294137aa3e828572ff9c617a430c518fb4be20e6bca27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pysocks \
python39-PySocks \
python3dist-pysocks"

RDEPENDS:${PN} += "python-abi"

inherit rpm
