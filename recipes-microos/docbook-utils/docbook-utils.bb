SUMMARY = "Small Wrapper Scripts for Processing DocBook Files"
DESCRIPTION = "The docbook-utils package is a set of a few small programs intended to \
ease everyday use of technical documentation software based on the \
DocBook DTD, either written in SGML or XML. \
 \
Tasks they currently accomplish are: * jw: convert SGML files to \
   other formats (HTML, RTF, PostScript, PDF) \
 \
* sgmldiff: detect the differences in markup between two SGML files"
LICENSE = "LGPL-2.1+"

PV = "0.6.14"

RPM_NAME = "docbook-utils-0.6.14-239.16.noarch.rpm"
RPM_HASH = "47b8647c3cc22dbee0e3f9712bc3275c9fbea524493ad1ca0323aadf6271d872e435066acaff73a04242f27a2eb0ab9a09612e41d568beda7d14dd6468adf6ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docbook-utils"
RDEPENDS:${PN} += "/bin/sh docbook-utils-minimal texlive-jadetex"

inherit rpm
