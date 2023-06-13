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

RPM_NAME = "qgit-2.10-1.7.aarch64.rpm"
RPM_HASH = "a687687e073748a5c9d1cf7b78e3efcc833983e7029adc8563162ea0c4404565f91bec4afe972bf4eb9691358f5ec49de383adaca57229eb7bd1834595b6ce4f"

RPROVIDES:${PN} += "application() \
application(qgit.desktop) \
metainfo() \
metainfo(qgit.appdata.xml) \
qgit \
qgit(aarch-64)"

RDEPENDS:${PN} += "git-core \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
