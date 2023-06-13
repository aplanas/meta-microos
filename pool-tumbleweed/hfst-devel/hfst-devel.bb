SUMMARY = "Development files for the Helsinki Finite-State Transducer"
DESCRIPTION = "The Helsinki Finite-State Transducer software is intended for the \
implementation of morphological analyzers and other tools which are \
based on weighted and unweighted finite-state transducer technology. \
 \
This subpackage contains the files necessary to build programs that \
want to make use of the HFST library."
LICENSE = "GPL-3.0-only"

PV = "3.15.4"

RPM_NAME = "hfst-devel-3.15.4-1.3.aarch64.rpm"
RPM_HASH = "5882cfb79c5310ff7c4ea04a95b67f4f9d08a911fe39b96f326b15e471cf5df9ddf6fc1cc646873e6a1a9e125aac00ede46afc5e084368d720e43f72c66ea588"

RPROVIDES:${PN} += "hfst-devel \
hfst-devel(aarch-64) \
pkgconfig(hfst)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libhfst53"

inherit rpm
