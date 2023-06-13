SUMMARY = "Examples for jzlib"
DESCRIPTION = "Examples for jzlib."
LICENSE = "BSD-3-Clause"

PV = "1.1.3"

RPM_NAME = "jzlib-demo-1.1.3-5.6.noarch.rpm"
RPM_HASH = "5b36afd24f5bce769f4597f99fc279ac58648178ff47a56f6681bdf159a838199c60e54560affa56adbe82fc3cd09be52c20a2b2f5ac0bc6731075d7823acfe3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jzlib-demo"

RDEPENDS:${PN} += "jzlib"

inherit rpm
