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

RPM_NAME = "spamassassin-4.0.0-74.6.aarch64.rpm"
RPM_HASH = "e1112e5d55fab6b11d1a6c793b9b4754775dcba7ffc26e43fedcf1e71cd05145c9f88218d04422e2f4977bc3c5a29b8703c5f197dd3e0e4805493a1d2ae0c429"

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
