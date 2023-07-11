SUMMARY = "Base class to treat unhandled method calls as errors"
DESCRIPTION = "It's possible to accidentally inherit an AUTOLOAD method. Often this \
will happen if a class somewhere in the chain uses AutoLoader or \
defines one of their own. This can lead to confusing error messages \
when method lookups fail. \
 \
Sometimes you want to avoid this accidental inheritance.  In that case, \
inherit from Class::WhiteHole. All unhandled methods will produce \
normal Perl error messages. \
 \
 \
 \
Authors: \
-------- \
    Michael G Schwern <schwern@pobox.com>"
LICENSE = "Artistic-1.0"

PV = "0.04"

RPM_NAME = "perl-Class-WhiteHole-0.04-228.30.aarch64.rpm"
RPM_HASH = "77e69f5c49ac8c3f1911f1d68737c4b1104a9f7872db31e9a22a81a4e23e43ddc2295b947715df768c095bef12dcdd466b6255a7df7d24c8755a3309f4ee9b2d"

RPROVIDES:${PN} += "perl-Class--WhiteHole \
perl-Class-WhiteHole"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
