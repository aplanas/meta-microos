SUMMARY = "Variable ties made easier: much, much, much easier.."
DESCRIPTION = "This module adds the ability to quickly create new types of tie objects \
without creating a complete class. It does so in such a way as to try and \
make the programmers life easier when it comes to single-use ties that I \
find myself wanting to use from time-to-time. \
 \
The 'Tie::Simple' package is actually a front-end to other classes which \
really do all the work once tied, but this package does the dwimming to \
automatically figure out what you're trying to do. \
 \
I've tried to make this as intuitive as possible and dependent on other \
bits of Perl where I can to minimize the need for documentation and to make \
this extra, extra spiffy."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.04"

RPM_NAME = "perl-Tie-Simple-1.04-1.26.noarch.rpm"
RPM_HASH = "f075245819118c3779a4674a20ec9b71686f1d8a5186ca167220edfb900758345fb89bd0cd23b5e9337453bc49c368f209dc20529ce3310c1352a5b860705d0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Tie--Simple \
perl-Tie--Simple--Array \
perl-Tie--Simple--Handle \
perl-Tie--Simple--Hash \
perl-Tie--Simple--Scalar \
perl-Tie--Simple--Util \
perl-Tie-Simple"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
