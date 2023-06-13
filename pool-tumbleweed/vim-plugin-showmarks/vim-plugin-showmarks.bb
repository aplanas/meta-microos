SUMMARY = "Visually shows the location of marks"
DESCRIPTION = "ShowMarks provides a visual representation of the location marks.  Marks are \
useful for jumping back and forth between interesting points in a buffer, but \
can be hard to keep track of without any way to see where you have placed them. \
ShowMarks hopefully makes life easier by placing a sign in the leftmost column \
of the buffer.  The sign indicates the label of the mark and its location.  It \
can be toggled on and off and individual marks can be hidden."
LICENSE = "SUSE-Public-Domain"

PV = "2.3"

RPM_NAME = "vim-plugin-showmarks-2.3-55.1.noarch.rpm"
RPM_HASH = "3aedd8c28f266d5d065a4f28df4c4e6da594ab337fd14f61bae3943855a5ab93f74f6f27e22b72b09c28de990d8fcaf79dd5d7d06427df1d10b9fa2b7ec2a2dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-showmarks"

RDEPENDS:${PN} += "vim"

inherit rpm
