SUMMARY = "Library managing scores, trophies and unlockables"
DESCRIPTION = "ETrophy is a library that manages scores, trophies and unlockables. It will \
store them and provide views to display them. Could be used by games based \
on EFL."
LICENSE = "BSD-2-Clause"

PV = "0.5.1"

RPM_NAME = "etrophy-0.5.1-8.30.aarch64.rpm"
RPM_HASH = "3b5298f11bd43f125747163576caccfc3e4c451cec0d9a35b4fb8757afbb59fe299f1d1bc4b2dd9cf8dcb0e96c1c84cd5374bef0d65774c8cd4ad89a766a8113"

RPROVIDES:${PN} += "etrophy \
etrophy(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
