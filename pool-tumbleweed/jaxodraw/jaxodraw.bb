SUMMARY = "A Java-based GUI for drawing Feynman diagrams"
DESCRIPTION = "JaxoDraw is a Java program for drawing Feynman diagrams. It has a \
complete graphical user interface that allows to carry out all actions \
in a mouse click-and-drag fashion. Fine-tuning of the diagrams is \
possible through keyboard short-cuts. Graphs may be exported to a \
variety of image formats, including (encapsulated) postscript, and can \
be saved in XML files to be used in later sessions. \
 \
The main feature of JaxoDraw is the possibility of generating \
LaTeX code that makes use of J. Vermaseren's axodraw package to \
compile. In fact the main motivation for writing JaxoDraw was to \
create a graphical user interface for the axodraw package. In that \
way, we combine the power of LaTeX with the easiness of a \
what-you-see-is-what-you-get interface."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "2.1.0"

RPM_NAME = "jaxodraw-2.1.0-6.7.noarch.rpm"
RPM_HASH = "833d16687ba13e300eeb23662fb21fd63a99bdfc76f28641a1ff3a2a68b035e66a921b5dc63356a6b09900f06dbd055d2cb9d144f7063a779479ae6c00a4dc7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jaxodraw"

RDEPENDS:${PN} += "/usr/bin/sh \
java \
javapackages-tools"

inherit rpm
