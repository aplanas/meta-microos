SUMMARY = "Abstraction over xpyb"
DESCRIPTION = "xpybutil is an abstraction over the X Python Binding (xpyb). It exists because xpyb is a very low level library that communicates with X."
LICENSE = "WTFPL"

PV = "0.0.6"

RPM_NAME = "python39-xpybutil-0.0.6-1.14.noarch.rpm"
RPM_HASH = "941dd071b252e8b93c242abf02b2a965a3c104a814d8441dc953be30eb116ea10c7cc87c2a2d02c8f9b45f9e8530bc3f1112a4fc6d7f1371ba622e7bbf57f256"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-xpybutil \
python39-xpybutil \
python3dist-xpybutil"

RDEPENDS:${PN} += "python-abi \
python39-xcffib"

inherit rpm
