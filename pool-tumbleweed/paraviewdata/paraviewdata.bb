SUMMARY = "Examples for Paraview"
DESCRIPTION = "ParaView is an application for visualizing large data sets. \
 \
ParaView runs on distributed and shared memory systems alike. It uses the \
Visualization Toolkit as the data processing and rendering engine, and has a \
user interface written using a blend of Tcl/Tk and C++. \
 \
This package contains some example data for Paraview."
LICENSE = "BSD-3-Clause"

PV = "5.8.0"

RPM_NAME = "paraviewdata-5.8.0-1.9.noarch.rpm"
RPM_HASH = "96c982baf12439f20b6841f81916542bf96bfeec66fe6ddf0f07f66384fd37dd2e1461efb4127161bae2f4dab0d1ebd07047224f26b388be34190ad1bfece589"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "paraviewdata"

RDEPENDS:${PN} += ""

inherit rpm
