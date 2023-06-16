SUMMARY = "Configuration file update handler"
DESCRIPTION = "etc-update  is  supposed  to be run after merging a new package to see if there \
are updates to the configuration files.  If a new configuration file will \
override an old one, etc-update will prompt the user for a decision. \
 \
etc-update will check all directories specified on the command line.  If no \
paths are given, then the CONFIG_PROTECT variable will be  used.   All  config \
files  found  in  CONFIG_PRO‐TECT_MASK will automatically be updated for you by \
etc-update."
LICENSE = "GPL-2.0-only"

PV = "2.3.31"

RPM_NAME = "etc-update-2.3.31-2.11.noarch.rpm"
RPM_HASH = "fcb2a726f99aa6cd4aed28ea28c95e0d4238c0cc5db581bdaf89f15bca9bf7135c64115dceac64175d0e952f014436ce384a4688fde9e311225c2e15c28a17aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-etc-update \
etc-update"

RDEPENDS:${PN} += "/usr/bin/bash \
bash"

inherit rpm
