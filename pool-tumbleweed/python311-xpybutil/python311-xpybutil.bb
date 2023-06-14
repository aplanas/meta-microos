SUMMARY = "Abstraction over xpyb"
DESCRIPTION = "xpybutil is an abstraction over the X Python Binding (xpyb). It exists because xpyb is a very low level library that communicates with X."
LICENSE = "WTFPL"

PV = "0.0.6"

RPM_NAME = "python311-xpybutil-0.0.6-1.14.noarch.rpm"
RPM_HASH = "3b04f764a054fb70da410e93b48f10f98cf309f8c16ecbc8fb25c1c3b09fd86dee90e5386c6b8c6ec7dba505973812a1cc962861a14869b44c6b65c5dc20ce08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-xpybutil \
python311-xpybutil \
python3dist-xpybutil"

RDEPENDS:${PN} += "python-abi \
python311-xcffib"

inherit rpm
