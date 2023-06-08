SUMMARY = "Color filesystem layout"
DESCRIPTION = "This package provides directories and rpm macros that are required/used to store color management data for many applications."
LICENSE = "SUSE-Public-Domain"

PV = "1"

RPM_NAME = "color-filesystem-1-13.16.noarch.rpm"
RPM_HASH = "e49b50b233c53b0be80310fede363785f2c4f873927d5dfa206b76f8c0fa4a186ccfdab10f39c4f2efaf532f2e98590e75d84eb94af5409968a21647f5f43f00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "color-filesystem icc-dirs"
RDEPENDS:${PN} += "filesystem rpm"

inherit rpm
