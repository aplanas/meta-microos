SUMMARY = "Versatile Tree-Style Outliner for Defining Custom Data Schemas"
DESCRIPTION = "TreeLine is a versatile tool for working with all kinds of information \
that fit into a tree-like structure. \
 \
It can be used to edit bookmark files, create mini-databases (for \
example, for addresses, tasks, records, or CDs), outline documents, or \
just collect ideas. It can also be used as a generic editor for XML \
files. \
 \
The data schemas for any node in the data tree can be customized and \
new types of nodes can be defined. The way data is presented on the \
screen, exported to HTML, or printed can be defined with HTML-like \
templates. Plug-ins can be written to load and save data from and to \
custom file formats or external data sources and extend the \
functionality of TreeLine. \
 \
TreeLine is written in Python and uses the PyQt bindings to the Qt \
toolkit, which makes it very portable."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.5"

RPM_NAME = "treeline-3.1.5-1.4.noarch.rpm"
RPM_HASH = "cd23ed4a769980f0fc52bafb684b4b001ea7a371c5d8c51bbb0635a48b086a6a417da926b89bc571d420e48436173a2c64caeca9df345e2fd4296d69ab8ce511"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "treeline"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python3-qt5"

inherit rpm
