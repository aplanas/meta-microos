SUMMARY = "Header files and development libraries for libXiterm"
DESCRIPTION = "Header files and development libraries for libXiterm"
LICENSE = "SUSE-CPL-0.5"

PV = "0.5.20040304"

RPM_NAME = "libXiterm-devel-0.5.20040304-301.9.aarch64.rpm"
RPM_HASH = "7e9205ac4814316610f897b68a994557f313a8bf3f1f1007d7b65828ae8a449c5893f4597602b9a1a5e49b11aeadfc5e2f7a04b31f9e91507f1ea36a4db578a4"

RPROVIDES:${PN} += "libXiterm-devel"

RDEPENDS:${PN} += "libXiterm1"

inherit rpm
