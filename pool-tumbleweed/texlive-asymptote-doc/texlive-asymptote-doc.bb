SUMMARY = "Documentation for texlive-asymptote"
DESCRIPTION = "This package includes the documentation for texlive-asymptote"
LICENSE = "LGPL-3.0-or-later"

PV = "2023.209.2.85svn65952"

RPM_NAME = "texlive-asymptote-doc-2023.209.2.85svn65952-54.1.noarch.rpm"
RPM_HASH = "bc6c0038f820ed9dfac08bea53d2f284ea9716d48b4ea3561b59b111dbdcafa93b50c83541f606dc3ebd38ef8c1cbf2a09d9115c4472be7f41a578f3b815983a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-asy.1 \
man-xasy.1 \
texlive-asymptote-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
