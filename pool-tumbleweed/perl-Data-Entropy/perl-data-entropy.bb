SUMMARY = "Entropy (randomness) management"
DESCRIPTION = "This module maintains a concept of a current selection of entropy source. \
Algorithms that require entropy, such as those in the \
Data::Entropy::Algorithms manpage, can use the source nominated by this \
module, avoiding the need for entropy source objects to be explicitly \
passed around. This is convenient because usually one entropy source will \
be used for an entire program run and so an explicit entropy source \
parameter would rarely vary. There is also a default entropy source, \
avoiding the need to explicitly configure a source at all. \
 \
If nothing is done to set a source then it defaults to the use of Rijndael \
(AES) in counter mode (see the Data::Entropy::RawSource::CryptCounter \
manpage and the Crypt::Rijndael manpage), keyed using Perl's built-in \
'rand' function. This gives a data stream that looks like concentrated \
entropy, but really only has at most the entropy of the 'rand' seed. Within \
a single run it is cryptographically difficult to detect the correlation \
between parts of the pseudo-entropy stream. If more true entropy is \
required then it is necessary to configure a different entropy source."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.007"

RPM_NAME = "perl-Data-Entropy-0.007-1.25.noarch.rpm"
RPM_HASH = "af75f394eb66b31bb19a489f47e15c88eaaaefb0f51d45d17075e59bb3da1eef074d9d51176f6a0df837638625ded540d2b61ec7676a396abce8a331bfcccca3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Data--Entropy \
perl-Data--Entropy--Algorithms \
perl-Data--Entropy--RawSource--CryptCounter \
perl-Data--Entropy--RawSource--Local \
perl-Data--Entropy--RawSource--RandomOrg \
perl-Data--Entropy--RawSource--RandomnumbersInfo \
perl-Data--Entropy--Source \
perl-Data-Entropy"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Crypt--Rijndael \
perl-Data--Float \
perl-HTTP--Lite \
perl-Params--Classify \
perl-parent"

inherit rpm
