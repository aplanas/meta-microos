SUMMARY = "Simple sets of strings"
DESCRIPTION = "Set::Tiny is a thin wrapper around regular Perl hashes to perform often \
needed set operations, such as testing two sets of strings for equality, or \
checking whether one is contained within the other. \
 \
For a more complete implementation of mathematical set theory, see \
Set::Scalar. For sets of arbitrary objects, see Set::Object."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.04"

RPM_NAME = "perl-Set-Tiny-0.04-1.11.noarch.rpm"
RPM_HASH = "d456245d7e85d2e1e643d0f2cf2bfdc1e35156c1d3cb0ef2919b29a0316980eb68b08af01e81baa5979c4093ff704e4700a289707cc2d75387792b774965547b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Set::Tiny) \
perl-Set-Tiny"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
