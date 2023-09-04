SUMMARY = "Translucent persistent objects"
DESCRIPTION = "This package contains the files needed for binding the python311-persistent C module."
LICENSE = "ZPL-2.1"

PV = "5.0"

RPM_NAME = "python311-persistent-devel-5.0-3.1.aarch64.rpm"
RPM_HASH = "3e849f3a184b1a91cc198600ce11013006f9d350a792ddb3fefefbd8fa8b7a44a53b5b691025cf0127c7b6aba799683c270a739b302b2a0a7694f0dff021b54a"

RPROVIDES:${PN} += "python3-persistent-devel \
python311-persistent-devel"

RDEPENDS:${PN} += "python311-devel \
python311-persistent"

inherit rpm
