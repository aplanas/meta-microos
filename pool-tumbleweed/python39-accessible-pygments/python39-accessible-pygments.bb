SUMMARY = "A collection of accessible pygments styles"
DESCRIPTION = "A collection of accessible pygments styles"
LICENSE = "BSD-3-Clause"

PV = "0.0.4"

RPM_NAME = "python39-accessible-pygments-0.0.4-1.4.noarch.rpm"
RPM_HASH = "49751bf066fe8108c3ff73bd4f95d45404edf6557205c79ce3b4cf5b1b57389100c38f8ba6c8ebffb03c72321d1a891ec970fd1b2855f4cadd8138ab9ebc6e9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-accessible-pygments \
python39-accessible-pygments \
python3dist-accessible-pygments"

RDEPENDS:${PN} += "python-abi \
python39-pygments"

inherit rpm
