SUMMARY = "Path::Class type library for Mouse"
DESCRIPTION = "MouseX::Types::Path::Class creates common Mouse types, coercions and option \
specifications useful for dealing with Path::Class objects as Mouse \
attributes. \
 \
Coercions (see Mouse::Util::TypeConstraints) are made from both 'Str' and \
'ArrayRef' to both Path::Class::Dir and Path::Class::File objects. If you \
have MouseX::Getopt installed, the Getopt option type ('=s') will be added \
for both Path::Class::Dir and Path::Class::File."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.07"

RPM_NAME = "perl-MouseX-Types-Path-Class-0.07-4.21.noarch.rpm"
RPM_HASH = "2fcd8c7790dca322db4438b705238f78a9e2fea7cc036ee6df98faec2cc1c7f920db2167ea4215de191b5e313bd59656719322f236fb0b8ef71a6648e50bbcae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MouseX--Types--Path--Class \
perl-MouseX-Types-Path-Class"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Mouse \
perl-MouseX--Types \
perl-Path--Class"

inherit rpm
