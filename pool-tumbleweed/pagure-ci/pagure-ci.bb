SUMMARY = "A CI service for pagure"
DESCRIPTION = "Pagure comes with a continuous integration service, currently supporting \
only jenkins but extendable to others. \
With this service, your CI server will be able to report the results of the \
build on the pull-requests opened to your project."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.13.3"

RPM_NAME = "pagure-ci-5.13.3-1.5.noarch.rpm"
RPM_HASH = "a17d0c7f50e53b041f98b0bcc14597bbba3190de7d53f57682340e776e35969aab53779c3b2096c83984da5f743d848e412d9ee9a29553732082e96216a0175c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pagure-ci"

RDEPENDS:${PN} += "/usr/bin/sh \
pagure \
python3-python-jenkins \
systemd"

inherit rpm
