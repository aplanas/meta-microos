SUMMARY = "Python extension for the tempfile module"
DESCRIPTION = "A small Python extension for the tempfile module."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python311-volatile-2.1.0-1.13.noarch.rpm"
RPM_HASH = "678e38df71e2c0df401c7abcb009fd0375d98301084d33084bb186c263df610800a966953da0ffbe2b0821f0aefa067e85a55ecb149c10f1f8e11120ddefe55b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-volatile \
python3.11dist-volatile \
python311-volatile \
python3dist-volatile"

RDEPENDS:${PN} += "python-abi"

inherit rpm
