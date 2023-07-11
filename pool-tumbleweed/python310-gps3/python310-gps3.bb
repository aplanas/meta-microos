SUMMARY = "Python interface for gpsd"
DESCRIPTION = "Python interface for gpsd."
LICENSE = "MIT"

PV = "0.33.3+git.20171101"

RPM_NAME = "python310-gps3-0.33.3+git.20171101-1.20.noarch.rpm"
RPM_HASH = "2da97bfb14e8f78eed62825d79d0d2560f96a7f80dac743adbe3091a82ddf5b7a8118841d3117c17882bcc010f72e7ac0d1d8fbac52f6cecf92402b55c61c7fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-gps3 \
python310-gps3 \
python3dist-gps3"

RDEPENDS:${PN} += "python-abi"

inherit rpm
