SUMMARY = "Distribution utilities"
DESCRIPTION = "Python distribution utilities."
LICENSE = "Python-2.0"

PV = "0.3.6"

RPM_NAME = "python310-distlib-0.3.6-2.3.noarch.rpm"
RPM_HASH = "d06598f3bb35f194c403ae25801fd66ec979fa9e4e4cccff6076be512828d9b7f49b0047e5f9fb1a49af5687be0c0051c6e346fc942f897f9aa877617ee54a55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-distlib \
python310-distlib \
python3dist-distlib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
