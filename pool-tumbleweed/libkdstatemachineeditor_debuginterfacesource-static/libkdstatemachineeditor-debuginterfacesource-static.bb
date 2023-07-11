SUMMARY = "KDAB State Machine Editor core library"
DESCRIPTION = "The KDAB State Machine Editor Library is a framework that can be used \
to help develop State Machine Editing graphical user \
interfaces and tools. Output from such applications is in metacode \
or QML that can then be used in Qt or QtQuick projects. \
 \
This package provides a static library that can be injected into a \
process running on the target in order to get information about the \
internal state machines."
LICENSE = "LGPL-2.1-only"

PV = "1.2.8"

RPM_NAME = "libkdstatemachineeditor_debuginterfacesource-static-1.2.8-2.18.aarch64.rpm"
RPM_HASH = "f2d3aff4523d0336e6ba7c11965863bd28cc2c4c6bef680483bcfa32d62e81214024aee512a9bc874602ad00b2840b21514d5d253b3a2172445fa24f41157478"

RPROVIDES:${PN} += "libkdstatemachineeditor-debuginterfacesource-static"

RDEPENDS:${PN} += ""

inherit rpm
