SUMMARY = "Pagure web interface theme used on Pagure.io"
DESCRIPTION = "This package provides the web interface assets for styling \
a Pagure server with the same look and feel as Pagure.io."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.13.3"

RPM_NAME = "pagure-theme-pagureio-5.13.3-1.4.noarch.rpm"
RPM_HASH = "b1e1848e670e8975bf88bcf53e7e39b6358231d61480878614479926b70c0fd42bbf338784d021d36e09b74711fb1f5b5cdf1c5c3eabc57453ed1677d4ab8d34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pagure-theme-pagureio"
RDEPENDS:${PN} += "pagure"

inherit rpm
