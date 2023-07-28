SUMMARY = "Visually shows the location of marks"
DESCRIPTION = "ShowMarks provides a visual representation of the location marks.  Marks are \
useful for jumping back and forth between interesting points in a buffer, but \
can be hard to keep track of without any way to see where you have placed them. \
ShowMarks hopefully makes life easier by placing a sign in the leftmost column \
of the buffer.  The sign indicates the label of the mark and its location.  It \
can be toggled on and off and individual marks can be hidden."
LICENSE = "SUSE-Public-Domain"

PV = "2.3"

RPM_NAME = "vim-plugin-showmarks-2.3-56.1.noarch.rpm"
RPM_HASH = "2fe31e2b472d138c8cfba3ba7638bea605b7d5c884c6f68a65aab7b4ce5b23ebf5c0e0b6b7a376dc35ed5b7726d8526f99ffe2505dd7fd1e2e8e1d3e4d98cfb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-showmarks"

RDEPENDS:${PN} += "vim"

inherit rpm
