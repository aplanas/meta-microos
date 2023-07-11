SUMMARY = "Programmer's Text Editor Written in Java"
DESCRIPTION = "jEdit is a cross-platform programmer's text editor written in Java. \
Some of jEdit's features include: \
 \
* Built-in macro language (BeanShell). \
* Extensible plug-in architecture with more than 80 plug-ins \
   available. \
* Plug-ins can be downloaded and installed from within jEdit using \
   the plug-in manager feature. \
* Syntax highlighting for more than 80 languages. \
* Supports a large number of character encodings including UTF8 and \
   Unicode. \
* Auto-indenting of source code. \
* Folding (indent and marker based). \
* Word wrap. \
* Unlimited undo and redo. \
* Highly configurable and customizable. \
* Every other feature, both basic and advanced, that you would expect \
to find in a text editor."
LICENSE = "GPL-2.0-or-later"

PV = "5.5.0"

RPM_NAME = "jedit-5.5.0-5.10.noarch.rpm"
RPM_HASH = "c688155a24e2b6e55f16eab6989495f9c14aa343e2352cfd2c1ed6491f2b085442ad66f024842ffa008c664fe9fab00edb43e26fed19b4c8e6363e8ba2f44f38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jedit"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
