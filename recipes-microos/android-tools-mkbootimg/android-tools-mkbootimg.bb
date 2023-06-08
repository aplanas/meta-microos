SUMMARY = "Android boot.img manipulation tools"
DESCRIPTION = "This package contains the Android boot.img manipulation tools."
LICENSE = "Apache-2.0 & MIT"

PV = "34.0.0"

RPM_NAME = "android-tools-mkbootimg-34.0.0-1.2.noarch.rpm"
RPM_HASH = "58a20e305771ea4d3ff9776f36290e02172f79242e416af5e03c1e1deaafddf623afa985e4c477f7d212ec34b5cd5fdcebbd9a364c1b4e7db4ebb1578128374d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "android-tools-mkbootimg"
RDEPENDS:${PN} += "/usr/bin/python3 android-tools python3"

inherit rpm
