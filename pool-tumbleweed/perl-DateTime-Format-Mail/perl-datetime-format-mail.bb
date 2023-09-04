SUMMARY = "Convert between DateTime and RFC2822/822 formats"
DESCRIPTION = "RFCs 2822 and 822 specify date formats to be used by email. This module \
parses and emits such dates. \
 \
RFC2822 (April 2001) introduces a slightly different format of date than \
that used by RFC822 (August 1982). The main correction is that the \
preferred format is more limited, and thus easier to parse \
programmatically. \
 \
Despite the ease of generating and parsing perfectly valid RFC822 and \
RFC2822 people still get it wrong. So this module provides four things for \
those handling mail dates: \
 \
* 1 \
 \
A strict parser that will only accept RFC2822 dates, so you can see where \
you're right. \
 \
* 2 \
 \
A strict formatter, so you can generate the right stuff to begin with. \
 \
* 3 \
 \
A _loose_ parser, so you can take the misbegotten output from other \
programs and turn it into something useful. This includes various minor \
errors as well as some somewhat more bizarre mistakes. The file \
_t/sample_dates_ in this module's distribution should give you an idea of \
what's valid, while _t/invalid.t_ should do the same for what's not. Those \
regarded as invalid are just a bit *too* strange to allow. \
 \
* 4 \
 \
Interoperation with the rest of the DateTime suite. These are a collection \
of modules to handle dates in a modern and accurate fashion. In particular, \
they make it trivial to parse, manipulate and then format dates. Shifting \
timezones is a doddle, and converting between formats is a cinch. \
 \
As a future direction, I'm contemplating an even stricter parser that will \
only accept dates with no obsolete elements."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.403"

RPM_NAME = "perl-DateTime-Format-Mail-0.403-1.17.noarch.rpm"
RPM_HASH = "fdd7b9c27d87fd67c937e37995801b574a0b359f8a9bb406d5b30ec3bc12622fbcc87df99d0c4235e5c20bca448abb38ae311dd21905ef2d7e1674463de90354"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DateTime--Format--Mail \
perl-DateTime-Format-Mail"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-DateTime \
perl-Params--Validate"

inherit rpm
