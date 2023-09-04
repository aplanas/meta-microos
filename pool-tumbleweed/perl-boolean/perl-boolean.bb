SUMMARY = "Boolean support for Perl"
DESCRIPTION = "Most programming languages have a native 'Boolean' data type. Perl does \
not. \
 \
Perl has a simple and well known Truth System. The following scalar values \
are false: \
 \
    $false1 = undef; \
    $false2 = 0; \
    $false3 = 0.0; \
    $false4 = ''; \
    $false5 = '0'; \
 \
Every other scalar value is true. \
 \
This module provides basic Boolean support, by defining two special \
objects: 'true' and 'false'."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.46"

RPM_NAME = "perl-boolean-0.46-1.25.noarch.rpm"
RPM_HASH = "b24b5baa61893526a17dbd26a50b57d9a5d9bd61c97a2911ea867ea42ec3cba0c0a743107ca601d340028f7072fe9369ec77f4bcebb36e84a3d932f9f7fbffdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-boolean"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
