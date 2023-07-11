SUMMARY = "C++ SyncML Client Engine"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to compile and develop applications that use libfunambol."
LICENSE = "AGPL-3.0"

PV = "9.0.1"

RPM_NAME = "libfunambol-devel-9.0.1-16.25.aarch64.rpm"
RPM_HASH = "3fd853832b1b4f0c59dbd98cc7d77d15429b2845c60c0eba0ea827974c6aa964848486e43ce69a368f1b8e6c3740559fc333270a3b082a587afa1902077cb803"

RPROVIDES:${PN} += "libfunambol-devel \
pkgconfig-libfunambol"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcurl-devel \
libfunambol-9-0-1"

inherit rpm
