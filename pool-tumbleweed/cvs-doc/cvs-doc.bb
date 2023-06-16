SUMMARY = "Info pages and Open Source Development with CVS, 2nd Edition Book"
DESCRIPTION = "Info pages for cvs, an introduction to cvs \
(/usr/share/cvs/contrib/intro.doc) and the complete book 'Open Source \
Development with CVS, 2nd Edition'."
LICENSE = "GPL-2.0-only"

PV = "1.12.13"

RPM_NAME = "cvs-doc-1.12.13-2.7.noarch.rpm"
RPM_HASH = "df5051efddbedf795bd9f5a7f8017d7ef25ae86c2cfd555ffd46564344f5c27ea15b9ee015b3b4b49f0f9b2d973912bf456e584c6bebc05503e9008be783cd07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cvs-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
