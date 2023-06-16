SUMMARY = "DocBook-to-Texinfo Converter"
DESCRIPTION = "A new tool based on Perl modules."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.8"

RPM_NAME = "docbook2x-0.8.8-127.14.aarch64.rpm"
RPM_HASH = "765c931266854ff051f1ec58554d5af21e9b4cbef9af987695c51ceeaf590cf1f5c968b956e66f6e6a14a33a021e17c27cb4757447bb893c95acddaaf26fb076"

RPROVIDES:${PN} += "config-docbook2x \
db2x \
docbook2X \
docbook2x"

RDEPENDS:${PN} += "/usr/bin/edit-xml-catalog \
/usr/bin/perl \
/usr/bin/sgml-register-catalog \
/usr/bin/sh \
/usr/bin/xmlcatalog \
awk \
docbook-4 \
grep \
ld-linux-aarch64.so.1 \
libc.so.6 \
openjade \
opensp \
perl-URI \
perl-XML-DOM \
perl-XML-Parser \
perl-XML-RegExp \
perl-XML-SAX \
perl-libwww-perl \
sed \
sgml-skel \
tidy"

inherit rpm
