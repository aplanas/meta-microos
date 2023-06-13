SUMMARY = "Common files for XApp desktop applications"
DESCRIPTION = "This project gathers the components which are common to multiple \
desktop environments and required to implement cross-DE solutions. \
 \
This package includes files that are shared between several XApp \
applications (i18n files and configuration schemas)."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.1"

RPM_NAME = "xapps-common-2.4.1-1.3.noarch.rpm"
RPM_HASH = "f1733c9e780baa030e26e9e1f4f905ac72da160686b326c772a89813171001641e36b29fa27e15a030980c3bc9af2f8424aae772b360154172287b86956cfce0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xapps-common"

RDEPENDS:${PN} += "/bin/bash"

inherit rpm
