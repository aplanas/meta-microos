SUMMARY = "Translucent persistent objects"
DESCRIPTION = "This package contains the files needed for binding the python311-persistent C module."
LICENSE = "ZPL-2.1"

PV = "5.0"

RPM_NAME = "python311-persistent-devel-5.0-2.3.aarch64.rpm"
RPM_HASH = "0787731faa0b788bac6d486fbbcf89a16020030238a231c05aa194e4769f18bef9b3f03523fef264874c983d7a85c470448909b7da277bcb07de50a3fb8da1f4"

RPROVIDES:${PN} += "python3-persistent-devel \
python311-persistent-devel"

RDEPENDS:${PN} += "python311-devel \
python311-persistent"

inherit rpm
