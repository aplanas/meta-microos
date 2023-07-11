SUMMARY = "Emacs Add-On to edit SGML/XML documents"
DESCRIPTION = "'psgml' supports you while editing SGML/XML documents.	It respects the \
context of the used DTD (Document Type Definition) and offers the valid \
elements and attributes. \
 \
Included are several helper tools: tdtd, xxml, psgml-xpointer. \
 \
For more info see README.openSUSE. \
 \
Compiled for GNU Emacs (XEmacs has its own version!). \
 \
 \
 \
Authors: \
-------- \
    James Clark <jjc@clark.com> \
    Lennart Staflin <lenst@lysator.liu.se> \
    David Megginson <dmeggins@sprynet.com> \
    Matthias Clasen <mclasen@sun2.mathematik.uni-freiburg.de> \
    François Pinard <pinard@iro.umontreal.ca> \
    etc."
LICENSE = "GPL-2.0-or-later & SUSE-Public-Domain"

PV = "1.4.1"

RPM_NAME = "psgml-1.4.1-5.12.noarch.rpm"
RPM_HASH = "d79ce23870efdb98fa2c18c36c6fbc2101c25c982d82b82860d7ea38ea4ba0bcb1d90309cde3743c7f2471f49a4f2b87f0aa7150f803fae63de611fc80183d68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "psgml"

RDEPENDS:${PN} += "/usr/bin/sh \
emacs-program"

inherit rpm
