SUMMARY = "Scripts and data for building API documentation"
DESCRIPTION = "The kapidox framework enables the generation of API documentation from \
Doxygen-formatted codde comments in a standard format and style."
LICENSE = "BSD-2-Clause"

PV = "5.106.0"

RPM_NAME = "kapidox-5.106.0-1.1.noarch.rpm"
RPM_HASH = "aab21092bd51e4eea80966e9851603a6e204d73bad58477922073af605423cd846c464fb7cb3caafd371f9309d40a6bbbd9e816220d0b7f859de323b0e033fe2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kapidox \
python3.10dist-kapidox \
python3dist-kapidox"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
doxygen \
graphviz \
graphviz-gd \
libqt5-qttools \
python-abi \
python3-Jinja2 \
python3-xml"

inherit rpm
