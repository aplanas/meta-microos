SUMMARY = "Mailman archiver plugin for HyperKitty"
DESCRIPTION = "Mailman archiver plugin for HyperKitty"
LICENSE = "GPL-3.0-only"

PV = "1.2.0"

RPM_NAME = "python39-mailman-hyperkitty-1.2.0-4.4.noarch.rpm"
RPM_HASH = "20004786b0dd7b6d6f96056f13c42cb31c5da9f9677785ea7c5574427e91630f98aec791e1a4457ad29c1ce6319eb30fabe509e7522675cf14f1ffdaf2204ba0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-mailman-hyperkitty"

RDEPENDS:${PN} += "python39-mailman \
python39-requests \
python39-setuptools \
python39-zope.interface"

inherit rpm
