SUMMARY = "Wrapper script to launch Compiz with proper options"
DESCRIPTION = "This script detects what options to pass to Compiz to get it \
started, and start a default plugin and possibly window decorator."
LICENSE = "GPL-2.0+"

PV = "0.7.0"

RPM_NAME = "compiz-manager-0.7.0-1.20.noarch.rpm"
RPM_HASH = "967bc64d6cd6c5b86cb0c422ea30f83f4871f4fa4bcc70632ade347340045a29a4ef410cea1ff6401d73c9d1e51d6e77bf7c53ce9cacf706c5f3c6470cbd2005"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "compiz-manager"
RDEPENDS:${PN} += "/bin/bash \
compiz \
util-linux"

inherit rpm
