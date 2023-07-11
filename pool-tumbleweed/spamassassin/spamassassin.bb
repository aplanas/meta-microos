SUMMARY = "Extensible email filter which is used to identify spam"
DESCRIPTION = "spamassassin adds a header line that shows if the mail has been \
determined spam or not. This way, you can decide what to do with the \
mail within the scope of your own filtering rules in your MUA (Mail \
User Agent, your mail program) or your LDA (Local Delivery Agent). \
 \
See the files in the documentation directory \
/usr/share/doc/packages/spamassassin/ for more information on how to \
use the filter."
LICENSE = "Apache-2.0"

PV = "4.0.0"

RPM_NAME = "spamassassin-4.0.0-74.5.aarch64.rpm"
RPM_HASH = "48b31c7d7f91b899bfd4f75392ed36330ae80bf9dca87b16632ed5c2543818e3b4a28f62e6412def5a7dd20ed689db5c9a01baab8918435718f6c40d9588b462"

RPROVIDES:${PN} += "spamassassin"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/sh \
/usr/bin/touch \
fillup \
perl-Archive--Tar \
perl-Error \
perl-IO--Zlib \
perl-LWP \
perl-Mail--SpamAssassin \
perl-Net--Server--PreForkSimple \
re2c \
spamassassin-spamc"

inherit rpm
