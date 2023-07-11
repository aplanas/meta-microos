SUMMARY = "Abstraction over xpyb"
DESCRIPTION = "xpybutil is an abstraction over the X Python Binding (xpyb). It exists because xpyb is a very low level library that communicates with X."
LICENSE = "WTFPL"

PV = "0.0.6"

RPM_NAME = "python39-xpybutil-0.0.6-1.16.noarch.rpm"
RPM_HASH = "87facd722cb52f20eadafa7598c4f1d353beb3c0fe099c61c4ad2e85d13e445f30bfa9939a62c7523a077363a84ae6e11c46649bd42c3a897fb5150b361a0d34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-xpybutil \
python39-xpybutil \
python3dist-xpybutil"

RDEPENDS:${PN} += "python-abi \
python39-xcffib"

inherit rpm
