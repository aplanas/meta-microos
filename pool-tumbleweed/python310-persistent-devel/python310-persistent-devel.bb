SUMMARY = "Translucent persistent objects"
DESCRIPTION = "This package contains the files needed for binding the python310-persistent C module."
LICENSE = "ZPL-2.1"

PV = "5.0"

RPM_NAME = "python310-persistent-devel-5.0-3.1.aarch64.rpm"
RPM_HASH = "28c7674e8a37b8cdf720d79a1cd5a8fe656c0f1f33bd4113c490a4d9098926cc40ec70dd413039aab500d47b79ba8a6a89d4aa749841aee09003da7720243c69"

RPROVIDES:${PN} += "python310-persistent-devel"

RDEPENDS:${PN} += "python310-devel \
python310-persistent"

inherit rpm
