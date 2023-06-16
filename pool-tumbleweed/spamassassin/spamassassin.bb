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

RPM_NAME = "spamassassin-4.0.0-74.3.aarch64.rpm"
RPM_HASH = "bad243062711b04b632932f550cb3c4457cd9022be106dbfc5f5a7dfb3a0e41cabfa3ba99677c1d2bc1aba40c3e257d886f86d7edd39e76ee9d3b407819d8240"

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
