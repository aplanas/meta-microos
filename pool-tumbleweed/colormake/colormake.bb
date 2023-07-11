SUMMARY = "Colorize the make output"
DESCRIPTION = "A simple wrapper for making the output from make easier to read \
(more colorful), and errors easier to find in messy compilations. \
It was inspired by Micheal T. Babcock's excellent logcolorize program."
LICENSE = "GPL-2.0+"

PV = "0.9.20140503"

RPM_NAME = "colormake-0.9.20140503-3.25.noarch.rpm"
RPM_HASH = "c539477c2638feb4f47c1c6c00909f22846bb289abf8e348f157270cb4a042a485fbad0782ce4834a4ab506fe6fc1a970af4ca625b0f1e5ffe06f4bfff22085c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "colormake"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
