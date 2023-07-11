SUMMARY = "Importing Python modules by physical file path"
DESCRIPTION = "Importing Python modules by physical file path."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "python39-magicalimport-0.9.1-2.10.noarch.rpm"
RPM_HASH = "b8cacbfeb6dfccfe78bb474abe7a0b10c9b7a622156a1c53d4ca414bcc255c444abf1ce7e32f24958b73e2e79d574da30ba56c586d31185afb6be26723a582cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-magicalimport \
python39-magicalimport \
python3dist-magicalimport"

RDEPENDS:${PN} += "python-abi"

inherit rpm
