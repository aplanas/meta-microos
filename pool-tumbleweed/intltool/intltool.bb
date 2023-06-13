SUMMARY = "Internationalization Tool Collection"
DESCRIPTION = "Some scripts to support translators working on GNOME and similar \
programs. Data available in XML files (.oaf, .desktop, .sheet, and \
more) can be extracted into PO files. After translation, the new \
information is written back into the XML files."
LICENSE = "GPL-2.0-or-later"

PV = "0.51.0"

RPM_NAME = "intltool-0.51.0-7.11.noarch.rpm"
RPM_HASH = "b454e890f8e614a305ac6b8ff7e71a24a0ea93386515523454abc71d69b2d3f5b2f63d24802a9942f44e0f6c3bc1892a02c7acd7442f890d6773912dd70f1a19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "intltool \
xml-i18n-tools"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
gettext-tools \
perl-XML-Parser"

inherit rpm
