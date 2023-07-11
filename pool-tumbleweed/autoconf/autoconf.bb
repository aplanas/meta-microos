SUMMARY = "A GNU Tool for Automatically Configuring Source Code"
DESCRIPTION = "GNU Autoconf is a tool for configuring source code and makefiles. Using \
autoconf, programmers can create portable and configurable packages, \
because the person building the package is allowed to specify various \
configuration options. \
 \
You should install autoconf if you are developing software and would \
like to create shell scripts to configure your source code packages. \
 \
Note that the autoconf package is not required for the end user who may \
be configuring software with an autoconf-generated script; autoconf is \
only required for the generation of the scripts, not their use."
LICENSE = "GPL-3.0-or-later"

PV = "2.71"

RPM_NAME = "autoconf-2.71-2.4.noarch.rpm"
RPM_HASH = "f19265c2f39dc32b5e84ba10d7b9e6b11fbd72f92dfc947544b971cbccfae9c94a84dce67b5c4508a43a783760d31d09d3cde5987f46adf43f301e5eee996170"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "autoconf \
perl-Autom4te--C4che \
perl-Autom4te--ChannelDefs \
perl-Autom4te--Channels \
perl-Autom4te--Config \
perl-Autom4te--Configure-ac \
perl-Autom4te--FileUtils \
perl-Autom4te--General \
perl-Autom4te--Getopt \
perl-Autom4te--Request \
perl-Autom4te--XFile"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
info \
m4 \
perl-base"

inherit rpm
