SUMMARY = "Namecheap API client in Python"
DESCRIPTION = "Namecheap API client in Python"
LICENSE = "MIT"

PV = "0.0.3"

RPM_NAME = "python311-PyNamecheap-0.0.3-2.16.noarch.rpm"
RPM_HASH = "3710242235ba3263f369e419a826438f1e273f27aa43c9b5a598c01675b26b101301c17f99828a2a1f572aa69a6a3f23dedb54da4d1ca2a4bd42ca5385db989b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyNamecheap \
python3.11dist-pynamecheap \
python311-PyNamecheap \
python3dist-pynamecheap"

RDEPENDS:${PN} += "python-abi \
python311-requests"

inherit rpm
