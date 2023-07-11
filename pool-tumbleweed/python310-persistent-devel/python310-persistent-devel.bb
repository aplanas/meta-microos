SUMMARY = "Translucent persistent objects"
DESCRIPTION = "This package contains the files needed for binding the python310-persistent C module."
LICENSE = "ZPL-2.1"

PV = "5.0"

RPM_NAME = "python310-persistent-devel-5.0-2.3.aarch64.rpm"
RPM_HASH = "5d13968f60cb893b5a74e5411b0fd5ca77bdd0f96380691246751d104adbae9664f5e66fa346f3bc5ecb64ad31441379330749f722fe50b4cb719764faf73518"

RPROVIDES:${PN} += "python310-persistent-devel"

RDEPENDS:${PN} += "python310-devel \
python310-persistent"

inherit rpm
