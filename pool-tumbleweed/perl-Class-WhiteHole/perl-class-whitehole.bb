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

RPM_NAME = "perl-Class-WhiteHole-0.04-228.31.aarch64.rpm"
RPM_HASH = "7b6425d3f94e867de056d074b550b61461f605ec4e41703175278fab68f97d734e1dd0f87bdecec556588747cb6805f99224a1985ce187a8af28bbb1645c3b57"

RPROVIDES:${PN} += "perl-Class--WhiteHole \
perl-Class-WhiteHole"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
