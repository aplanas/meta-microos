SUMMARY = "Simple, Fast Implementation of Lru Cache in Pure Perl"
DESCRIPTION = "Cache::LRU is a simple, fast implementation of an in-memory LRU cache in \
pure perl."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.04"

RPM_NAME = "perl-Cache-LRU-0.04-2.20.noarch.rpm"
RPM_HASH = "9e0eaccd6064c12f9293c762931837012ce299886c99da8738c0fe260dde869b0dff5f4abc1d1702ccea9f84ed822386ed6752e6b8d72ffcba133d9302abbc81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Cache--LRU \
perl-Cache-LRU"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
