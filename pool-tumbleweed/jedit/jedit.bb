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

RPM_NAME = "jedit-5.5.0-5.9.noarch.rpm"
RPM_HASH = "86bbc3eee83645b1a818f169e603bdd8addcd1db29f6b9f3edcedfcb0d273b55061cacdd0afad83a993204264a20a37a9602476c5b6c5f2d35fcbf644c038268"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jedit"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
