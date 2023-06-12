SUMMARY = "Getting started with GNOME - Documentation"
DESCRIPTION = "This package contains the Getting Started guide which is packaged and \
shipped as gnome-getting-started-docs in the core GNOME distribution."
LICENSE = "CC-BY-SA-3.0"

PV = "3.38.1"

RPM_NAME = "gnome-getting-started-docs-3.38.1-1.7.noarch.rpm"
RPM_HASH = "e656fff89eb6c322b50af47c84344a9bfa2edded7755e949b23eb2cfb147b3eca0deb0dea3a63a1b6c99c27e3a70d878f867a98c109ec6de2c02ea800bba3a3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-getting-started-docs"
RDEPENDS:${PN} += "yelp"

inherit rpm
