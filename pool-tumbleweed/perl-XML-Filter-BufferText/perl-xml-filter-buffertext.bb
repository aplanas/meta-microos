SUMMARY = "Filter to put all characters() in one event"
DESCRIPTION = "This is a very simple filter. One common cause of grief (and programmer \
error) is that XML parsers aren't required to provide character events in \
one chunk. They can, but are not forced to, and most don't. This filter \
does the trivial but oft-repeated task of putting all characters into a \
single event. \
 \
Note that this won't help you cases such as: \
 \
  <foo> blah <!-- comment --> phubar </foo> \
 \
In the above case, given the interleaving comment, there will be two \
'character()' events. This may be worked around in the future if there is \
demand for it. \
 \
An interesting way to use this filter, instead of telling users to use it, \
is to return it from your handler's constructor, already configured and \
all. That'll make the buffering totally transparent to them \
('XML::SAX::Writer' does that)."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.01"

RPM_NAME = "perl-XML-Filter-BufferText-1.01-9.27.noarch.rpm"
RPM_HASH = "7dfa7ecee236a54883951bea4a3b876e12f7e77438fbcec33c1d91d76e17b3ac330f7c9479c7830ed762abd0827ee18c9050b2b1baf7ae6dd3345d108fc0fddb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--Filter--BufferText \
perl-XML-Filter-BufferText"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-XML--SAX \
perl-XML--SAX--Base"

inherit rpm
