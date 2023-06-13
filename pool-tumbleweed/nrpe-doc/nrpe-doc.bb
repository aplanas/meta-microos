SUMMARY = "Nagios Remote Plug-In Executor documentation"
DESCRIPTION = "This package contains the README files, OpenOffice and PDF \
documentation for the remote plugin executor (NRPE) for Nagios."
LICENSE = "GPL-2.0-or-later"

PV = "4.0.3"

RPM_NAME = "nrpe-doc-4.0.3-5.3.noarch.rpm"
RPM_HASH = "11f62618eb731428b7176d77619c9d341d823dd9ad5327614bb2693aac398a107ae29903bd1a42d3523479b81fd7af71989992f054363ba0578baaa1f143f130"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nagios-nrpe-doc \
nrpe-doc"

RDEPENDS:${PN} += ""

inherit rpm
