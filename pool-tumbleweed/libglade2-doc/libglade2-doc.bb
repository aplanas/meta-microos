SUMMARY = "Documentation for the Glade library"
DESCRIPTION = "This package contains documentation and examples for the Glade library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.6.4"

RPM_NAME = "libglade2-doc-2.6.4-28.3.noarch.rpm"
RPM_HASH = "d28554fa70969b7697a6f4b5e93da779748af4661786c73d61a9068c58822f7c0393fd68583caa6b439feaf2a986601f4d9db6278bec79916ea989ad19c22418"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libglade2-doc"
RDEPENDS:${PN} += "libglade-2_0-0"

inherit rpm
