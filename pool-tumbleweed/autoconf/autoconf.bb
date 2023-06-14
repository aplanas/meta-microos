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

RPM_NAME = "autoconf-2.71-2.3.noarch.rpm"
RPM_HASH = "1cf7d2d33fb931150e2198bdbf86b419e0e78b7672dda2569c24e77b43e0fbb5ace37dff206c21cbd21f3ae0b1e7e7b35cbd0107152daf44c541d5b70004ed52"
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

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
info \
m4 \
perl-base"

inherit rpm
