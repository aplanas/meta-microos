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

RPM_NAME = "autoconf-el-2.71-2.2.noarch.rpm"
RPM_HASH = "fc41724f86896ceb0de3b2da20db4e09d421da5b2e3a8bcda874b3b4be3768e1880b7889184deabb8c622d2a13095daea19d8e28ef363f1fde7f5571b3dd3950"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "autoconf-el"

RDEPENDS:${PN} += ""

inherit rpm
