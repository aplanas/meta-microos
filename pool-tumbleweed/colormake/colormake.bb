SUMMARY = "Colorize the make output"
DESCRIPTION = "A simple wrapper for making the output from make easier to read \
(more colorful), and errors easier to find in messy compilations. \
It was inspired by Micheal T. Babcock's excellent logcolorize program."
LICENSE = "GPL-2.0+"

PV = "0.9.20140503"

RPM_NAME = "colormake-0.9.20140503-3.24.noarch.rpm"
RPM_HASH = "47c466a2997409a1cac2cbeb9b5acb8d5599221ab09a5c19fbf3785436614c1e30fb4d17b1ffc637154de5a3afe3626f0fa081fc714c0f356d4df956fa75085d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "colormake"

RDEPENDS:${PN} += "/bin/bash \
/usr/bin/perl \
perl--MODULE-COMPAT-5.36.0"

inherit rpm
