SUMMARY = "Support library required by Pocketsphinx"
DESCRIPTION = "CMU Sphinx toolkit is a speech recognition tool and has a number of packages for \
different tasks and applications."
LICENSE = "BSD-2-Clause & MIT"

PV = "0.8"

RPM_NAME = "sphinxbase-0.8-6.6.aarch64.rpm"
RPM_HASH = "77f873ab8548ffccc403d11944f1fdd97b5b5a8c820e973b5c67f606874b1227ca7b4ae375ed349bdff0cf2882799b04228704988acb3cc0e42ae8ca7d14d58e"

RPROVIDES:${PN} += "sphinxbase"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libsndfile.so.1 \
libsphinxad.so.0 \
libsphinxbase.so.1 \
update-alternatives"

inherit rpm
