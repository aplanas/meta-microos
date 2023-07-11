SUMMARY = "Generated class documentation for ccrtp"
DESCRIPTION = "Generated class documentation for the ccrtp library from header \
files, html browsable."
LICENSE = "SUSE-GPL-2.0+-with-openssl-exception"

PV = "2.1.2"

RPM_NAME = "ccrtp-doc-2.1.2-2.28.noarch.rpm"
RPM_HASH = "9a3dc3c75dfd605dd2733605b5670c15d5814d6481c83370bbb4bf48a6a9aa0e636f09416be8534feb384b1b942b7d105d5bdbaa64087a7c51d0db339c4a1b10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ccrtp-doc"

RDEPENDS:${PN} += ""

inherit rpm
