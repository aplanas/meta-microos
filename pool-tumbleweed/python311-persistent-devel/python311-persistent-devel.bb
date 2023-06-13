SUMMARY = "Translucent persistent objects"
DESCRIPTION = "This package contains the files needed for binding the python311-persistent C module."
LICENSE = "ZPL-2.1"

PV = "5.0"

RPM_NAME = "python311-persistent-devel-5.0-1.4.aarch64.rpm"
RPM_HASH = "d89b376ce0f53aa0b65703a8a9648c8c5d2b0f29d250b0b498aba07a0f0d57f43b7a3d917f1810afca721be80ad9ae3a5e52f8b17e2925e222b40f0e9516b28d"

RPROVIDES:${PN} += "python311-persistent-devel \
python311-persistent-devel(aarch-64)"

RDEPENDS:${PN} += "python311-devel \
python311-persistent"

inherit rpm
