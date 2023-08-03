SUMMARY = "Documentation for texlive-addfont"
DESCRIPTION = "This package includes the documentation for texlive-addfont"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.1svn58559"

RPM_NAME = "texlive-addfont-doc-2023.209.1.1svn58559-55.1.noarch.rpm"
RPM_HASH = "7b11a20c5187e249a38a247b399757206ca7c6fffe8151c5f26f29f100f17199164bf2b8e13474ad8f981976a0cb4595eebcc884e7ccb28e53c431e9996f2a27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-addfont-doc"

RDEPENDS:${PN} += ""

inherit rpm
