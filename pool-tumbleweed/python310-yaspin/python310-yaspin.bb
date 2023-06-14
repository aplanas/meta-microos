SUMMARY = "Yet Another Terminal Spinner"
DESCRIPTION = "Yet Another Terminal Spinner."
LICENSE = "MIT"

PV = "0.18.0"

RPM_NAME = "python310-yaspin-0.18.0-1.12.noarch.rpm"
RPM_HASH = "28e81f52b60a36c367367e42339e638e4056fd3577f1ebd1e3d08e337f4296ed1e96572eca64c707c7124e4fd3dc46826dc3dcb3ec82b7d87b6759b184574911"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-yaspin \
python3.10dist-yaspin \
python310-yaspin \
python3dist-yaspin"

RDEPENDS:${PN} += "python-abi"

inherit rpm
