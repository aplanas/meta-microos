SUMMARY = "Introspection/Debugging Tool for Qt Applications"
DESCRIPTION = "The KDAB State Machine Editor Library is a framework that can be used \
to help develop State Machine Editing graphical user \
interfaces and tools. Output from such applications is in metacode \
or QML that can then be used in Qt or QtQuick projects."
LICENSE = "LGPL-2.1-only"

PV = "1.2.8"

RPM_NAME = "kdstatemachineeditor-devel-1.2.8-2.18.aarch64.rpm"
RPM_HASH = "57d1fbe48e9f54d566f7ed36a569496800a553431f8f0447329171e282c6f8791732eecee745c67b58d2172972571b7569bb45ab6c8070a6f7a20fce4b2308fc"

RPROVIDES:${PN} += "cmake-KDSME \
kdstatemachineeditor \
kdstatemachineeditor-devel"

RDEPENDS:${PN} += "libkdstatemachineeditor-core1 \
libkdstatemachineeditor-debuginterfaceclient1 \
libkdstatemachineeditor-debuginterfacesource-static \
libkdstatemachineeditor-view1"

inherit rpm
