SUMMARY = "League Of Movable Type's 'Knewave' font family"
DESCRIPTION = "Knewave is a bold, painted font face."
LICENSE = "OFL-1.1"

PV = "0.20121218"

RPM_NAME = "lomt-knewave-fonts-0.20121218-8.7.noarch.rpm"
RPM_HASH = "66d2ca9797dabe8633cd702a01ede60e408dc9c80222d6905b4856f87537de921ddbc08aa9c488c8d4fc556908724fbab384afe0ee9a9d90ba60363f1936306b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lomt-knewave-fonts"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
