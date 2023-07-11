SUMMARY = "YaST2 - Welsh Translations"
DESCRIPTION = "YaST2 - Welsh translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-cy-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "bc63f89437a9f77789505f56799ddf7c53fe1818ae4c11b83ea4ccdef52534c3a800561da9cfa2582b7871743b53eea66b7b63b9d4d879d0b68a311990096ade"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-cy \
yast2-trans-cy"

RDEPENDS:${PN} += ""

inherit rpm
