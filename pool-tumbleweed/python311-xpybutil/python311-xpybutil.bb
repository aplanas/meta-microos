SUMMARY = "Abstraction over xpyb"
DESCRIPTION = "xpybutil is an abstraction over the X Python Binding (xpyb). It exists because xpyb is a very low level library that communicates with X."
LICENSE = "WTFPL"

PV = "0.0.6"

RPM_NAME = "python311-xpybutil-0.0.6-1.16.noarch.rpm"
RPM_HASH = "372ac59053cae19c8c1a5819076e78bb3710d551c39b53000b135d983fb804c1ca1ccc2eae44bcf888e50b1cc3e36a7f0295d7669a08fcd1130ad6cd83a26950"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xpybutil \
python3.11dist-xpybutil \
python311-xpybutil \
python3dist-xpybutil"

RDEPENDS:${PN} += "python-abi \
python311-xcffib"

inherit rpm
