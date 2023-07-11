SUMMARY = "Theme for Terminology"
DESCRIPTION = "A old openSUSE theme for Terminology"
LICENSE = "BSD-2-Clause & LGPL-2.1-only & CC-BY-SA-3.0"

PV = "20220219.1.26"

RPM_NAME = "terminology-theme-openSUSE-oliveleaf-20220219.1.26-1.6.noarch.rpm"
RPM_HASH = "2d8813069b8ebd8a9355127860daf49d421f292465c2732df9c0a56632235f6702695759a0e99708b8b3b7bdd7e1ef04c59030355631046e411ca29ce8dcdedc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "terminology-theme \
terminology-theme-openSUSE-oliveleaf"

RDEPENDS:${PN} += "terminology"

inherit rpm
