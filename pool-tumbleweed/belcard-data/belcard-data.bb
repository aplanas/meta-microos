SUMMARY = "Belcard data files"
DESCRIPTION = "Belcard is a C++ library to manipulate the vCard standard format files. \
 \
This package contains data files such as belr grammar."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.98"

RPM_NAME = "belcard-data-5.2.98-1.1.noarch.rpm"
RPM_HASH = "a41d3d77c4fdb0ff5039d4042046f08d63f732ffb937d306968f6853661b7041bf8984f3c2a88300fc9d493a6d0d5fff0d04113953a8ac8e6e16d43f790366a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "belcard-data"

RDEPENDS:${PN} += "libbelcard1"

inherit rpm
