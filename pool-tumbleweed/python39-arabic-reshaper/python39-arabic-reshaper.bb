SUMMARY = "Python module for formatting Arabic sentences"
DESCRIPTION = "A module for reconstructing Arabic sentences that are to be used in \
applications that do not support Arabic."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python39-arabic-reshaper-3.0.0-2.1.noarch.rpm"
RPM_HASH = "5219257c4352987b6c3613ceade15bc3c237e3fd3440d5b308b19b41d253d40337729e5019ecde184ce805876c9edccafde2a6aeb00e6fea78e84863b63315b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-arabic-reshaper \
python39-arabic-reshaper \
python3dist-arabic-reshaper"

RDEPENDS:${PN} += "python-abi"

inherit rpm
