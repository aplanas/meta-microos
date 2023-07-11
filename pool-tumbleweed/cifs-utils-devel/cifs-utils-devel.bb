SUMMARY = "Files needed for building plugins for cifs-utils"
DESCRIPTION = "The SMB/CIFS protocol is a standard file sharing protocol widely deployed \
on Microsoft Windows machines. This package contains the header file \
necessary for building ID mapping plugins for cifs-utils."
LICENSE = "GPL-3.0-or-later"

PV = "7.0"

RPM_NAME = "cifs-utils-devel-7.0-2.4.aarch64.rpm"
RPM_HASH = "6ca680c728ce58e342797addbe51245400e9fdf8ad660a2321fbdc33560c906ab0555b814b045ffd8efee020928a406504a1232ca9706a26d8d3a61c82139a41"

RPROVIDES:${PN} += "cifs-utils-devel"

RDEPENDS:${PN} += ""

inherit rpm
