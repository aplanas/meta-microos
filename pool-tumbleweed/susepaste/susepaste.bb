SUMMARY = "Script for using openSUSE paste"
DESCRIPTION = "A script for using the openSUSE paste service. \
You can paste either the file or input from stdin."
LICENSE = "GPL-3.0-only"

PV = "0.6"

RPM_NAME = "susepaste-0.6-6.2.noarch.rpm"
RPM_HASH = "ca56b36e4d0be21a830a9b000e87be9b0ffbe55d9327ab6c41f00c41e4b53a797f5b23b9ab3f184b61349c586f5727899827fba0fb72e8c84a6809bc821efbd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "susepaste"

RDEPENDS:${PN} += "/usr/bin/sh \
bash \
curl"

inherit rpm
