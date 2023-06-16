SUMMARY = "League Of Movable Type's 'Linden Hill' font family"
DESCRIPTION = "Linden Hill is a digital version of Frederic Goudy's Deepdene. The \
package includes roman and italic."
LICENSE = "OFL-1.1"

PV = "0.20121218"

RPM_NAME = "lomt-lindenhill-fonts-0.20121218-8.7.noarch.rpm"
RPM_HASH = "df6091279843f7b57eb21f6859daed1759fae33c5f2aa58b5807ee9f7487fb555a6382554ba033758b6b2d6c547dde7e9c4768776238dcb282cc899aa9a96777"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lomt-lindenhill-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
