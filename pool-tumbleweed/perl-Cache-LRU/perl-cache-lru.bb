SUMMARY = "Simple, Fast Implementation of Lru Cache in Pure Perl"
DESCRIPTION = "Cache::LRU is a simple, fast implementation of an in-memory LRU cache in \
pure perl."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.04"

RPM_NAME = "perl-Cache-LRU-0.04-2.22.noarch.rpm"
RPM_HASH = "ee217bc0274b30944012bbb6540d6e58fa54e8202e9b7efb57987c71d5d01bfdb2870f521227553a8b1cfc3a7132494f66ae6f2dc832fd49b46e7780dacd1045"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Cache--LRU \
perl-Cache-LRU"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
