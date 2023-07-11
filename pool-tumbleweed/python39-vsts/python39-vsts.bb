SUMMARY = "Python wrapper around the VSTS APIs"
DESCRIPTION = "Python wrapper around the VSTS APIs"
LICENSE = "MIT"

PV = "0.1.25"

RPM_NAME = "python39-vsts-0.1.25-2.16.noarch.rpm"
RPM_HASH = "6838ec80747f939891e0aa602158c6117ded5959f80ed8725dc6c37c82a7bacd386ce3ad0aaa01039795e3a3148ec088e5e7cf0a92296e9d2aa83c65ae3a20d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-vsts \
python39-vsts \
python3dist-vsts"

RDEPENDS:${PN} += "python-abi \
python39-msrest"

inherit rpm
