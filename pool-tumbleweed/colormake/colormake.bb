SUMMARY = "Colorize the make output"
DESCRIPTION = "A simple wrapper for making the output from make easier to read \
(more colorful), and errors easier to find in messy compilations. \
It was inspired by Micheal T. Babcock's excellent logcolorize program."
LICENSE = "GPL-2.0+"

PV = "0.9.20140503"

RPM_NAME = "colormake-0.9.20140503-3.26.noarch.rpm"
RPM_HASH = "f4cd9a61af61f7538acc748c4e77f6ec68d9abf1a346f77fc74083356725914b2bb09164ee8a2f6e0e7a9a485503d7de1b53c2b46c2da0a81c70beb3f53ee46a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "colormake"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
