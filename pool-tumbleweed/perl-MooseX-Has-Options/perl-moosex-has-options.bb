SUMMARY = "Succinct options for Moose"
DESCRIPTION = "This module provides a succinct syntax for declaring options for the Moose \
manpage attributes."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.003"

RPM_NAME = "perl-MooseX-Has-Options-0.003-5.26.noarch.rpm"
RPM_HASH = "e00bb54f6288278bb3a28c42acaf382a8835954ca0d6f2e0c618fee5b469f7eaa8a3a6900e8de088da5c3e0fc82aaeb5c07e280fa9db7245df8fac2d083c4a8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Has--Options \
perl-MooseX--Has--Options--Handler--Accessors \
perl-MooseX--Has--Options--Handler--NativeTypes \
perl-MooseX--Has--Options--Handler--NoInit \
perl-MooseX-Has-Options"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Class--Load \
perl-List--MoreUtils \
perl-Package--Stash \
perl-String--RewritePrefix"

inherit rpm
