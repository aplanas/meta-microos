SUMMARY = "Python interface to libvoikko"
DESCRIPTION = "Libvoikko is a library of free natural language processing tools. It \
aims to provide support for languages that are not well served by \
other existing free linguistic tools. \
 \
This package contains a Python interface to libvoikko. This module \
can be used to perform various natural language analysis tasks on text."
LICENSE = "GPL-2.0-or-later"

PV = "4.3.2"

RPM_NAME = "python3-libvoikko-4.3.2-2.1.noarch.rpm"
RPM_HASH = "58f0286781d5583ebec1dd057222628c13210e27ddf53ca5a66de5b798c6222850c043ee21bf27e0e27cf62305dc837b4a9a93ab3d63b6a580a1c915b68a185c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-libvoikko"

RDEPENDS:${PN} += "libvoikko1 \
python-abi"

inherit rpm
