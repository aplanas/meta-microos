SUMMARY = "Convenience package for a single-instance setup"
DESCRIPTION = "Use this package to setup a local instance with all services provided together."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1685738164.28716cd"

RPM_NAME = "openQA-single-instance-4.6.1685738164.28716cd-1.1.aarch64.rpm"
RPM_HASH = "0a3681ae5d57c202996fa67f02ed04ef21a5f9037c0e44195cf1312a7d7229972bd6ff915057229ada09e4f45f0106dcffab05fc4dcda34c90270e17db96123e"

RPROVIDES:${PN} += "openQA-single-instance"

RDEPENDS:${PN} += "apache2 \
openQA \
openQA-local-db \
openQA-worker"

inherit rpm
