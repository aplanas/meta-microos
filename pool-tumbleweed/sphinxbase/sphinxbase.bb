SUMMARY = "Support library required by Pocketsphinx"
DESCRIPTION = "CMU Sphinx toolkit is a speech recognition tool and has a number of packages for \
different tasks and applications."
LICENSE = "BSD-2-Clause & MIT"

PV = "0.8"

RPM_NAME = "sphinxbase-0.8-6.7.aarch64.rpm"
RPM_HASH = "69c63f28badef252d8bea9014fc57dfa22086bd63600a57cc0f4aeb30f3272e85fef25ae8f0fb519afadf4b724af0cf6fb7e2a66c089781fc9c614a5d4524d64"

RPROVIDES:${PN} += "sphinxbase"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libsndfile.so.1 \
libsphinxad.so.0 \
libsphinxbase.so.1 \
update-alternatives"

inherit rpm
