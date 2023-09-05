SUMMARY = "Runtime and development documentation for gsoap"
DESCRIPTION = "This subpackage contains the documentation for the gSOAP toolkit."
LICENSE = "SUSE-GPL-2.0+-with-openssl-exception"

PV = "2.8.130"

RPM_NAME = "gsoap-doc-2.8.130-1.1.noarch.rpm"
RPM_HASH = "7f97531ea62e85079b3b25c66a683e511948fcb5a5f431f0118045d4d70c57fcde2a9dbbae67668f2bddcc3941f1e0a5ac9ca611df3712e1f2f61605bb8e425e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gsoap-doc"

RDEPENDS:${PN} += ""

inherit rpm
