SUMMARY = "Perl Module for Building Dom Level 1 Compliant Document Structures"
DESCRIPTION = "This module extends the XML::Parser module by Clark Cooper. The XML::Parser \
module is built on top of XML::Parser::Expat, which is a lower level \
interface to James Clark's expat library. \
 \
XML::DOM::Parser is derived from XML::Parser. It parses XML strings or \
files and builds a data structure that conforms to the API of the Document \
Object Model as described at http://www.w3.org/TR/REC-DOM-Level-1. See the \
XML::Parser manpage for other available features of the XML::DOM::Parser \
class. Note that the 'Style' property should not be used (it is set \
internally.) \
 \
The XML::Parser _NoExpand_ option is more or less supported, in that it \
will generate EntityReference objects whenever an entity reference is \
encountered in character data. I'm not sure how useful this is. Any \
comments are welcome. \
 \
As described in the synopsis, when you create an XML::DOM::Parser object, \
the parse and parsefile methods create an _XML::DOM::Document_ object from \
the specified input. This Document object can then be examined, modified \
and written back out to a file or converted to a string. \
 \
When using XML::DOM with XML::Parser version 2.19 and up, setting the \
XML::DOM::Parser option _KeepCDATA_ to 1 will store CDATASections in \
CDATASection nodes, instead of converting them to Text nodes. Subsequent \
CDATASection nodes will be merged into one. Let me know if this is a \
problem. \
 \
When using XML::Parser 2.27 and above, you can suppress expansion of \
parameter entity references (e.g. %pent;) in the DTD, by setting \
_ParseParamEnt_ to 1 and _ExpandParamEnt_ to 0. See Hidden Nodes for \
details. \
 \
A Document has a tree structure consisting of _Node_ objects. A Node may \
contain other nodes, depending on its type. A Document may have Element, \
Text, Comment, and CDATASection nodes. Element nodes may have Attr, \
Element, Text, Comment, and CDATASection nodes. The other nodes may not \
have any child nodes. \
 \
This module adds several node types that are not part of the DOM spec \
(yet.) These are: ElementDecl (for <!ELEMENT ...> declarations), \
AttlistDecl (for <!ATTLIST ...> declarations), XMLDecl (for <?xml ...?> \
declarations) and AttDef (for attribute definitions in an AttlistDecl.)"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.46"

RPM_NAME = "perl-XML-DOM-1.46-1.4.noarch.rpm"
RPM_HASH = "6cc5b3b1b0cdab2ceecac7901118858e4da257d23097fa494e7d6f2ad84888f3f5cdb44516e0c0fbfbcb9044b57201920e265f6127a6f140387152f5fb82d08b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--DOM \
perl-XML--DOM--AttDef \
perl-XML--DOM--AttlistDecl \
perl-XML--DOM--Attr \
perl-XML--DOM--CDATASection \
perl-XML--DOM--CharacterData \
perl-XML--DOM--Comment \
perl-XML--DOM--DOMException \
perl-XML--DOM--DOMImplementation \
perl-XML--DOM--Document \
perl-XML--DOM--DocumentFragment \
perl-XML--DOM--DocumentType \
perl-XML--DOM--Element \
perl-XML--DOM--ElementDecl \
perl-XML--DOM--Entity \
perl-XML--DOM--EntityReference \
perl-XML--DOM--NamedNodeMap \
perl-XML--DOM--Node \
perl-XML--DOM--NodeList \
perl-XML--DOM--Notation \
perl-XML--DOM--Parser \
perl-XML--DOM--PerlSAX \
perl-XML--DOM--PrintToFileHandle \
perl-XML--DOM--PrintToString \
perl-XML--DOM--ProcessingInstruction \
perl-XML--DOM--Text \
perl-XML--DOM--XMLDecl \
perl-XML--Handler--BuildDOM \
perl-XML--Parser--Dom \
perl-XML--XQL--Node \
perl-XML-DOM"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-LWP--UserAgent \
perl-XML--Parser \
perl-XML--Parser--PerlSAX \
perl-XML--RegExp"

inherit rpm
