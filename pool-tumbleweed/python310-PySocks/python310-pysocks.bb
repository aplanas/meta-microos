SUMMARY = "A Python SOCKS client module"
DESCRIPTION = "A Python SOCKS client module. \
 \
It is an actively maintained SocksiPy fork. Contains many \
improvements to the original. \
 \
See https://github.com/Anorov/PySocks for more information."
LICENSE = "BSD-3-Clause"

PV = "1.7.1"

RPM_NAME = "python310-PySocks-1.7.1-2.2.noarch.rpm"
RPM_HASH = "4e740de691dfb6c8e028de68ac1fe3cd12784dd821858b51fafe732de1c2527a0af9feb576c0839eeabbbcdfad306c6e71ba6f7086ca99ca7bcae8a4d1a2c6f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pysocks \
python310-PySocks \
python3dist-pysocks"

RDEPENDS:${PN} += "python-abi"

inherit rpm
