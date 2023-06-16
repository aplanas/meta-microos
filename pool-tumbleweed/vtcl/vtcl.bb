SUMMARY = "Visual Tcl"
DESCRIPTION = "Visual Tcl is a freely-available, high-quality application development \
environment for UNIX, Windows, and Macintosh platforms. Writing \
entirely in Tcl and generating pure Tcl should make porting either \
unnecessary or trivial. \
 \
 \
 \
Authors: \
-------- \
    Stewart Allen <stewart@neuron.com>"
LICENSE = "GPL-2.0+"

PV = "1.6.1a1"

RPM_NAME = "vtcl-1.6.1a1-196.16.noarch.rpm"
RPM_HASH = "94964a5a95611a47f62cb13054189554a3c054f013fcb800db27aee7dcc7a7c711831028a8dceec4f494e4328509759db013e66bf38a7ff9924b14b517b727ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vtcl"

RDEPENDS:${PN} += "/usr/bin/sh \
tcl \
tix \
tk \
xdg-utils"

inherit rpm
