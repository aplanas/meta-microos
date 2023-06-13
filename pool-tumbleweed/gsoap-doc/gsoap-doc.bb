SUMMARY = "Runtime and development documentation for gsoap"
DESCRIPTION = "This subpackage contains the documentation for the gSOAP toolkit."
LICENSE = "SUSE-GPL-2.0+-with-openssl-exception"

PV = "2.8.127"

RPM_NAME = "gsoap-doc-2.8.127-1.1.noarch.rpm"
RPM_HASH = "95b802468101137d6fce841b661a79329f6f8ecd8ed29e572da61cf5f813facf37b34ca89bd625cef6e22722ca4f71c7740b84a448c7ccf9d0ffade585dad0d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gsoap-doc"

RDEPENDS:${PN} += ""

inherit rpm
