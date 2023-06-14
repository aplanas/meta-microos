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

RPM_NAME = "treeline-3.1.5-1.3.noarch.rpm"
RPM_HASH = "9c42d759992cc2f1e3141095c356dce24da97b235dc0625b53b7fb485372f25f6c1ffcdda9bb639d29eac1dd27433a0a8572cba80d4bdd2a4257f2353fc91087"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "treeline"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
python3-qt5"

inherit rpm
