SUMMARY = "Viewer for info-files"
DESCRIPTION = "TkInfo is a tk script to read GNU 'info' files and display them. TkInfo \
can be used stand-alone (via WISH) or embedded within an application to \
provide integrated, online help. \
 \
 \
 \
Authors: \
-------- \
    Axel Boldt <boldt@math.ucsb.edu>"
LICENSE = "SUSE-Public-Domain"

PV = "2.11"

RPM_NAME = "tkinfo-2.11-1.8.noarch.rpm"
RPM_HASH = "87cd1cf832779f167e1e06836c7b6046419a7b3533987854d46f952870d0dbc3c9998092e830a0822e9205ab82009a225c259e5d7f5a7ceb77d977ec1a13dce6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tkinfo"

RDEPENDS:${PN} += "/usr/bin/wish"

inherit rpm
