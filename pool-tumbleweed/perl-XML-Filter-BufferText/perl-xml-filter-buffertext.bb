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

RPM_NAME = "perl-XML-Filter-BufferText-1.01-9.26.noarch.rpm"
RPM_HASH = "0de3a24b5e741803d32f7d599c355cac3d47657d75e7a749a9cf34952269245d5568adf3e8d7122390e016e6785bec1e634b37b8a13407aad1e2d70b477ea253"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(XML::Filter::BufferText) \
perl-XML-Filter-BufferText"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(XML::SAX) \
perl(XML::SAX::Base)"

inherit rpm
