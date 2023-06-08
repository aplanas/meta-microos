SUMMARY = "Documentation for the FOX Toolkit 1.6"
DESCRIPTION = "FOX is a C++-based library for graphical user interface development. \
 \
The doc subpackage contains the HTML documentation to the FOX toolkit 1.6."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.57"

RPM_NAME = "fox16-doc-1.6.57-2.1.noarch.rpm"
RPM_HASH = "3bc0c7df4e3e84add92ec3468467aeb6cb7d409726229f49c388a21425134081f77f2d4132535e627d99b24bfe24e72d0cbab3e007c6d249a0164fcaa15a9df2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fox16-doc"
RDEPENDS:${PN} += ""

inherit rpm
