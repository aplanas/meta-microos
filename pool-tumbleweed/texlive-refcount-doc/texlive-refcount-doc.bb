SUMMARY = "Documentation for texlive-refcount"
DESCRIPTION = "This package includes the documentation for texlive-refcount"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.6svn53164"

RPM_NAME = "texlive-refcount-doc-2023.209.3.6svn53164-54.1.noarch.rpm"
RPM_HASH = "387a0ce4676e218f99836e2f436c10f4e2c13fb710eabeb9dd76a2d4129290e2226618b0c0372ff1e0f72db883c64bc96407b1489da96a6f964500b57b8388b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-refcount-doc"

RDEPENDS:${PN} += ""

inherit rpm
