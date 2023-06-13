SUMMARY = "Generated class documentation for ccrtp"
DESCRIPTION = "Generated class documentation for the ccrtp library from header \
files, html browsable."
LICENSE = "SUSE-GPL-2.0+-with-openssl-exception"

PV = "2.1.2"

RPM_NAME = "ccrtp-doc-2.1.2-2.27.noarch.rpm"
RPM_HASH = "23b5b4ba14313920db0371344862e0291570819a9559c3478e54a9ff0d4e9f26a58e72936d64b16faba64ae95cbbe54996aff3a46b9b83a67a0153a3b42edec0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ccrtp-doc"

RDEPENDS:${PN} += ""

inherit rpm
