SUMMARY = "Module signature file manipulation"
DESCRIPTION = "*Module::Signature* adds cryptographic authentications to CPAN \
distributions, via the special _SIGNATURE_ file. \
 \
If you are a module user, all you have to do is to remember to run \
'cpansign -v' (or just 'cpansign') before issuing 'perl Makefile.PL' or \
'perl Build.PL'; that will ensure the distribution has not been tampered \
with. \
 \
Module authors can easily add the _SIGNATURE_ file to the distribution \
tarball; see NOTES below for how to do it as part of 'make dist'. \
 \
If you _really_ want to sign a distribution manually, simply add \
'SIGNATURE' to _MANIFEST_, then type 'cpansign -s' immediately before 'make \
dist'. Be sure to delete the _SIGNATURE_ file afterwards. \
 \
Please also see NOTES about _MANIFEST.SKIP_ issues, especially if you are \
using *Module::Build* or writing your own _MANIFEST.SKIP_. \
 \
Signatures made with Module::Signature prior to version 0.82 used the SHA1 \
algorithm by default. SHA1 is now considered broken, and therefore module \
authors are strongly encouraged to regenerate their _SIGNATURE_ files. \
Users verifying old SHA1 signature files will receive a warning."
LICENSE = "CC0-1.0 & (GPL-1.0-or-later | Artistic-1.0)"

PV = "0.88"

RPM_NAME = "perl-Module-Signature-0.88-1.8.noarch.rpm"
RPM_HASH = "d77f74ce8daaa55f89d22970c7eba28e0d896f3d6d965ab38aac7e911fda432c3e98068f2cb1435d3db9e887475857cc722adec3c17ec9eb8437498af4aa5150"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Signature \
perl-Module-Signature"

RDEPENDS:${PN} += "/usr/bin/perl \
gpg \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
