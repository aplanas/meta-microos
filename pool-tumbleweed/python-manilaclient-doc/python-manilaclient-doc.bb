SUMMARY = "Documentation for OpenStack Share API Client"
DESCRIPTION = "Client library and command line utility for interacting with Openstack \
Share API. \
This package contains auto-generated documentation."
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "python-manilaclient-doc-4.2.0-1.5.noarch.rpm"
RPM_HASH = "03965a00893054406f57cf4bfc1409b66e1bde50cc5b0da109b1af001aeb67c558a71f41749c06a050048d909d70c796314a3ad497b27179e0a4b031c7e320f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-manilaclient-doc"

RDEPENDS:${PN} += ""

inherit rpm
