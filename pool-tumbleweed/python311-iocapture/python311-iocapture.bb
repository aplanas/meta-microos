SUMMARY = "Python module to capture stdout, stderr"
DESCRIPTION = "A Python module to capture stdout, stderr with iocapture."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python311-iocapture-0.1.2-2.14.noarch.rpm"
RPM_HASH = "51bdd4fa407d50bba1d052000e1648e2bbc3e6a3d77d7702cb02799dd85b9c4d6bb6d5d5d9cc595041b51f878f88bc1609389d719bab4f9374e180ed04bd3cc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(iocapture) \
python311-iocapture \
python3dist(iocapture)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
