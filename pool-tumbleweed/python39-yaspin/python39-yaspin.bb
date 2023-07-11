SUMMARY = "Yet Another Terminal Spinner"
DESCRIPTION = "Yet Another Terminal Spinner."
LICENSE = "MIT"

PV = "0.18.0"

RPM_NAME = "python39-yaspin-0.18.0-1.14.noarch.rpm"
RPM_HASH = "d6dcffd723a3c80961e124af7e6de1e4734d369ccdd3a287ed56d48838537c9bf808c2d892eb08acfe82bcdbcc05140320ae89cf14b14d123580e677c4787a07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-yaspin \
python39-yaspin \
python3dist-yaspin"

RDEPENDS:${PN} += "python-abi"

inherit rpm
