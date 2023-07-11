SUMMARY = "Graphical Git Repository Viewer"
DESCRIPTION = "QGit is a git GUI viewer built on Qt/C++. \
 \
With qgit you will be able to browse revisions history, view patch \
content and changed files, graphically following different development \
branches. \
 \
Features \
 \
- View revisions, diffs, files history, files annotation, archive tree. \
 \
- Commit changes visually cherry picking modified files. \
 \
- Apply or format patch series from selected commits, drag and drop \
commits between two instances of qgit. \
 \
- Associate commands sequences, scripts and anything else executable to \
a custom action. Actions can be run from menu and corresponding output \
is grabbed by a terminal window. \
 \
- qgit implements a GUI for the most common StGIT commands like push/pop \
and apply/format patches. You can also create new patches or refresh \
current top one using the same semantics of git commit,  i.e. cherry \
picking single modified files."
LICENSE = "GPL-2.0-or-later"

PV = "2.10"

RPM_NAME = "qgit-2.10-1.8.aarch64.rpm"
RPM_HASH = "ef3e2d5680fd02308eb2dc71de71d137f8dc62097b334b440e598bf0f2eca036b998ccabb5e11ba3ed91dd819fc58adc566eaa829754bfcf19d4003581e0560b"

RPROVIDES:${PN} += "qgit"

RDEPENDS:${PN} += "git-core \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
