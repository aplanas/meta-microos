SUMMARY = "Development documents of libfprint"
DESCRIPTION = "This package contains the development documents for libfprint."
LICENSE = "LGPL-2.1-or-later"

PV = "1.94.5+tod1"

RPM_NAME = "libfprint-doc-1.94.5+tod1-1.3.noarch.rpm"
RPM_HASH = "a6f155a2eb38b211f0884e2eab1ba66e95f196f7948e1197d38cdc022a89b9a84e670a5ca42ced6ce0a12e098be53bbfccf5bbb452299c24b1bc95a9c751834c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libfprint-doc"

RDEPENDS:${PN} += ""

inherit rpm
