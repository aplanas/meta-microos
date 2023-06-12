SUMMARY = "Manual for axis"
DESCRIPTION = "Manual for axis"
LICENSE = "Apache-2.0"

PV = "1.4"

RPM_NAME = "axis-manual-1.4-306.6.noarch.rpm"
RPM_HASH = "6f2c14ef10be99984348c9bf99a207b4962ed055efeecadf8317008ff321f97c0f855aae0a1062d947bd2cab5a0086f54095bcc299f79db5dc4616d1f7e02e63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "axis-manual"
RDEPENDS:${PN} += ""

inherit rpm
