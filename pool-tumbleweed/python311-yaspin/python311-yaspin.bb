SUMMARY = "Yet Another Terminal Spinner"
DESCRIPTION = "Yet Another Terminal Spinner."
LICENSE = "MIT"

PV = "0.18.0"

RPM_NAME = "python311-yaspin-0.18.0-1.14.noarch.rpm"
RPM_HASH = "fa0efd32e70e7102fbe9945e8d359ffaeba491a49eed2d4deceb370126ef1598365df8defd8c854a9ec55117e17943124571bde9a9b88217645a8ba6cb26e02e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-yaspin \
python3.11dist-yaspin \
python311-yaspin \
python3dist-yaspin"

RDEPENDS:${PN} += "python-abi"

inherit rpm
