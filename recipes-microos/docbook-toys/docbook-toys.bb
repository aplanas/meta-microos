SUMMARY = "DocBook Tools"
DESCRIPTION = "A shell script to convert SGML documents based on the DocBook DTD. \
 \
For usage information read: \
 \
/usr/share/doc/packages/docbook-toys/README"
LICENSE = "GPL-2.0+"

PV = "1.51.0"

RPM_NAME = "docbook-toys-1.51.0-438.15.noarch.rpm"
RPM_HASH = "1b995881967509145ad5ec3a5f86ac1beed668d10cdbba5a930407213bf8c84c0ee859888128b4aac0637ca58e28fca5192490bdae5b95f6b49b457f4880c0a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(docbook-toys) docbook-tools docbook-toys"
RDEPENDS:${PN} += "/bin/bash /bin/sh docbook-dsssl-stylesheets docbook_3 docbook_4 iso_ent openjade texlive-jadetex"

inherit rpm
