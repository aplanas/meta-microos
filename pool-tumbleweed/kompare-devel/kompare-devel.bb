SUMMARY = "Development files for the File Comparator"
DESCRIPTION = "Development files for the File Comparator package"
LICENSE = "GPL-2.0-only & GFDL-1.2-only"

PV = "23.08.0"

RPM_NAME = "kompare-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "de5d1da84a31b2fe6dea583fc9e20e781a8753ab34390293a75463e707e5c42318acdc2149445e06ed1fe990c2edcc5224072365f7b93544ee42e78c03d1aba7"

RPROVIDES:${PN} += "kompare-devel"

RDEPENDS:${PN} += "kompare"

inherit rpm
