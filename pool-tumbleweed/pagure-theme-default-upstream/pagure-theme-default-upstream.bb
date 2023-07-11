SUMMARY = "Configuration for pagure to default to the upstream web interface theme"
DESCRIPTION = "This package sets the default web interface assets used for \
a Pagure server running as shipped by upstream."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.13.3"

RPM_NAME = "pagure-theme-default-upstream-5.13.3-1.5.noarch.rpm"
RPM_HASH = "36c7f94048d22c30bdfdedd9809338580689c211b08ff692afc99d87afe88073f6bf5c1a14fd01b9894d9e37b763ba68b10700472f29a264657c9503d1933a51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pagure-theme-default \
pagure-theme-default-upstream"

RDEPENDS:${PN} += "pagure-theme-upstream"

inherit rpm
