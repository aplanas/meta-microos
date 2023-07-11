SUMMARY = "Small library to dynamically create python functions"
DESCRIPTION = "Small library to dynamically create python functions."
LICENSE = "BSD-3-Clause"

PV = "1.15.1"

RPM_NAME = "python311-makefun-1.15.1-2.4.noarch.rpm"
RPM_HASH = "d5a90fe228461dc24a50e35c20c15404a3a87b1c44124ca8b1960aa0de58ee20f7c7c0c00091f341b775c9fe4056c86f7091c322d79dff5afddfbf4657f99bce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-makefun \
python3.11dist-makefun \
python311-makefun \
python3dist-makefun"

RDEPENDS:${PN} += "python-abi"

inherit rpm
