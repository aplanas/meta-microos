SUMMARY = "Binary files of albatross"
DESCRIPTION = "Binary files of albatross"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn57089"

RPM_NAME = "texlive-albatross-bin-2023.20230311.svn57089-93.1.aarch64.rpm"
RPM_HASH = "b242789c9233853d2455b2f85a0d46260f512ef19d33803a3576515ca062bd277c8d449eaca5560c086d733d8cd4f70e619f9e6c993ab2b91b11e42e444bac3a"

RPROVIDES:${PN} += "texlive-albatross-bin"

RDEPENDS:${PN} += "texlive-albatross"

inherit rpm
