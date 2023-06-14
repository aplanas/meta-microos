SUMMARY = "Utilities for creating customized installation sources"
DESCRIPTION = "Utilities supporting autoinstallation and creation of customized \
installation sources. \
 \
Have a look at https://en.opensuse.org/Inst-source-utils for a detailed \
description of each script."
LICENSE = "GPL-2.0-or-later"

PV = "2021.09.09"

RPM_NAME = "inst-source-utils-2021.09.09-1.4.noarch.rpm"
RPM_HASH = "63b42c62719859ef9cf37180cf51caf3a69b83ce449457dbe156bf1100c671cb9ce57dcf9a4a9cac017da1778d28581bcdd3d491005fdbdc0a3bdef828e559bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "autoyast2-utils \
inst-source-utils \
perl-ABStructured \
perl-ABStructured--saxparser \
perl-ABXML \
perl-RPMQ"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/perl \
gpg2 \
perl-XML-Parser"

inherit rpm
